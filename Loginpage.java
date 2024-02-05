import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Loginpage extends JFrame{
	JLabel label1,label2;
	JTextField field1,field2;
	JButton button1,button2;
	public Loginpage() {
		setLayout (new FlowLayout());
		label1 =new JLabel("Username");
		field1=new JTextField(10);
		label2 =new JLabel("Pasword");
		field2=new JTextField(10);
		button1=new JButton("Login");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (field1.getText().equals("admin")&&field2.getText().equals("admin")) {
					System.out.println("Login Successfully");
					new Dashboard();
					
				} else {
System.out.println("Invalid Ceredintial");
				}
				
			}
		});
		button2= new JButton("Reset");
		
		
		
		
		
		
		add(label1);
		
		add(field1);
		add(label2);
		add(field2);
		add(button1);
		add(button2);
	setSize(400, 400);
	setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Loginpage();
	}

}
