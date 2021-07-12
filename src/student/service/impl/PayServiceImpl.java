package student.service.impl;

import java.util.List;


import student.dao.IPayDao;
import student.dao.impl.PayDaoImpl;
import student.inform.Pay;
import student.service.IPayService;


//业务逻辑层，对DAO层进行组装（增+查）
public class PayServiceImpl implements IPayService{
	//接口 X = new 实现类();
	IPayDao payDao = new PayDaoImpl();		
	//查询全部专业
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
