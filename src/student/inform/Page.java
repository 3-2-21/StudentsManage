package student.inform;

import java.util.List;

public class Page {

	//��ǰҳ
	private int currentPage;
	//������
	private int totalCount;
	//ҳ���С
	private int pageSize;
	//��ǰҳ�����ݼ���
	private List<Student> students;	
	private List<Major> majors;
	private List<Pay> pays;
	//��ҳ��
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
		//�Զ������������
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
