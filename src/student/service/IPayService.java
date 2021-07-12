package student.service;

import java.util.List;

import student.dao.IPayDao;
import student.dao.impl.PayDaoImpl;
import student.inform.Pay;

public interface IPayService {
	//接口 X = new 实现类();
	IPayDao majorDao = (IPayDao) new PayDaoImpl();
	//查询当前页数据集合	
	public List<Pay> queryMajorByPage(int currentPage,int pageSize);
	//查询全部学生
	public List<Pay> queryPays() ;
	public int getTotalCount();
	public Pay queryPay(int id);
	public List<Pay> queryPayByPage(int currentPage, int pageSize);
	
}
