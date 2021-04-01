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
	
	@RequestMapping(value = "form")
	public String form() {
		
		return "form";
	}
	@RequestMapping(value = "input1")
	public String input1(HttpServletRequest request,
			Model model,
			@RequestParam("title") String title,
			@RequestParam("singer") String singer,
			@RequestParam("price") int price) {
		
		MusicBean mbean = new MusicBean(title, singer, price);
		request.setAttribute("mbean", mbean);
		model.addAttribute("mbean", mbean);
		return "result1";
	}
	
	@RequestMapping(value = "input2")
	public String input2(MusicBean mbean) {
		
		return "result2";
	}
	
	@RequestMapping(value = "input3")
	public String input3(@ModelAttribute("mb") MusicBean mbean) {
		
		return "result3";
	}
}
