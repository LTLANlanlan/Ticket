package Entity;
import java.util.*;
public class Order {
String planeID;//航班号
private int flyPersonNum;//乘机人数，用于座位检测
String orderID;//订单号
String buyTime;//订单生成时间
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

public String getBuyTime() {
	return buyTime;
} 

public Ticket getTicket() {
	return ticket;
}

public void setTicket(Ticket ticket) {
	this.ticket = ticket;
}


public void setBuyTime(String buyTime) {
	this.buyTime = buyTime;
}
public int getFlyPersonNum() {
	return flyPersonNum;
}
public void setFlyPersonNum(int flyPersonNum) {
	this.flyPersonNum = flyPersonNum;
}
}

