import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class polynomialGUI extends JFrame{
	private JTextField jtfA=new JTextField();
	private JTextField jtfB=new JTextField();
	private JTextField jtfScreen1=new JTextField();
	private JTextField jtfScreen2=new JTextField();

	private JButton jbtPlus = new JButton("+");
	private JButton jbtMinus = new JButton("-");
	private JButton jbtclear = new JButton("clear");
	private JButton jbtstep = new JButton("step");

	public polynomialGUI(){
		JPanel p1=new JPanel(new GridLayout(2,2));
		p1.add(new JLabel("多項式1(A=)"));
		p1.add(jtfA);
		p1.add(new JLabel("多項式1(B=)"));
		p1.add(jtfB);
		JPanel pb2=new JPanel(new GridLayout(1,4));
		pb2.add(jbtPlus);
		pb2.add(jbtMinus);
		pb2.add(jbtclear);
		pb2.add(jbtstep);
		JPanel PScreen = new JPanel(new GridLayout(2,2));
		PScreen.add(new JLabel("結果:"));
		PScreen.add(jtfScreen1);
		PScreen.add(new JLabel("處理過程:"));
		PScreen.add(jtfScreen2);
		jtfScreen1.setEditable(false);
		jtfScreen2.setEditable(false);
		
		add(p1,BorderLayout.NORTH);
		add(pb2,BorderLayout.CENTER);
		add(PScreen,BorderLayout.SOUTH);
		
		jbtPlus.addActionListener(new ButtonListener());
		jbtMinus.addActionListener(new ButtonListener());
		jbtclear.addActionListener(new ButtonListener());
		jbtstep.addActionListener(new ButtonListener());
		
	}
	public static void main(String[] args) {
		polynomialGUI frame = new  polynomialGUI();
		frame.setTitle("多項式相加/相減");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set the frame size
		frame.setSize(800, 800);
		//set the frame visible
		frame.setVisible(true);
		}
	
	
	
}

