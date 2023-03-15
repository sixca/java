package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dto.BankUserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class BankUserDaoImpl implements DAO<String, String, BankUserDTO> {

	public BankUserDaoImpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		// System.out.println("Driver Loading 성공");
	}

	@Override
	public void insert(BankUserDTO v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setString(4, v.getEmail());
			pstmt.setString(5, v.getContact());
			int result = pstmt.executeUpdate();
		} catch (SQLException e1) {
			throw e1;
			// e1.printStackTrace();
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
			pstmt.setString(1, k);

			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("ID없음");
			}
			// System.out.println(result);
		} catch (SQLException e1) {
			throw e1;
		}
	}

	@Override
	public void update(BankUserDTO v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setString(3, v.getEmail());
			pstmt.setString(4, v.getContact());
			pstmt.setString(5, v.getId());
			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("수정할 자료가 없음");
			}
		} catch (SQLException e1) {
			throw e1;
		}
	}

	@Override
	public BankUserDTO select(String k) throws Exception {
		BankUserDTO bankUser = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);) {
			pstmt.setString(1, k);

			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String id = rset.getString("id");
				String pwd = rset.getString("pwd");
				String name = rset.getString("name");
				String email = rset.getString("email");
				String contact = rset.getString("contact");
				bankUser = new BankUserDTO(id, pwd, name, email, contact);
			} catch (Exception e) {
				throw e; // 데이터가 없으면 여기서 예외
			}
		} catch (Exception e) {
			throw e;
//			e.printStackTrace();      //시스템오류
		}

		return bankUser;

	}

	@Override
	public List<BankUserDTO> select() throws Exception {
		List<BankUserDTO> list = new ArrayList<BankUserDTO>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
					BankUserDTO bankUser = null;
					String id = rset.getString("id");
					String pwd = rset.getString("pwd");
					String name = rset.getString("name");
					String email = rset.getString("email");
					String contact = rset.getString("contact");
					bankUser = new BankUserDTO(id, pwd, name, email, contact);
					list.add(bankUser);
				}
			} catch (Exception e) {
				throw e; // 데이터가 없을 때
			}
		} catch (Exception e) {
			throw e; // 시스템 장애일 때
		}

		return list;
	}


	@Override
	public List<BankUserDTO> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
