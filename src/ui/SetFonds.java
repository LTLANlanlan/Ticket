package ui;

import java.awt.*;

import javax.swing.*;

public class SetFonds {
	Font font ;
	SetFonds(JButton button ){
		new Font("宋体",Font.BOLD,20);
		button.setFont(font);
	}
    SetFonds(JButton button,int i ){
	    new Font("宋体",Font.BOLD,i);
	    button.setFont(font);
}
    SetFonds(JLabel label ){
	    new Font("宋体",Font.BOLD,20);
	    label.setFont(font);
}
    SetFonds(JLabel label,int i ){
        new Font("宋体",Font.BOLD,i);
        label.setFont(font);
}
    
}
