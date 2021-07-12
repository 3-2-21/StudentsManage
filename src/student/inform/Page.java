package student.inform;

import java.util.List;

public class Page {

	//当前页
	private int currentPage;
	//总数据
	private int totalCount;
	//页面大小
	private int pageSize;
	//当前页的数据集合
	private List<Student> students;	
	private List<Major> majors;
	private List<Pay> pays;
	//总页数
	private int totalPage;
		

	public Page() {
		
	}
	public Page(int currentPage, int totalCount,int pageSize, List<Student> students,List<Major> majors, List<Pay> pays, int totalPage) {
	
		this.currentPage = currentPage;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.students = students;	
		this.majors= majors;
		this.pays=pays;
		this.totalPage = totalPage;
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		//自动计算出总数据
		this.totalPage = this.totalCount%this.pageSize==0?this.totalCount/this.pageSize:totalCount/this.pageSize+1;
	}
	public List<Student> getStudents() {
		return students;
	}	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Major> getMajors() {
		return majors;
	}
	public void setMajors(List<Major> majors) {
		this.majors = majors;
	}
	public List<Pay> getPays() {
		return pays;
	}
	public void setPays(List<Pay> pays) {
		this.pays = pays;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	
}
