package com.spring.ex.command;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.ex.dao.PDao;
import com.spring.ex.dto.PDto;

public class PContentViewCommand implements PCommand{

	@Override
	public void execute(Model model) throws SQLException {
		Map<String, Object> map = model.asMap(); //model 을 map형태로 변환
		HttpServletRequest request = (HttpServletRequest)map.get("request"); //map을 request로 변환
		String num = request.getParameter("num");
		
		PDao dao = PDao.getInstance();
		PDto dto = dao.contentView(num);
		model.addAttribute("dto", dto);
	}

}
