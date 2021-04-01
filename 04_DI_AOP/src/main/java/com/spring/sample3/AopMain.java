package com.spring.sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		//Order myorder = new OrderImpl();
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:AOPexam.xml");
		OrderImpl myorder = (OrderImpl) context.getBean("myorder");
		myorder.order();//ÇÙ½É±â´É
		
		//Board myboard = new BoardImpl();
		//myboard.board();//ÇÙ½É±â´É
	}
}
