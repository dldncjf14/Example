package com.spring.ex6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:aopExam2.xml");
		
		Student mystudent = (Student) context.getBean("mystudent");
		mystudent.getStudentInfo();
		
		System.out.println("=============");
		
		Worker myworker = (Worker) context.getBean("myworker");
		myworker.getWorkerInfo();
	}
}
