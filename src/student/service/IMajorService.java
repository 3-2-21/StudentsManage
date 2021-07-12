package student.service;

import java.util.List;

import student.dao.IMajorDao;
import student.dao.impl.MajorDaoImpl;
import student.inform.Major;



public interface IMajorService {
	//�ӿ� X = new ʵ����();
	IMajorDao majorDao = new MajorDaoImpl();
	//���ݱ��ɾ��
    public boolean deleteMByMid(int mid) ;
	//���ݱ�Ų�ѯ
	public Major queryMByMid(int mid) ;
	//��ѯ��ǰҳ���ݼ���	
	public List<Major> queryMajorByPage(int currentPage,int pageSize);
	//��ѯȫ��ѧ��
	public List<Major> queryMajors() ;
	public int getTotalCount();
	public Major queryMajor(int mid);


}
