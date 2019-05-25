package Entity;
import java.util.*;
public class Order {
String planeID;//航班号
private String ClientID[];//顾客身份证号，可能多个乘机人
String orderID;//订单号
Date buyTime;//订单生成时间
Ticket ticket;//顾客购票信息
public void setOrderID(String OrderID) {
	orderID = OrderID;
}
public String getOrderID() {
	return orderID;
}

public void setPlaneID(String PlaneID) {
	 planeID =  PlaneID;
}

public String  getPlaneID() {
	return planeID;
}

public Date getBuyTime() {
	return buyTime;
} 

public Ticket getTicket() {
	return ticket;
}

public void setTicket(Ticket ticket) {
	this.ticket = ticket;
}


public void setBuyTime(Date buyTime) {
	this.buyTime = buyTime;
}

public String[] getClientID() {
	return ClientID;
}

public void setClientID(String[] clientID) {
	ClientID = clientID;
}
}
