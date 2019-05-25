package MySql;

import java.util.Date;

import Entity.Order;
import Entity.Ticket;

public class OrderSql extends MySQLD {
public void insert(Order order) {
	linkingDatabase();
	String planeID=order.getPlaneID();//航班号
//	String ClientID=order.getClientID();//顾客Id
	String ordrtId=order.getOrderID();//订单号
	Date buyTime=order.getBuyTime();//订单生成时间
	Ticket ticket=order.getTicket();//顾客购票信息
}
}
