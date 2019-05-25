package MySql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingTicketSql extends MySQLD {
	public boolean PlantCheck( String Start,String End) {
		try{
			linkingDatabase();//连接数据库
			String sql="SELECT start,end from Plant ";
			ResultSet rs =stmt.executeQuery(sql);
			 while(rs.next()) {
				 String start=rs.getString("start");
				 String end=rs.getString("end");
				 if(start.equals(Start)&&End.equals(end)) 
					 return true;
			 }
			
	}catch(SQLException se) {
		//处理JDBC错误
		se.printStackTrace();
	}catch(Exception e) {
		//处理Class.forName 错误
	}finally {
		sourceClose();
	}
		return false;	
	}
	public boolean returnPlant() {
		try{
			linkingDatabase();//连接数据库
			String sql="SELECT * from Plant";
			ResultSet rs =stmt.executeQuery(sql);
			 while(rs.next()) {
				 String start=rs.getString("start");
				 String end=rs.getString("end");
				 String startTime=rs.getString("startTime");
				 String endTime=rs.getString("endTime");
			 }
			
	}catch(SQLException se) {
		//处理JDBC错误
		se.printStackTrace();
	}catch(Exception e) {
		//处理Class.forName 错误
	}finally {
		sourceClose();
	}
		return false;	
	}
	}

