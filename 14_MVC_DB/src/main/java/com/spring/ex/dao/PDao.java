package com.spring.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.spring.ex.dto.PDto;

public class PDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String dbId = "jspid";
	private String dbPw = "jsppw";
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement ps = null;
	private int cnt = -1;
	
	private PDao() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, dbId, dbPw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static PDao instance = null;
	
	public static PDao getInstance() {
		
		if(instance==null) {
			instance =new PDao();
		}
		
		return instance;
	}
	
	public void write(String id, String name, String age) throws SQLException {
		String sql = "insert into person values(person_seq.nextval,?,?,?)";
		
		ps = conn.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, name);
		ps.setString(3, age);
		
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

	public ArrayList<PDto> list() throws SQLException {
		String sql = "select * from person order by num";
		ArrayList<PDto> list = new ArrayList<PDto>();
		
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			int num = rs.getInt(1);
			String id = rs.getString(2);
			String name = rs.getString(3);
			String age = rs.getString(4);
			
			PDto dto = new PDto(num, id, name, age);
			list.add(dto);
		}
		fncls();
		return list;
	}

	public PDto contentView(String num) throws SQLException {
		String sql = "select * from person where num=?";
		PDto dto = null;
		ps = conn.prepareStatement(sql);
		ps.setString(1, num);
		
		rs = ps.executeQuery();
		while(rs.next()) {
			int num1 = rs.getInt(1);
			String id = rs.getString(2);
			String name = rs.getString(3);
			String age = rs.getString(4);
			
			dto = new PDto(num1, id, name, age);
		}
		return dto;
	}

	public void modify(PDto dto) throws SQLException {
		String sql = "update person set name=?, age=? where num=?";
		System.out.println(dto.getId());
		System.out.println(dto.getNum());
		
		ps = conn.prepareStatement(sql);
		ps.setString(1, dto.getName());
		ps.setString(2, dto.getAge());
		ps.setInt(3, dto.getNum());
		
		ps.executeUpdate();
		
		fncls();
	}

	public void delete(int num) throws SQLException {
		String sql = "delete from person where num=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, num);
		
		cnt = ps.executeUpdate();
		
		fncls();
	}
}
