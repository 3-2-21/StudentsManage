package student.dao;


import java.util.List;

import student.inform.Student;

public interface IStudentDao {
	
	//��ѯ����
	public int getTotalCount();
	//currentPage��ǰҳ pageSizeҳ���С��ÿҳ��ʾ�����ݸ�����
	public List<Student> queryStudentByPage(int currentPage,int pageSize);
	//����
	public boolean addStudent(Student student) ;
	//����ѧ��ɾ��
	public boolean deleteStudentBySno(int sno) ;
	//��ѯ�����Ƿ����
	public boolean isExist(int sno);
	//����ѧ�Ų�ѯ
	public Student queryStudentBySno(int sno) ;
	//��ѯȫ��
	public List<Student> queryStudents() ;
	
	//����ѧ���޸�
	public boolean updateStudentBySno(int sno,Student student) ;
}
