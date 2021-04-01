package com.spring.ex.command;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.ui.Model;

import com.spring.ex.Dao.FBDao;
import com.spring.ex.Dto.FBDto;

public class FListCommand implements command {

	@Override
	public void execute(Model model) throws SQLException {
		FBDao dao = FBDao.getInstance();
		ArrayList<FBDto> list = dao.List();
		model.addAttribute("list", list);
	}

}
