package MySql;
import java.sql.*;
public class RegistSql extends MySQLD {
	public boolean RegistNameCheck(String Username) {
		try {
			linkingDatabase();
			String sql="select name from User";
			ResultSet rs =stmt.executeQuery(sql);
			String name;
			while(rs.next()) {
				 name =rs.getString("name");//不能放外边，rs要先.next()
			if(name.equals(Username))
				return true;
		}
			
		}catch(SQLException se) {
			//处理JDBC错误
			se.printStackTrace();
		}catch(Exception e) {
			//处理Class。forName 错误
		}finally {
			sourceClose();
		}
		return false;
	}
	public void InsertIntoTable(String Username,String password,String realName,String phonenumber,String idCard) throws SQLException{
		linkingDatabase();
		String sql="insert into User values(Username,password)";
		stmt.executeUpdate(sql);
		sql="insert into Customer values(realName,phoneNumber,idCard)";
		stmt.executeUpdate(sql);
	}
   
}
 