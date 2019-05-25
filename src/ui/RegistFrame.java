package ui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import MySql.*;

public class RegistFrame extends JFrame {
	JPanel RegistPanel = new JPanel();
	RegistSql sql = new RegistSql();
	private JButton regist = new JButton("注册");
	private JButton returnn = new JButton("返回");
	private JLabel namelab = new JLabel   ("用  户 名:");
	private JLabel passlab = new JLabel   ("密      码:");
	private JLabel passlab2 = new JLabel  ("确认密码:");
	private JLabel rNameLab =new JLabel   ("姓      名:");
	private JLabel idCardLab = new JLabel ("身份证号:");
	private JLabel phoneNumLab =new JLabel("手  机 号:");
	private JTextField nameText = new JTextField(10);//用户名条
	private JPasswordField passText = new JPasswordField(20);//密码条
	private JPasswordField passText2 = new JPasswordField(20);//确认密码条
	private JTextField rNameText = new JTextField(20);//姓名条
	private JTextField idCardText= new JTextField(20); //身份证条
	private JTextField phoneNumText= new JTextField(20); //手机号条
	private JLabel infoLab = new JLabel(" ");//提示条
	private void setLoca(Rectangle r,Rectangle r1,int x,int y) {
		r.y+=y;
		r1.y+=y;
		r.x+=x;
		r1.x+=x;
	}
	RegistFrame(){
		Font fnt =new Font("serief",Font.BOLD,15);
		namelab.setFont(fnt);
		passlab.setFont(fnt);
		passlab2.setFont(fnt);
		rNameLab.setFont(fnt);
		idCardLab.setFont(fnt);
		phoneNumLab.setFont(fnt);
		regist.setFont(fnt);
		returnn.setFont(fnt);
		setLayout(null);
		Rectangle r = new Rectangle(25,5,100,20);
		Rectangle r1 = new Rectangle(125,5,200,20);
		namelab.setBounds(r);
		nameText.setBounds(r1);
		infoLab.setBounds(325,5,200,20);
		setLoca(r,r1,0,30);
		passlab.setBounds(r);
		passText.setBounds(r1);
		r.y=r.y+30;r1.y=r1.y+30;
		passlab2.setBounds(r);
		passText2.setBounds(r1);
		r.y=r.y+30;r1.y=r1.y+30;
		rNameLab.setBounds(r);
		rNameText.setBounds(r1);
		r.y=r.y+30;r1.y=r1.y+30;
		idCardLab.setBounds(r);
		idCardText.setBounds(r1);
		r.y=r.y+30;r1.y=r1.y+30;
		phoneNumLab.setBounds(r);
		phoneNumText.setBounds(r1);
		regist.setBounds(125,200,75,30);
		returnn.setBounds(220, 200, 75, 30);
		//第一行
		add(namelab);
		add(nameText);
		add(infoLab);
		//第二行
		add(passlab);
		add(passText);
		//第三行
		add(passlab2);	
		add(passText2);
		//第四行
		add(rNameLab);
		add(rNameText);
		//第五行
		add(idCardLab);
		add(idCardText);
		//第六行
		add(phoneNumLab);
		add(phoneNumText);
		//注册
		add(regist);
		add(returnn);
		//用户名重复提示
		//监听注册
		setLocation(600, 400);
		setTitle("注册");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		regist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==regist) {
					String Username = nameText.getText();
					if(sql.RegistNameCheck(Username))
						infoLab.setText("用户名已存在，请重新输入！");
					else
						if(passText.getText().equals(passText2.getText()))
								{	
							      infoLab.setBounds(125,250,200,20);
							      infoLab.setText("注册成功!");
							 //      dispose();
							   //   Login l =new Login();
							//      l.main(null);
								}
								
				}
			}
		});
		//监听返回
		returnn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==returnn) {
					dispose();
					Login l = new Login();
				}
			}
		});
	}
}

