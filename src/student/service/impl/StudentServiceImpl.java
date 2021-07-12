package student.service.impl;

import java.util.List;

import student.dao.IMajorDao;
import student.dao.IStudentDao;
import student.dao.impl.MajorDaoImpl;
import student.dao.impl.StudentDaoImpl;
import student.inform.Student;
import student.service.IStudentService;

//业务逻辑层，对DAO层进行组装（增+查）
public class StudentServiceImpl implements IStudentService{
	//接口 X = new 实现类();
	IStudentDao studentDao = new StudentDaoImpl();
	
	//增加
	public boolean addStudent(Student student) {
		if(!studentDao.isExist(student.getSno())) {
			return studentDao.addStudent(student);
		}else {
			System.out.println("此人已存在！！！");
			return false;
		}	
	}
	//根据学号删除
    public boolean deleteStudentBySno(int sno) {
    	if(studentDao.isExist(sno)){
    		return studentDao.deleteStudentBySno(sno);	
		}else {
			return false;
		}	
	}
	//根据学号查询
	public Student queryStudentBySno(int sno) {
    		return studentDao.queryStudentBySno(sno);	
		}
	
	//查询全部学生
	public List<Student> queryStudents() {
    		return studentDao.queryStudents();	
	}
	
	//根据学号修改
	public boolean updateStudentBySno(int sno,Student student) {
		if(studentDao.isExist(sno)){
    		return studentDao.updateStudentBySno(sno, student);	
		}else {
			return false;
		}	
	}
	
	public int getTotalCount() {		
		return studentDao.getTotalCount();
	}

	public List<Student> queryStudentByPage(int currentPage, int pageSize) {	
		return studentDao.queryStudentByPage(currentPage, pageSize);
	}
	
}
