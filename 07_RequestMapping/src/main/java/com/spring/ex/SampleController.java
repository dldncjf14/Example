package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	@RequestMapping(value = "list")
	public String list(Model model) {
		model.addAttribute("name","�浿");
		
		return "sample/list";
	}
	
	@RequestMapping(value = "view")
	public ModelAndView view() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("addr","�����");
		mav.setViewName("sample/view");
		
		return mav;
	}
}
