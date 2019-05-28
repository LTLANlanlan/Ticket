package ui;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

import Entity.Order;
import Entity.Plant;

public class SeatFrame extends JFrame implements ActionListener{
	private Order order = new Order();
	
	private JPanel pan_seat = new JPanel();
	private JButton but_path = new JButton("过道");

	private JPanel pan1_seat = new JPanel();
	private JPanel pan2_seat = new JPanel();
    private JButton but_return = new JButton("返回");
    private JButton but_yes = new JButton("确定");
	private JButton seat[] = new JButton[50];
	private int seatId[]= {-1,-1,-1,-1,-1};//一个订单最多五人
    private Plant plant= new Plant();
	SeatFrame(Plant plant,Order order){
		this.plant = plant;
		this.order = order;
	    setLayout(null);	
	    setSeatPanel(pan_seat,0,10);
		setSeatPanel(pan1_seat,10,30);
		setSeatPanel(pan2_seat,30,50);
		setTitle("座位");
		add(pan_seat);
		add(pan1_seat);
		add(pan2_seat);
		add(but_path);
		add(but_yes);
		add(but_return);
		but_yes.setBounds(150, 500, 60, 30);
		but_return.setBounds(300, 500, 60, 30);
		but_path.setContentAreaFilled(false);
		but_path.setEnabled(false);
		but_path.setBounds(220, 150, 60, 200);
		pan_seat.setBounds(5, 5, 500, 100);
		pan1_seat.setBounds(5, 125, 200, 375);
		pan2_seat.setBounds(300,125, 200, 375);
		setVisible(true);
		setLocation(800,400);
		setSize(530,600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
	    but_yes.addActionListener(this);
	    but_return.addActionListener(this);
		
		
	}
	public void setSeatPanel(JPanel panel,int start,int num) {
		for(int i=start;i<num;i++) {
			JButton but = new JButton("");//前10为头等舱
			panel.add(but);
		    but.setContentAreaFilled(false);
		    seat[i]=but;
			if(plant.getSeat(i)) {//航班对应座位可选		
			but.setIcon(new ImageIcon("C://Users//凉古//Desktop//uiairplane//座位可选.png"));	
			System.out.println("???");
			seat[i].addActionListener(this);
			}
			else {//否则
				but.setIcon(new ImageIcon("C://Users//凉古//Desktop//uiairplane//座位已选.png"));
				seat[i].setEnabled(true);//已选的座位设置不可点击，即不可以被选择
			}
		}

	}int j =0;int flyPerson = 0;
	
				public void actionPerformed(ActionEvent e) {
					
					for(int i=0;i<50;i++)
					if(e.getSource()==seat[i]) {	
						flyPerson++;
						if(flyPerson<=order.getFlyPersonNum())
						{seatId[j]=i;
						seat[i].setIcon(new ImageIcon("C://Users//凉古//Desktop//uiairplane//座位已选.png"));}
						else {
							
						}
					}
					if(e.getSource()==but_yes) {
						if(seatId[j]==-1) {
							 new ReturnButton(but_yes,this,"OrderFrame");
						}
						else {
							for(int i=0;i<=j;i++)//确认后对应乘机人确定
							plant.setSeat(false, seatId[j]);//该航班对应座位设置为已选
						}
					}
					if(e.getSource()==but_return) {
						this.dispose();
					}
				}
			
		

	public int getSeatId() {
		return seatId[0];
	}
}
