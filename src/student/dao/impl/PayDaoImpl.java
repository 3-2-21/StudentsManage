package student.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import student.dao.IPayDao;
import student.inform.Pay;
import student.util.PDBUtil;

//数据访问层：原子性的增删查改
public class PayDaoImpl implements  IPayDao{
	private static final String URL = "jdbc:mysql://localhost:3306/studentinf?serverTimezone=UTC";
	private static final String USERNAME = "root";
	private static final String PWD = "root";
		
		//查询全部
		public List<Pay> queryPays() {
			List<Pay> pays = new ArrayList<>();
			Pay pay = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;			
			try {				
				String sql = "select * from pays";
				rs= PDBUtil.executeQuery(sql, null);				
				
				while(rs.next()) {
					int id = rs.getInt("pid");		
					String name = rs.getString("pname");
					double money = rs.getDouble("pmoney");				
					pay = new Pay(id,name,money);	
					pays.add(pay);
				}
				return pays;	
			}catch(SQLException e) {
				e.printStackTrace();	
				return null;
			}catch(Exception e) {
				e.printStackTrace();	
				return null;
			}
			finally {
				PDBUtil.closeAll(rs, pstmt, PDBUtil.connection);
			}		
		}
	public List<Pay> queryPayByPage(int currentPage, int pageSize) {

		String sql = "select * from pays order by pid asc limit ?,?";
		Object[] params = {currentPage, pageSize};
		List<Pay> pays = new ArrayList<>();	
		ResultSet rs = PDBUtil.executeQuery(sql, params);	
		try {
			while(rs.next()) {
				
				Pay pay = new Pay(rs.getInt("pid"),rs.getString("pname"),rs.getDouble("pmoney"));
				pays.add(pay);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}		
		return pays;
	}
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}

