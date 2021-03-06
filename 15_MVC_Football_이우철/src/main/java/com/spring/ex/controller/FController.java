package com.spring.ex.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ex.command.FContentCommand;
import com.spring.ex.command.FDelete;
import com.spring.ex.command.FListCommand;
import com.spring.ex.command.FModify;
import com.spring.ex.command.FWriteCommand;
import com.spring.ex.command.command;

@Controller
public class FController {
	command com = null;
	String rlist = "redirect:list";
	
	@RequestMapping(value = "/form")
	public String form() {
		
		return "write_view";
	}
	
	@RequestMapping(value = "write")
	public String write(Model model,
			HttpServletRequest request) throws SQLException {
		com = new FWriteCommand();
		model.addAttribute("req", request);
		com.execute(model);
		
		return rlist;
	}
	
	@RequestMapping(value = "list")
	public String list(Model model,
			HttpServletRequest request) throws SQLException{
		com = new FListCommand();
		com.execute(model);
		return "list";
	}
	
	@RequestMapping(value = "content")
	public String content(Model model,
			HttpServletRequest request) throws SQLException {
		
		com = new FContentCommand();
		model.addAttribute("req", request);
		com.execute(model);
		return "content";
	}
	
	@RequestMapping(value = "modify")
	public String modify(Model model,
			HttpServletRequest request) throws SQLException {
		
		com = new FModify();
		model.addAttribute("req", request);
		com.execute(model);
		return rlist;
	}
	
	@RequestMapping(value = "delete")
	public String delete(Model model,
			HttpServletRequest request) throws SQLException {
		
		com = new FDelete();
		model.addAttribute("req", request);
		com.execute(model);
		return rlist;
	}
}
