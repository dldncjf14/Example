package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExamController {
	
	@RequestMapping(value = "form")
	public String form() {
		
		return "form";
	}
}
