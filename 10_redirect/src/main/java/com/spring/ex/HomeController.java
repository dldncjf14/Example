package com.spring.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping(value = "/form")
	public String form() {

		return "form";
	}
	
	@RequestMapping(value = "/input")
	public String input(HttpServletRequest request,
			Model model,
			RedirectAttributes rattr) {
		String name = request.getParameter("name");
		request.setAttribute("name2", name);
		model.addAttribute("mname", name);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hname", name);
		rattr.addFlashAttribute("redmap",map);
		
		return "redirect:/input2"; //다른 메서드로 이동
	}
	
	@RequestMapping(value = "/input2")
	public String input2(HttpServletRequest request) {
		System.out.println("input2()");
		String name = request.getParameter("name");
		String name2 = request.getParameter("name2");
		String mname = request.getParameter("mname");
		
		System.out.println(name);
		System.out.println(name2);
		System.out.println(mname);
		
		name = (String)request.getAttribute("name");
		name2 = (String)request.getAttribute("name2");
		mname = (String)request.getAttribute("mname");
		
		System.out.println(name);
		System.out.println(name2);
		System.out.println(mname);
		return "result";
	}
}
