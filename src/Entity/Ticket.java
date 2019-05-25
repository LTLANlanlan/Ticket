package Entity;


public class Ticket {
	
    private String planeID;//航班号
    private String seatID;//座位号
    private double price;//票价
    private  String seatType[]= {"头等舱","经济舱"};//座位类型
    private  String CustomerType[]= {"成人","儿童"};//机票类型(成人，儿童）
    private double discount;//因座位机票类型差异导致的折扣
    private double realDiscount;//折扣
    private boolean used ;//是否使用
    Ticket(){
    	discount=1;
    	used=false;
    	
    }
    public void setPlaneID(String PlaneID) {
   	 planeID =  PlaneID;
   }

   public String  getPlaneID() {
   	return planeID;
   }
   
   public void setSeatID(String seatID) {
	   this.seatID =  seatID;
	}

	public String  getSeatID() {
		return seatID;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(String seatType,String CustomerType) {
		
		if(seatType=="经济舱")
			if(CustomerType=="成人")
				discount = 1.0;
			else
				discount=0.8;//儿童
		else //头等舱
			if(CustomerType=="成人")
				discount = 1.2;
			else
				discount=1.0;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price*discount*realDiscount;
	}
	public double getRealdiscount() {
		return realDiscount;
	}
	public void setRealdiscount(double realdiscount) {
		this.realDiscount = realdiscount;
	}
	public String[] getSeatType() {
		return seatType;
	}
	public String[] getCustomerType() {
		return CustomerType;
	}
	
}
