package org.test.db;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.ResultSet;

import org.junit.Test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Demo1 {
	@Test
	public void add() {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try{
			conn = (Connection) JdbcUtils.getConnection();
			String sql = "insert into testclob(resume) values(?)";
			st = (PreparedStatement) conn.prepareStatement(sql);
			
			//Reader reader = new InputStreamReader(Demo1.class.getClassLoader().getResourceAsStream("1.txt"));
			String path  = Demo1.class.getClassLoader().getResource("1.txt").getPath();//1.txt文件在src下
			File file = new File(path);
			st.setCharacterStream(1, new FileReader(file), (int) file.length());//将该文件添加
			int num = st.executeUpdate();
			if(num>0){
				System.out.println("插入成功！！");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			JdbcUtils.release(conn, st, rs);
		}
	}
	
	@Test
	public void read(){
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try{
			conn = (Connection) JdbcUtils.getConnection();
			String sql = "select resume from testclob where id=1";
			st = (PreparedStatement) conn.prepareStatement(sql);
			rs = st.executeQuery();
			if(rs.next()){
				System.out.println("haha");
				Reader reader = rs.getCharacterStream("resume");
				char buffer[] = new char[1024];
				int len = 0;
				FileWriter out = new FileWriter("c:\\1.txt");
				while((len=reader.read(buffer))>0){
					out.write(buffer, 0, len);
				}
				out.close();
				reader.close();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			JdbcUtils.release(conn, st, rs);
		}
	}
}