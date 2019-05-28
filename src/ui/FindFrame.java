package ui;

import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Entity.Plant;
import MySql.FindSql;

public class FindFrame extends JFrame implements ActionListener{
	private Plant plant = new Plant();
	
	private JButton but_find = new JButton("查询");
	private JButton but_change = new JButton("");
	private JButton but_return = new JButton("返回");
	private JButton but_topFind = new JButton("高级查询");
	private JLabel startlab = new JLabel  ("起点:");
	private JLabel endlab = new JLabel   ("终点:");	
	private JLabel lab_today = new JLabel("");
	JLabel timelab = new JLabel("出发日期:");
	Time today = new Time();
	private JTextField startText = new JTextField(10);//起点条
	private JTextField endText = new JTextField(20);//终点条
	private JTextField Text_time = new JTextField(10);//日期条
	private Plant[] p= {plant};
	    Integer []startTime = {1,2,3,4,5,6,7,8,9,10,11,12};
	    JComboBox mon = new JComboBox(startTime);
	private JLabel infoLab = new JLabel(" ");//提示条
	        JPanel find_Panel = new JPanel();
	    
	    FindFrame(){
	   
	    find_Panel.setLayout(null); 
		startlab.setBounds(61, 66, 54, 15);
		find_Panel.add(startlab);

		startText .setBounds(104, 63, 93, 21);
		find_Panel.add(startText);


		find_Panel.add(endlab);
		endlab.setBounds(280, 66, 54, 15);
		
		endText.setBounds(320, 63, 93, 22);
	    find_Panel.add(endText);
		

		find_Panel.add(timelab);
		timelab.setBounds(61, 96, 204, 15);
		

		mon.setBounds(302, 96, 60, 22);
		find_Panel.add(mon);
		
		but_find.setIcon(new ImageIcon("C:\\Users\\凉古\\Desktop\\uiairplane\\查询1.png"));
		but_find.setBounds(120,152, 103, 30);
		find_Panel.add(but_find);
		
		but_return.setBounds(253, 152, 100, 30);
		find_Panel.add(but_return);
		//今天日期标签
		lab_today.setText(today.getDate());
		lab_today.setBounds(65, 5, 150, 30);
		find_Panel.add(lab_today);
		//日期text
		find_Panel.add(Text_time);
		Text_time.setBounds(120, 96, 120, 20);
		//高级查询
		but_topFind.setBounds(305, 5, 100, 30);
		but_topFind.setContentAreaFilled(false);
		find_Panel.add(but_topFind);
		//转换按钮
		 but_change.setIcon(new ImageIcon("C:\\Users\\凉古\\Desktop\\uiairplane\\互换.png"));	
		 but_change.setBounds(220, 63, 40, 20);
		 but_change.setContentAreaFilled(false);
		 find_Panel.add(but_change);

		add(find_Panel);
		pack();
		setLocation(300,200);
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("查询");
		addListener();
		
	    }
	    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==but_find)
	    		{
	    		dispose();
	    		//从数据库里搜符合出发日期的
	    		
	    	/*	try {
	    			sentFind();
			    	FindSql sql=new FindSql(plant);
					p =sql.getPlant();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
	    	    new FindResultsFrame(p);}
	    	if(e.getSource()==but_topFind) {//高级查询面板
	    		
	    	}
	    	    
	    } 
	    public void addListener() {
        	but_find.addActionListener(this);
            new ReturnButton(but_return,this,"MainFrame");
        }
	    public void sentFind() {
	    	plant.setStart(startText.getText());
	    	plant.setEnd(endText.getText());
	    	plant.setStarttime(Text_time.getText());
	    }
public static void main(String[] args) {
	new FindFrame();
}
}
