package Entity;

public class Customer extends User{
     String name;//姓名
     String idCard;//身份证号码
     String phoneNumber;//手机号
     String flightNum;//航班号
     String order[];//顾客有的订单，存的订单号
     int OrderNum;//购票数
     String type;
     public void setName(String Name) {
    	 name = Name;
     } 
     public void setIDCard(String IDCard) {
    	 idCard = IDCard;
     }
     public void setPhoneNumber(String PHNUM) {
    	 phoneNumber = PHNUM;
     }
  //   public void setPhone
     public String getName() {
    	 return name;
     }
    
     public String getIDCard() {
    	 return idCard;
     }
     public String getPhoneNumber() {
    	 return phoneNumber;
     }
     public String getFlightNumr() {
    	 return flightNum;
     }
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

     
}