package student.dao;


import java.util.List;
import student.inform.Major;

public interface IMajorDao {
	
	//查询总数
	public int getTotalCount();
	//currentPage当前页 pageSize页面大小（每页显示的数据个数）
	public List<Major> queryMajorByPage(int currentPage,int pageSize);
	
	//查询全部
	public List<Major> queryMajors() ;

}
