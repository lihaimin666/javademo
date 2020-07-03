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
		//������������
		Connection conn = null ;
		ResultSet rs =null;

		PreparedStatement st = null;
		try {
			//�������ݿ�
			String sql = "select * from areas";
			conn = (Connection) DriverManager.getConnection(jdbc, username, password);
			 st = conn.prepareStatement(sql);
			 rs =st.executeQuery();
            
            /*
             * next()���ƶ�����һ��
				Previous()���ƶ���ǰһ��
				absolute(int row)���ƶ���ָ����
				beforeFirst()���ƶ�resultSet����ǰ�档
				afterLast() ���ƶ���resultSet������档
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
