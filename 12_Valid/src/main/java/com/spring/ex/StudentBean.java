package com.spring.ex;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class StudentBean {
	@NotEmpty(message = "이름을 입력하세요")
	private String name;
	/*@NotEmpty(message = "비밀번호를 입력하세요")
	@Length(max = 5, min = 3, message = "비밀번호는 3~5글자를 입력하세요")*/
	@Size(max = 5, min = 3, message = "3~5글자만 입력가능")
	@Pattern(regexp = "^[0-9]+$", message = "pw는 숫자만 입력 가능합니다") //숫자로 시작해서 숫자로 끝남. 1개 이상의 숫자를 입력해야함
	//@Pattern(regexp = "^[0-9]{3,5}$", message = "pw는 숫자만 입력") //숫자만 입력, 최소 3글자 최대 5글자
	private String pw;
	
	public StudentBean() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
}
