package org.test.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class TestDB2 {
	static String jdbc="jdbc:mysql://localhost:3306/qiye";
	static String username = "root";
	static String password = "123456";
	public static void main(String[] args) throws SQLException  {
		//������������
		Connection conn = null ;
		ResultSet rs =null;
		try {
			//�������ݿ�
			conn = (Connection) DriverManager.getConnection(jdbc, username, password);
			Statement  st = (Statement) conn.createStatement();
            rs =st.executeQuery("select * from areas");
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
			//���չر�����
			if(conn!=null) {
				conn.close();
			}
			//�ر�ResultSet
			if(rs!=null) {
				rs.close();
			}
		}
		
		
	}
	

}
