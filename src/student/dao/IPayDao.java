package student.dao;


import java.util.List;
import student.inform.Pay;

public interface IPayDao {
	
	//��ѯ����
	public int getTotalCount();
	//currentPage��ǰҳ pageSizeҳ���С��ÿҳ��ʾ�����ݸ�����
	public List<Pay> queryPayByPage(int currentPage,int pageSize);
	
	//��ѯȫ��
	public List<Pay> queryPays() ;

}
