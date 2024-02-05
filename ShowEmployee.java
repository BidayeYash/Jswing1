import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ShowEmployee extends JFrame {

	JTable table;
	public ShowEmployee() {
		
setLayout(new FlowLayout());

    Object [][] data= {{01,"Sushant",12000,"Bankok"},
    		{02,"Yash",12000,"Thailand"},
    		{03,"Indar",12000,"UP"},
    		{04,"Gulzar",12000,"Pakistan"}};
    

String	[]coloumnnaame= {"Id","Name","Salary","City"};




		
 	DefaultTableModel model=new DefaultTableModel(data,coloumnnaame);
		
 	table =new JTable(model);
 			add(new JScrollPane(table));
 			setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(500,400);
	setVisible(true);
	
	
	}
}
