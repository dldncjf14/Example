package com.spring.ex5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
  
public class AopMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:aopExam.xml");
		
		
		System.out.println("--- 상품 주문 하기 ---");  
		Order myorder =  (Order)context.getBean("myorder");
		myorder.order();  
		 
		System.out.println("--- 게시물 등록 하기 ---");
		Board myboard = (Board)context.getBean("myboard");
		myboard.board();
	}
}
