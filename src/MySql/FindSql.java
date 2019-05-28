package MySql;

import java.sql.*;

import Entity.Plant;

public class FindSql extends MySQLD{
	Plant[]p ;
	int num =0;//用于记录搜索到的个数
public FindSql(Plant plant) throws SQLException{
	linkingDatabase();
	String sql="select*from plant where start='长春'";
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()) {
    	p[num]=new Plant(rs.getString(1),rs.getString(2),rs.getString(3));
    	num++;
    }

}
    public Plant[] getPlant() {
    	return p;
    }
}
