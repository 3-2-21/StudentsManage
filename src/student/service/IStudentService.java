package student.service;

import java.util.List;

import student.dao.impl.StudentDaoImpl;
import student.inform.Major;
import student.inform.Student;

public interface IStudentService {
	StudentDaoImpl studentDao = new StudentDaoImpl();
	//增加
	public boolean addStudent(Student student) ;
	//根据学号删除
    public boolean deleteStudentBySno(int sno) ;
	//根据学号查询
	public Student queryStudentBySno(int sno) ;
	//查询总数
	public int getTotalCount();
	//查询当前页数据集合
	public List<Student> queryStudentByPage(int currentPage,int pageSize);
	//查询全部学生
	public List<Student> queryStudents() ;
	
	//根据学号修改
	public boolean updateStudentBySno(int sno,Student student) ;
}
