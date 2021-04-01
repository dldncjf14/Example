package com.spring.ex.command;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.ex.dao.PDao;
import com.spring.ex.dto.PDto;

public class PWriteCommand implements PCommand{

	@Override
	public void execute(Model model) throws SQLException {
		Map<String, Object> map = model.asMap(); //asMap : data를 map 형태로 변경
		HttpServletRequest request = (HttpServletRequest)map.get("req");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		PDao dao = PDao.getInstance();
		dao.write(id, name, age);
	}

}
