package com.spring.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String formf() {
		
		return "form";
	}
	
	/*@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String form(HttpServletRequest request,
			@RequestParam("pw") String pw,
			@RequestParam("name") String name) {
		StudentBean sb = new StudentBean();
		sb.setName(name);
		sb.setPw(pw);
		request.setAttribute("sb", sb);
		return "result";
	}*/
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String form2(HttpServletRequest request,
			@ModelAttribute("sb") @Valid StudentBean sb,
			BindingResult result) {
		
		System.out.println("result.hasError : "+result.hasErrors());
		String viewPage = "result";
		if(result.hasErrors()) {
			viewPage = "form";
		}
		return viewPage;
	}
}
