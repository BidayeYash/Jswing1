import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Dashboard extends JFrame {
	JMenuBar bar;
	JMenu menu1,menu2,menu3,menu4;
	JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9;
	
	public Dashboard() {
		setLayout(new FlowLayout());
		bar=new JMenuBar();
		menu1=new JMenu("Employee");
		menu2=new JMenu("Employee Details");
		menu3=new JMenu("Accounts");
		menu4=new JMenu("utilities");
		item1=new JMenuItem("Add");
		item1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Add();
				
				
			}
		});
		item2=new JMenuItem("Update");
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Update();
				
			}
		});
		item3=new JMenuItem("delete");
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Delete();
				
			}
		} );
		item4=new JMenuItem("Show Employee");
		item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Entered Successfully");
				new ShowEmployee();
			}
		});
		item5=new JMenuItem("Search Employee ");
		item6=new JMenuItem("Show Employee Slaray");
		item7=new JMenuItem("Help");
		item8=new JMenuItem("Thought Of the Day");
		item9=new JMenuItem("Exit");
		
		
		
		
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		bar.add(menu4);
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu2.add(item4);
		menu2.add(item5);
		menu3.add(item6);
		menu4.add(item7);
		menu4.add(item8);
		menu4.add(item9);
		add(bar);
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Dashboard();
	}

}
