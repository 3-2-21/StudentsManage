package student.dao;


import java.util.List;
import student.inform.Major;

public interface IMajorDao {
	
	//��ѯ����
	public int getTotalCount();
	//currentPage��ǰҳ pageSizeҳ���С��ÿҳ��ʾ�����ݸ�����
	public List<Major> queryMajorByPage(int currentPage,int pageSize);
	
	//��ѯȫ��
	public List<Major> queryMajors() ;

}
