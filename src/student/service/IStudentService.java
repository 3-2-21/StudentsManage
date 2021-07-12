package student.service;

import java.util.List;

import student.dao.impl.StudentDaoImpl;
import student.inform.Major;
import student.inform.Student;

public interface IStudentService {
	StudentDaoImpl studentDao = new StudentDaoImpl();
	//����
	public boolean addStudent(Student student) ;
	//����ѧ��ɾ��
    public boolean deleteStudentBySno(int sno) ;
	//����ѧ�Ų�ѯ
	public Student queryStudentBySno(int sno) ;
	//��ѯ����
	public int getTotalCount();
	//��ѯ��ǰҳ���ݼ���
	public List<Student> queryStudentByPage(int currentPage,int pageSize);
	//��ѯȫ��ѧ��
	public List<Student> queryStudents() ;
	
	//����ѧ���޸�
	public boolean updateStudentBySno(int sno,Student student) ;
}
