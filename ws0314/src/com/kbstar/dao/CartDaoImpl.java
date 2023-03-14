package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CartDaoImpl implements DAO<String, String, Cart> {

	public CartDaoImpl() {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공");
	}
	
	@Override
	public void insert(Cart v) throws Exception {
		try (Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.CartInsertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getUser_id());
			pstmt.setString(3, v.getItem_id());
			pstmt.setInt(4, v.getCnt());
			// date는 자동입력이라 pass
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
			// e.printStackTrace();
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.CartDeleteSql);) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate(); // 작성한 쿼리를 업데이트한다 => 정상이면 1리턴 비정상이면 0리턴
			if (result == 0) {
				throw new Exception("ID 없음");
			}
		} catch (Exception e1) {
			throw e1;
		}
	}

	@Override
	public void update(Cart v) throws Exception {
		try (Connection con = getConnection();
	            PreparedStatement pstmt = con.prepareStatement(Sql.CartUpdateSql);){         
	         pstmt.setString(1, v.getUser_id());
	         pstmt.setString(2, v.getItem_id());
	         pstmt.setInt(3, v.getCnt());
	         pstmt.setString(4, v.getId());
	         int result = pstmt.executeUpdate();
	         if(result == 0) {
	            throw new Exception("없음");
	         }
	      } catch (SQLException e) {
	         throw e;
	      }
	}

	@Override
	public Cart select(String k) throws Exception {
		Cart obj = null;
		try (Connection con = getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(Sql.CartSelectSql);) {
			pstmt.setString(1, k);

			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String id = rset.getString("id");
				String user_id = rset.getString("user_id");
				String item_id = rset.getString("item_id");
				int cnt = rset.getInt("cnt");
				Date regdate = rset.getDate("regdate");
				obj = new Cart(id, user_id, item_id, cnt, regdate);
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return obj;
	}

	@Override
	public List<Cart> selectAll() throws Exception {
		List<Cart> list = new ArrayList<Cart>();
		try (Connection con = getConnection(); 
		PreparedStatement pstmt = con.prepareStatement(Sql.CartSelectAllSql);) {
				try (ResultSet rset = pstmt.executeQuery();) {
				while (rset.next()) {
					Cart obj = null;
					String id = rset.getString("id");
					String user_id = rset.getString("user_id");
					String item_id = rset.getString("item_id");
					int cnt = rset.getInt("cnt");
					Date regdate = rset.getDate("regdate");
					obj = new Cart(id, user_id, item_id, cnt, regdate);
					list.add(obj);
				}
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e; 
		}

		return list;
	}

	@Override
	public List<Cart> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

}
