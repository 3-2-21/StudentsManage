package student.service.impl;

import java.util.List;


import student.dao.IPayDao;
import student.dao.impl.PayDaoImpl;
import student.inform.Pay;
import student.service.IPayService;


//ҵ���߼��㣬��DAO�������װ����+�飩
public class PayServiceImpl implements IPayService{
	//�ӿ� X = new ʵ����();
	IPayDao payDao = new PayDaoImpl();		
	//��ѯȫ��רҵ
	public List<Pay> queryPays() {
    		return majorDao.queryPays();	
	}
	public int getTotalCount() {		
		return majorDao.getTotalCount();
	}
	public List<Pay> queryPayByPage(int currentPage, int pageSize) {			
		return majorDao.queryPayByPage(currentPage, pageSize);
	}
	@Override
	public Pay queryPay(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Pay> queryMajorByPage(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}


}
