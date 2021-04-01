package com.spring.ex5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
  
public class AopMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:aopExam.xml");
		
		
		System.out.println("--- ��ǰ �ֹ� �ϱ� ---");  
		Order myorder =  (Order)context.getBean("myorder");
		myorder.order();  
		 
		System.out.println("--- �Խù� ��� �ϱ� ---");
		Board myboard = (Board)context.getBean("myboard");
		myboard.board();
	}
}
