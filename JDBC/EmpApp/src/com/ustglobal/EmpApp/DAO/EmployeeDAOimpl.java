package com.ustglobal.EmpApp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.EmpApp.dto.EmployeeBean;

public class EmployeeDAOimpl implements EmployeeDAO {
	public List<EmployeeBean> getAllEmployeeData() {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			ArrayList<EmployeeBean> result = new ArrayList<>();
			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				
				int id=rs.getInt("id");
				bean.setId(id);
				String name =rs.getString("name");
				bean.setName(name);
				int sal = rs.getInt("size");
				bean.setSize(sal);
				String gender = rs.getString("gender");
				bean.setGender(gender);
				
				result.add(bean);
				
			}
			return result;
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			
			try {
				if(conn !=null) {
					conn.close();

				}
				if(stmt!= null) {
					conn.close();
				}
				if(rs!= null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();

			}
		}
		
	}
	
	public EmployeeBean SearchEmployeeData(int id) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
	       pstmt = conn.prepareStatement(sql);
	       pstmt.setInt(1,id);
	       rs = pstmt.executeQuery();
	       
	       if(rs.next()) {
	    	   EmployeeBean bean = new EmployeeBean();
	    	   bean.setId(rs.getInt("id"));
	    	   bean.setName(rs.getString("name"));
	    	   bean.setSize(rs.getInt("size"));
	    	   bean.setGender(rs.getString("gender"));
	    	   
	    	   return bean ;
	    	   
	       }else {
	    	   
	    	   return null;
	       }
	       
			
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

	@Override
	public int insertEmployeeData(EmployeeBean bean2) {
		  String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		  String sql = "insert into employee_info values(?,?,?,?) ";
		  
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  
		  
		  try {
			  
			  Class.forName("com.mysql.jdbc.Driver");
			  
			  con = DriverManager.getConnection(url);
			  
			  pstmt = con.prepareStatement(sql);
			  
			  pstmt.setInt(1, bean2.getId());
			  pstmt.setString(2, bean2.getName());
			  pstmt.setInt(3, bean2.getSize());
			  pstmt.setString(4, bean2.getGender());
			  
			  int count  = pstmt.executeUpdate();
			  return count;
			  
		  } catch(Exception e) {
			  e.printStackTrace();
		  } finally {
			  
			  try {
				  if(con != null) {
					  con.close();
				  }
				  if(pstmt != null) {
					  pstmt.close();
				  }
			  } catch(Exception e1) {
				  e1.printStackTrace();
			  }
		  }
	     return 0;
	  } // end of insert method
	@Override
	public int updateEmployeeData(EmployeeBean bean3) {
		 String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		  String sql = "update employee_info set name=? where id= ?";
		  
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  
		  
		  try {
			  
			  Class.forName("com.mysql.jdbc.Driver");
			  
			  con = DriverManager.getConnection(url);
			  
			  pstmt = con.prepareStatement(sql);
			  
			  pstmt.setString(1, bean3.getName());
			  pstmt.setInt(2, bean3.getId());
//			  pstmt.setInt(3, bean.getSal());
//			  pstmt.setString(4, bean.getGender());
			  
			  int count  = pstmt.executeUpdate();
			  return count;
			  
		  } catch(Exception e) {
			  e.printStackTrace();
		  } finally {
			  
			  try {
				  if(con != null) {
					  con.close();
				  }
				  if(pstmt != null) {
					  pstmt.close();
				  }
			  } catch(Exception e1) {
				  e1.printStackTrace();
			  }
		  }
	     return 0;
		
	}//end of update method

	@Override
	public int deleteEmployeeData(EmployeeBean bean4) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		  String sql = "delete from employee_info where id=36 ";
		  
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  
		  
		  try {
			  
			  Class.forName("com.mysql.jdbc.Driver");
			  
			  con = DriverManager.getConnection(url);
			  
			  pstmt = con.prepareStatement(sql);
			  
//			  pstmt.setInt(1, bean.getId());
//			  pstmt.setString(2, bean.getName());
//			  pstmt.setInt(3, bean.getSal());
//			  pstmt.setString(4, bean.getGender());
			  
			  
			  int count  = pstmt.executeUpdate();
			  return count;
			  
		  } catch(Exception e) {
			  e.printStackTrace();
		  } finally {
			  
			  try {
				  if(con != null) {
					  con.close();
				  }
				  if(pstmt != null) {
					  pstmt.close();
				  }
			  } catch(Exception e1) {
				  e1.printStackTrace();
			  }
		  }
	     return 0;
		
	}

	
	
}//End of class Body
