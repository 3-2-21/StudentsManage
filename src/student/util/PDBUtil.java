package student.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//通用的数据库操作方法
public class PDBUtil {
	private static final String URL = "jdbc:mysql://localhost:3306/studentinf?serverTimezone=UTC";
	private static final String USERNAME = "root";
	private static final String PWD = "root";
	public static Connection connection = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
  //查询总数
	public static int getTotalCount(String sql) {
    int count =-1;
	try {	
	pstmt=createPreParedStatement(sql, null);
	rs =pstmt.executeQuery();
	if(rs.next()) {
		count = rs.getInt(1);
	}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();			
		}catch(SQLException e) {
			e.printStackTrace();				
		}catch(Exception e) {
			e.printStackTrace();				
		}finally {
			closeAll(rs, pstmt, connection);
		}
          return count;
	}

	public static PreparedStatement createPreParedStatement(String sql,Object[] params) throws SQLException, ClassNotFoundException {
		pstmt =getConnection().prepareStatement(sql);	
		if(params!=null) {
			for(int i=0;i<params.length;i++) {
				pstmt.setObject(i+1, params[i]);		
			}
		}
		return pstmt;	
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL,USERNAME,PWD);	
	}			
  public static void closeAll(ResultSet rs,Statement stmt,Connection connection){
	try {				
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(connection!=null)connection.close();
	}catch(SQLException e){
		e.printStackTrace();
		}	
}
//通用的查询：返回值为一个集合
	public static ResultSet executeQuery(String sql,Object[] params) {
				try {				
					pstmt = createPreParedStatement(sql,params);
				
					rs= pstmt.executeQuery();
			
					return rs;	
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
					return null;
				}catch(SQLException e) {
					e.printStackTrace();	
					return null;
				}catch(Exception e) {
					e.printStackTrace();	
					return null;
				}

		}				
}
	
	

