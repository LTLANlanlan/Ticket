package Entity;

public class Plant {

	private String plantID;// 航班号
	private String starttime;//起飞时间
	private String start;//起点
	private String end;//终点
	private String type;//航空公司
	private double price;//
	private int ticketnumber;// 票（座位）剩余数量

	public Plant() {
		super();
	}
	public Plant(String plantID, String starttime, String start, String end,
			String type, double price, int number) {
		super();
		this.setPlantID(plantID);
		this.starttime = starttime;
		this.start = start;
		this.end = end;
		this.type = type;
		this.price = price;
		this.ticketnumber = number;
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



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPlantID() {
		return plantID;
	}

	public void setPlantID(String plantID) {
		this.plantID = plantID;
	}

	public int getTicketnumber() {
		return ticketnumber;
	}

	public void setTicketnumber(int ticketnumber) {
		this.ticketnumber = ticketnumber;
	}


}
