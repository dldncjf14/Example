package com.spring.ex.command;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.ui.Model;

import com.spring.ex.dao.PDao;
import com.spring.ex.dto.PDto;

public class PListCommand implements PCommand{

	@Override
	public void execute(Model model) throws SQLException {
		PDao dao = PDao.getInstance();
		ArrayList<PDto> list = dao.list();
		model.addAttribute("list", list);
	}

}
