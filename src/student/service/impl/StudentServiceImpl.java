package student.service.impl;

import java.util.List;

import student.dao.IMajorDao;
import student.dao.IStudentDao;
import student.dao.impl.MajorDaoImpl;
import student.dao.impl.StudentDaoImpl;
import student.inform.Student;
import student.service.IStudentService;

//ҵ���߼��㣬��DAO�������װ����+�飩
public class StudentServiceImpl implements IStudentService{
	//�ӿ� X = new ʵ����();
	IStudentDao studentDao = new StudentDaoImpl();
	
	//����
	public boolean addStudent(Student student) {
		if(!studentDao.isExist(student.getSno())) {
			return studentDao.addStudent(student);
		}else {
			System.out.println("�����Ѵ��ڣ�����");
			return false;
		}	
	}
	//����ѧ��ɾ��
    public boolean deleteStudentBySno(int sno) {
    	if(studentDao.isExist(sno)){
    		return studentDao.deleteStudentBySno(sno);	
		}else {
			return false;
		}	
	}
	//����ѧ�Ų�ѯ
	public Student queryStudentBySno(int sno) {
    		return studentDao.queryStudentBySno(sno);	
		}
	
	//��ѯȫ��ѧ��
	public List<Student> queryStudents() {
    		return studentDao.queryStudents();	
	}
	
	//����ѧ���޸�
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
