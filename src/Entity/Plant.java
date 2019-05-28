package Entity;

public class Plant {

	private String plantID;// 航班号
	private String starttime;//起飞时间
	private String start;//起点
	private String end;//终点
	private String company;//航空公司
	private int ticketNum;// 票（座位）剩余数量
	private int topTicketNum;//头等舱票剩余数量
	private int seatNum;//座位数
	private int topSeatNum;//头等舱座位数
    private boolean seat[]= new boolean[50];
    public Plant() {
    	seatNum=50;
    	topSeatNum=10;
    	
	    setAllSeat();
	}
	public Plant(String plantID, String starttime, String start, String end,
			String type,  int number) {
		super();
		this.plantID=plantID;
		this.starttime = starttime;
		this.start = start;
		this.end = end;
		this.setCompany(type);
		this.ticketNum = number;
	}

	public Plant(String starttime, String start, String end) {
		// TODO Auto-generated constructor stub
		this.starttime = starttime;
		this.start = start;
		this.end = end;
	}
	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}




	public String getPlantID() {
		return plantID;
	}

	public void setPlantID(String plantID) {
		this.plantID = plantID;
	}
//得到总票数
	public int getTicketnumber() {
		for(int i=0;i<seatNum;i++) {
			if(seat[i]==true)
				ticketNum++;
		}
		return ticketNum;
	}
	//得到头等舱票数
	public int getTopTicketNum() {
		for(int i=0;i<topSeatNum;i++) {
			if(seat[i]==true)
				topTicketNum++;
		}
		return topTicketNum;
	}
	
	public boolean getSeat(int i) {
		return seat[i];
	}
	//设置座位是否被订
	public void setAllSeat() {
		for(int i=0;i<seatNum;i++) {
			seat[i]=true;
		}
	}
	public void setSeat(boolean x,int i) {
		this.seat[i] = x;
	}
	//设置座位数
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	//设置头等舱数
	public int getTopSeatNum() {
		return topSeatNum;
	}
	public void setTopSeatNum(int topSeatNum) {
		this.topSeatNum = topSeatNum;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}


}
