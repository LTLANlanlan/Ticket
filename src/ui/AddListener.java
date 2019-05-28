package ui;

import javax.swing.*;
import java.awt.event.*;
public class AddListener {
	AddListener(JButton but){
		but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==but)
					methodIfListen(but);
			}
		});
	}
public void methodIfListen(JButton but){
	
}
}
