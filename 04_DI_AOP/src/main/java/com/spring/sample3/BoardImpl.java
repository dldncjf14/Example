package com.spring.sample3;

public class BoardImpl implements Board{

	@Override
	public void board() {
		String msg = "게시물 등록";
		System.out.println(msg+"하기");//핵심기능
	}

}
