package two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
					"root", "123456");
			Statement st = con.createStatement();
			String sql="select * from class";
			ResultSet rs = st.executeQuery(sql);  		//查询
		//	st.executeLargeUpdate("");					//增 删 改
			while(rs.next())
			{
				System.out.println(rs.getInt("num"));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}	
	}
	public void logintest() throws ClassNotFoundException
	{
		String sql="select num from class where num='140304'";
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
					"root", "123456");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next())
			{
				System.out.println("登录成功");
			}
			else
			{
				System.out.println("登录失败");
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	
	}
}
