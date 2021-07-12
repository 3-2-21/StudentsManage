package student.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import student.dao.IMajorDao;
import student.inform.Major;
import student.inform.Student;
import student.util.DBUtil;
import student.util.MDBUtil;

//数据访问层：原子性的增删查改
public class MajorDaoImpl implements IMajorDao{
	private static final String URL = "jdbc:mysql://localhost:3306/studentinf?serverTimezone=UTC";
	private static final String USERNAME = "root";
	private static final String PWD = "root";
		
		//查询全部
		public List<Major> queryMajors() {
			List<Major> majors = new ArrayList<>();
			Major major = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;			
			try {				
				String sql = "select * from majors";
				rs= MDBUtil.executeQuery(sql, null);				
				
				while(rs.next()) {
					int id = rs.getInt("mid");		
					String name = rs.getString("mname");
					String include = rs.getString("minclude");				
					major = new Major(id,name,include);	
					majors.add(major);
				}
				return majors;	
			}catch(SQLException e) {
				e.printStackTrace();	
				return null;
			}catch(Exception e) {
				e.printStackTrace();	
				return null;
			}
			finally {
				MDBUtil.closeAll(rs, pstmt, MDBUtil.connection);
			}		
		}
	public List<Major> queryMajorByPage(int currentPage, int pageSize) {

		String sql = "select * from majors order by mid asc limit ?,?";
		Object[] params = {currentPage, pageSize};
		List<Major> majors = new ArrayList<>();	
		ResultSet rs = MDBUtil.executeQuery(sql, params);	
		try {
			while(rs.next()) {
				
				Major major = new Major(rs.getInt("mid"),rs.getString("mname"),rs.getString("minclude"));
				majors.add(major);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}		
		return majors;
	}
	//根据编号查询
			public Student queryStudentBySno(int sno) {
				
				Student student = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
	         try {
					
					String sql = "select *  from students where sno =?";
					Object[] params= {sno};
					rs= DBUtil.executeQuery(sql, params);			
					if(rs.next()) {
						int no = rs.getInt("sno");
				
						String name = rs.getString("sname");
						String gender = rs.getString("sgender");
						int age = rs.getInt("sage");
						String major = rs.getString("smajor");
						String  phone = rs.getString ("sphone");
						student = new Student(no,name,gender,age,major,phone);		
					}
					return student;	
				}catch(SQLException e) {
					e.printStackTrace();	
					return null;
				}catch(Exception e) {
					e.printStackTrace();	
					return null;
				}
				finally {
					DBUtil.closeAll(rs, pstmt, DBUtil.connection);
				}		
			}
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

