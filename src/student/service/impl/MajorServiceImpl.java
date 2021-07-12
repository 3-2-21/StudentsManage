package student.service.impl;

import java.util.List;

import student.dao.IMajorDao;
import student.dao.impl.MajorDaoImpl;
import student.inform.Major;
import student.service.IMajorService;


//ҵ���߼��㣬��DAO�������װ����+�飩
public class MajorServiceImpl implements IMajorService{
	//�ӿ� X = new ʵ����();
	IMajorDao majorDao = new MajorDaoImpl();		
	//��ѯȫ��רҵ
	public List<Major> queryMajors() {
    		return majorDao.queryMajors();	
	}
	public int getTotalCount() {		
		return majorDao.getTotalCount();
	}
	public List<Major> queryMajorByPage(int currentPage, int pageSize) {			
		return majorDao.queryMajorByPage(currentPage, pageSize);
	}
	@Override
	public Major queryMajor(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteMByMid(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Major queryMByMid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
