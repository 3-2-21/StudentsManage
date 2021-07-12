package student.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student.dao.IStudentDao;
import student.inform.Student;
import student.util.DBUtil;

//数据访问层：原子性的增删查改
public class StudentDaoImpl implements IStudentDao{
	private static final String URL = "jdbc:mysql://localhost:3306/studentinf?serverTimezone=UTC";
	private static final String USERNAME = "root";
	private static final String PWD = "root";
	
	//增加
	public boolean addStudent(Student student) {
		String sql = "insert into students values(?,?,?,?,?,?)";
		Object[] params= {student.getSno(),student.getSname(),student.getSgender(),student.getSage(),student.getSmajor(),student.getSphone()};
		return DBUtil.executeUpdate(sql, params);
			
	}
	//删除
	public boolean deleteStudentBySno(int sno) {
		
			String sql = "delete from students where sno=?";
			Object[] params= {sno};
			return DBUtil.executeUpdate(sql, params);
	}
	//查询此人是否存在
	public boolean isExist(int sno){//true此人存在
		return queryStudentBySno(sno)==null?false:true;	
		}
	//根据学号查询
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
	
		//查询全部
		public List<Student> queryStudents() {
			List<Student> students = new ArrayList<>();
			Student student = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				
				String sql = "select *  from students";
				rs= DBUtil.executeQuery(sql, null);				
				
				while(rs.next()) {
					int no = rs.getInt("sno");
			
					String name = rs.getString("sname");
					String gender = rs.getString("sgender");
					int age = rs.getInt("sage");
					String major = rs.getString("smajor");
					String  phone = rs.getString ("sphone");
					student = new Student(no,name,gender,age,major,phone);	
					students.add(student);
				}
				return students;	
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
	
	//根据学号修改
	public boolean updateStudentBySno(int sno,Student student) {
	
			String sql = "update students set  sname=?,sgender=?,sage=?,smajor=?,sphone=? where sno=?";
			Object[] params= {student.getSname(),student.getSgender(),student.getSage(),student.getSmajor(),student.getSphone(),sno};
			return DBUtil.executeUpdate(sql, params);
		
	}
	
	public int getTotalCount() {
		String sql ="select count(1) from students";
		return DBUtil.getTotalCount(sql);
	}

	public List<Student> queryStudentByPage(int currentPage, int pageSize) {

		String sql = "select * from students  order by sno asc limit ?,?";
		Object[] params = {currentPage, pageSize};
		List<Student> students = new ArrayList<>();
		
		ResultSet rs = DBUtil.executeQuery(sql, params);
		try {
			while(rs.next()) {
				Student student = new Student(rs.getInt("sno"),rs.getString("sname"),rs.getString("sgender"),rs.getInt("sage"),rs.getString("smajor"),rs.getString("sphone"));
				students.add(student);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return students;
	}
	
	
}

