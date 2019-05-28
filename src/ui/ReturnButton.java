package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReturnButton {
   ReturnButton(JButton but_return,JPanel panel1,JPanel panel2){//panel1是现在显示的面板，panel2是要显示的面板
	   but_return.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) { 
			   if(e.getSource()==but_return)
				      {panel1.setVisible(false);
	                  panel2.setVisible(true);}
			   }
		   
	   });
	   
}
   ReturnButton(JButton but_return,JFrame frame1,String frame2){//frame1是当前框架，frame2是要跳转的框架的名称
	   but_return.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   if(e.getSource()==but_return)
			   {  frame1.dispose();
			   if(frame2=="MainFrame") 
				   new MainFrame();
			   else if(frame2=="Login")
					   new Login();
			//   else if(frame2=="OrderFrame")
			//	   new OrderFrame();
			   
			   }
			       
   }
		   
	   });
	   
}
}
