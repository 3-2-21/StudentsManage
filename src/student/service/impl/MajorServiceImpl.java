package student.service.impl;

import java.util.List;

import student.dao.IMajorDao;
import student.dao.impl.MajorDaoImpl;
import student.inform.Major;
import student.service.IMajorService;


//业务逻辑层，对DAO层进行组装（增+查）
public class MajorServiceImpl implements IMajorService{
	//接口 X = new 实现类();
	IMajorDao majorDao = new MajorDaoImpl();		
	//查询全部专业
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
