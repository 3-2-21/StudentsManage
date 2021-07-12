package student.dao;


import java.util.List;

import student.inform.Student;

public interface IStudentDao {
	
	//查询总数
	public int getTotalCount();
	//currentPage当前页 pageSize页面大小（每页显示的数据个数）
	public List<Student> queryStudentByPage(int currentPage,int pageSize);
	//增加
	public boolean addStudent(Student student) ;
	//根据学号删除
	public boolean deleteStudentBySno(int sno) ;
	//查询此人是否存在
	public boolean isExist(int sno);
	//根据学号查询
	public Student queryStudentBySno(int sno) ;
	//查询全部
	public List<Student> queryStudents() ;
	
	//根据学号修改
	public boolean updateStudentBySno(int sno,Student student) ;
}
