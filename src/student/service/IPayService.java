package student.service;

import java.util.List;

import student.dao.IPayDao;
import student.dao.impl.PayDaoImpl;
import student.inform.Pay;

public interface IPayService {
	//�ӿ� X = new ʵ����();
	IPayDao majorDao = (IPayDao) new PayDaoImpl();
	//��ѯ��ǰҳ���ݼ���	
	public List<Pay> queryMajorByPage(int currentPage,int pageSize);
	//��ѯȫ��ѧ��
	public List<Pay> queryPays() ;
	public int getTotalCount();
	public Pay queryPay(int id);
	public List<Pay> queryPayByPage(int currentPage, int pageSize);
	
}
