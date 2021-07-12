package student.service;

import java.util.List;

import student.dao.IMajorDao;
import student.dao.impl.MajorDaoImpl;
import student.inform.Major;



public interface IMajorService {
	//接口 X = new 实现类();
	IMajorDao majorDao = new MajorDaoImpl();
	//根据编号删除
    public boolean deleteMByMid(int mid) ;
	//根据编号查询
	public Major queryMByMid(int mid) ;
	//查询当前页数据集合	
	public List<Major> queryMajorByPage(int currentPage,int pageSize);
	//查询全部学生
	public List<Major> queryMajors() ;
	public int getTotalCount();
	public Major queryMajor(int mid);


}
