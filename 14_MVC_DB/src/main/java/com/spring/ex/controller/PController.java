package com.spring.ex.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ex.command.PCommand;
import com.spring.ex.command.PContentViewCommand;
import com.spring.ex.command.PDeleteCommand;
import com.spring.ex.command.PListCommand;
import com.spring.ex.command.PModifyCommand;
import com.spring.ex.command.PWriteCommand;

@Controller
public class PController {
	PCommand command= null;
	@RequestMapping(value = "/form")
	public String form() {
		
		return "form";
	}
	
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request, Model model) throws SQLException {
		
		model.addAttribute("req", request);
		command = new PWriteCommand();
		command.execute(model);
		return "redirect:list";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) throws SQLException {
		command = new PListCommand();
		command.execute(model);
		
		return "list";
	}
	
	@RequestMapping(value = "content_view")
	public String list(HttpServletRequest request,
			Model model) throws SQLException {
		/*String num = request.getParameter("num");
		System.out.println("num : "+ num);*/
		
		command = new PContentViewCommand();
		model.addAttribute("request", request);
		command.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping(value = "modify")
	public String modify(Model model,
			HttpServletRequest request) throws SQLException {
		command = new PModifyCommand();
		model.addAttribute("request", request);
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "delete")
	public String delete(Model model,
			HttpServletRequest request) throws SQLException {
		command = new PDeleteCommand();
		model.addAttribute("request", request);
		command.execute(model);
		
		return "redirect:list";
	}
}
