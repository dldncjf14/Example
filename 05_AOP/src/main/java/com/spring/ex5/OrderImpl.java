package com.spring.ex5;

public class OrderImpl implements Order {
	public void order() {
		String msg = "상품주문" ;		

		System.out.println( msg + "하기" );
	}
}