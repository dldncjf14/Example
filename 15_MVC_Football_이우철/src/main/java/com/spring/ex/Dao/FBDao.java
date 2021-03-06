package com.spring.ex.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.spring.ex.Dto.FBDto;

public class FBDao {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String user = "jspid";
	private String pw = "jsppw";
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int cnt = -1;
	private Connection conn = null;
	
	private FBDao() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static FBDao instance = null;
	
	public static FBDao getInstance() {
		
		if(instance==null) {
			instance = new FBDao();
		}
		
		return instance;
	}
	
	public void Write(FBDto dto) throws SQLException {
		String sql = "insert into football values(fb_seq.nextval, ?, ?, ?, ?)";
		
		ps = conn.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getWin());
		ps.setString(4, dto.getRound16());
		
		cnt = ps.executeUpdate();
		
		fncls();
	}

	private void fncls() throws SQLException {
		if(rs!=null) {
			rs.close();
		}
		if(ps!=null) {
			ps.close();
		}
	}
	public ArrayList<FBDto> List() throws SQLException{
		ArrayList<FBDto> list = new ArrayList<FBDto>();
		String sql = "select * from football order by num";
		
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			String num = rs.getString(1);
			String id = rs.getString(2);
			String pw = rs.getString(3);
			String win = rs.getString(4);
			String round16 = rs.getString(5);
			
			FBDto dto = new FBDto(num, id, pw, win, round16);
			list.add(dto);
		}
		return list;
	}

	public FBDto selectByNum(String num) throws SQLException {
		String sql = "select * from football where num=?";
		FBDto dto = null;
		
		ps = conn.prepareStatement(sql);
		ps.setString(1, num);
		
		rs = ps.executeQuery();
		
		while(rs.next()) {
			String id = rs.getString(2);
			String pw = rs.getString(3);
			String win = rs.getString(4);
			String round16 = rs.getString(5);
			
			dto = new FBDto(num, id, pw, win, round16);
			
		}
		return dto;
	}

	public void Modify(FBDto dto) throws SQLException {
		String sql = "update football set id=?, pw=?, win=?, round16=? where num=?";
		
		ps = conn.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getWin());
		ps.setString(4, dto.getRound16());
		ps.setString(5, dto.getNum());
		
		cnt = ps.executeUpdate();
	}

	public void Delete(String num) throws SQLException {
		String sql = "delete from football where num=?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, num);
		
		cnt = ps.executeUpdate();
	}
}
