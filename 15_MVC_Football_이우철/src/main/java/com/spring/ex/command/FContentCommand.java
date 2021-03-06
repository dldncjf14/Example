package com.spring.ex.command;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.ex.Dao.FBDao;
import com.spring.ex.Dto.FBDto;

public class FContentCommand implements command {

	@Override
	public void execute(Model model) throws SQLException {
		Map<String , Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("req");
		String num = request.getParameter("num");
		
		FBDao dao = FBDao.getInstance();
		
		FBDto dto = dao.selectByNum(num);
		model.addAttribute("dto",dto);
	}

}
