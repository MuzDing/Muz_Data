package there;

import java.sql.*;
class MysqlConnector{
	
public static void main(String args[]) {
    try {
      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
      System.out.println("Success loading Mysql Driver!");
    }
    catch (Exception e) {
      System.out.print("Error loading Mysql Driver!");
      e.printStackTrace();
    }
    try {
      Connection connect = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false","root","123456");
      System.out.println("Success connect Mysql server!");

      //select code
      Statement stmt = connect.createStatement();
      ResultSet rs = stmt.executeQuery("select * from class");
       while (rs.next()) {
        System.out.println(rs.getString("num"));

      }
    }
    catch (Exception e) {
      System.out.print("get data error!");
      e.printStackTrace();
    }
  }
}