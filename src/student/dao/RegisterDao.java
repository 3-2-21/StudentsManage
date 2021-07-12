package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import student.inform.Register;

public class RegisterDao {
	public static int register(Register register) {//зЂВс
		
		int result =-1;
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinf?serverTimezone=UTC","root","root");				
			String sql = "insert into login (name,pwd) values(?,?)";
			pstmt =connection.prepareStatement(sql);
			pstmt.executeUpdate();
			pstmt.setString(1, register.getName());		
			pstmt.setString(2, register.getPwd());
			rs= pstmt.executeQuery(sql);			
			if(rs.next()) {
				result = rs.getInt(1);
			}
			if(result > 0) {
				return 1;
			}else {
				return 0;
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			return -1;
		}catch(SQLException e) {
			e.printStackTrace();	
			return -1;
		}catch(Exception e) {
			e.printStackTrace();	
			return -1;
		}
		finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(connection!=null)connection.close();
			}catch(SQLException e){
				e.printStackTrace();				
			}
		}		
	}
}
