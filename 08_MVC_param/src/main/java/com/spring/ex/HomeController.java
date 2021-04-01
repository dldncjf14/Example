package com.spring.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/person/input", method = RequestMethod.GET)
	public String inputForm(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println(name);
		System.out.println(age);
		
		request.setAttribute("name2", name +"씨");
		model.addAttribute("name3", name + "님");
		return "person/result";
	}
	
	@RequestMapping(value = "/form")
	public String form() {
		
		return "person/input";
	}
	
	@RequestMapping(value = "/person/join1")
	public String join1(@RequestParam("id") String id,
			@RequestParam("pw") String pw,
			@RequestParam("name") String name,
			@RequestParam("addr") String addr,
			HttpServletRequest request,
			Model model) {
		//System.out.println("join1");
		/*String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String addr = request.getParameter("addr");*/
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		System.out.println(addr);
		
		Pbean per = new Pbean();
		per.setId(id);
		per.setPw(pw);
		per.setName(name);
		per.setAddr(addr);
		
		model.addAttribute("per", per);
		return "person/personResult1";
	}
	
	@RequestMapping(value = "/person/join2")
	public String join2(HttpServletRequest request,
			Pbean p) {//command 객체
		/*String id = request.getParameter("id");
		Pbean p = new Pbean();
		p.setId(id); 메서드 정의에 Pbean p 로 작성하면 위 과정 생략 가능*/
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPw());
		System.out.println(p.getAddr());
		return "person/PersonResult2";
	}
	
	@RequestMapping(value = "/person/join3")
	public String join3(@ModelAttribute("abcd") Pbean per) { //@ModelAttribute("name") : 별칭 설정
		System.out.println(per.getId());
		
		return "person/personResult3";
	}
}
