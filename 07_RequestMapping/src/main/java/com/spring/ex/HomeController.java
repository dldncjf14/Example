package com.spring.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
		
		return "home"; // /WEB-INF/views/ home .jsp
	}
	
	@RequestMapping(value = "/member/view") //method = request~~ 작성 하지 않으면 get / post 모두 처리
	public String view() {
		
		return "member/memberView";
	}
	@RequestMapping(value = "/member/inputForm")
	public String input(Model model, HttpServletRequest request) {
		model.addAttribute("id","abc");
		request.setAttribute("pw", "xyz");
		return "member/inputForm";
	}
	
	@RequestMapping(value = "/member/list")
	public ModelAndView list() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("name","태연");
		mav.addObject("pw",1234);
		mav.setViewName("member/list");
		return mav;
		//return "member/list";
	}
	
}
