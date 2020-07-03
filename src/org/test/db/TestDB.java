package org.test.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;

public class TestDB {
	static String jdbc="jdbc:mysql://localhost:3306/qiye";
	static String username = "root";
	static String password = "123456";
	public static void main(String[] args) throws SQLException  {
		//定义连接属性
		Connection conn = null ;
		ResultSet rs =null;

		PreparedStatement st = null;
		try {
			//连接数据库
			String sql = "select * from areas";
			conn = (Connection) DriverManager.getConnection(jdbc, username, password);
			 st = conn.prepareStatement(sql);
			 rs =st.executeQuery();
            
            /*
             * next()：移动到下一行
				Previous()：移动到前一行
				absolute(int row)：移动到指定行
				beforeFirst()：移动resultSet的最前面。
				afterLast() ：移动到resultSet的最后面。
             * */
//			rs.afterLast();
//			rs.previous();
//            rs.next();
            
            while(rs.next()) {
            	System.out.print(rs.getObject("aid"));
            	System.out.print(rs.getObject("atitle"));
            	System.out.println(rs.getObject("pid"));
            }
			
		
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			//最终关闭连接
			if(conn!=null) {
				conn.close();
			}
			//关闭ResultSet
			if(rs!=null) {
				rs.close();
			}
		}
		
		
	}
	

}
