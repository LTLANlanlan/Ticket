package MySql;

import java.sql.*;
 
public class MySQLD{
 
    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/ticket";
   
    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = ""; 
    //用于连接
   protected Connection conn = null;
   protected Statement stmt = null;
    //连接数据库
 public void linkingDatabase() {
	
     try{
         // 注册 JDBC 驱动
         Class.forName("com.mysql.cj.jdbc.Driver");
         // 打开链接,连接数据库...
         conn = DriverManager.getConnection(DB_URL,USER,PASS);
         // 执行查询,实例化Statement对象
         stmt = conn.createStatement();//建立SQL语句对象
        
     }catch(SQLException se){
         // 处理 JDBC 错误
         se.printStackTrace();
     }catch(Exception e){
         // 处理 Class.forName 错误
         e.printStackTrace();
     }
 }
 //关闭数据库
     public void sourceClose(){
         // 关闭资源
         try{
             if(stmt!=null) stmt.close();
         }catch(SQLException se2){
         }// 什么都不做
         try{
             if(conn!=null) conn.close();
         }catch(SQLException se){
             se.printStackTrace();
         }
     }
 }
    