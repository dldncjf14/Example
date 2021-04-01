package com.spring.ex.command;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.ex.Dao.FBDao;
import com.spring.ex.Dto.FBDto;

public class FModify implements command {

	@Override
	public void execute(Model model) throws SQLException {
		Map<String , Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("req");
		String num = request.getParameter("num");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String win = request.getParameter("win");
		String round[] = request.getParameterValues("round16");
		String round16 = "";
		for (int i = 0; i < round.length; i++) {
			round16 += round[i];
			if(round.length-1>i) {
				round16 += " ";
			}
		}
		
		FBDto dto = new FBDto(num, id, pw, win, round16);
		FBDao dao = FBDao.getInstance();
		dao.Modify(dto);
	}

}
