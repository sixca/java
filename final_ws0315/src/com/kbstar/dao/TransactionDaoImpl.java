package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class TransactionDaoImpl implements DAO<String, String, TransactionDTO> {

	public TransactionDaoImpl() {
		// Driver Loading
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
	public void insert(TransactionDTO v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.trInsertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getAccNo());
			pstmt.setDouble(3, v.getBalance());
			pstmt.setString(4, v.getType());
			pstmt.setString(5, v.getDescription());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
			// e.printStackTrace();
		}
	}

	@Override
	public void delete(String k) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(TransactionDTO v) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public TransactionDTO select(String k) throws Exception {
		TransactionDTO transaction = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.trSelectSql);) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String id = rset.getString("id");
				Date regdate = rset.getDate("regdate");
				String accNo = rset.getString("accNo");
				Double balance = rset.getDouble("balance");
				String type = rset.getString("type");
				String description = rset.getString("description");
				transaction = new TransactionDTO(id, null, accNo, balance, type, description);
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return transaction;
	}

	@Override
	public List<TransactionDTO> select() throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.trSelectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery();) {
				while (rset.next()) {
					TransactionDTO transaction = null;
					String id = rset.getString("id");
					Date regdate = rset.getDate("regdate");
					String accNo = rset.getString("accNo");
					Double balance = rset.getDouble("balance");
					String type = rset.getString("type");
					String description = rset.getString("description");
					transaction = new TransactionDTO(id, null, accNo, balance, type, description);
					list.add(transaction);
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
	public List<TransactionDTO> search(String K) throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		try (Connection con = getConnection(); 
				PreparedStatement pstmt = 
						con.prepareStatement(Sql.mytrSelectAllSql);) {
			pstmt.setString(1, K);
			try (ResultSet rset = pstmt.executeQuery();) {
				while (rset.next()) {
					TransactionDTO acc = null;
					String id = rset.getString("id");
					Date regdate = rset.getDate("regdate");
					String accNo = rset.getString("accNo");
					Double balance = rset.getDouble("balance");
					String type = rset.getString("type");
					String description = rset.getString("description");
					acc = new TransactionDTO(id, null, accNo, balance, type, description);
					list.add(acc);	
				}
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}
}
