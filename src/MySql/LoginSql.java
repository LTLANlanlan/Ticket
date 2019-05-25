package MySql;
import java.sql.*;
public class LoginSql extends MySQLD{
	public boolean LoginCheck( String LIName,String LIPassword) {
		try{
			linkingDatabase();//连接数据库
			String sql="SELECT name,password from User ";
			ResultSet rs =stmt.executeQuery(sql);
			 while(rs.next()) {
				 String name=rs.getString("name");
				 String password=rs.getString("password");
				 if(LIName.equals(name)&&LIPassword.equals(password)) 
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
		
	
}
