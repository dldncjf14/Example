package com.spring.ex.command;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.ex.dao.PDao;
import com.spring.ex.dto.PDto;

public class PModifyCommand implements PCommand {

	@Override
	public void execute(Model model) throws SQLException {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		int num = Integer.parseInt(request.getParameter("num"));
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(num);
		PDao dao = PDao.getInstance();
		PDto dto = new PDto(num, id, name, age);
		dao.modify(dto);
		
	}

}
