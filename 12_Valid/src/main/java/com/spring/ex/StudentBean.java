package com.spring.ex;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class StudentBean {
	@NotEmpty(message = "�̸��� �Է��ϼ���")
	private String name;
	/*@NotEmpty(message = "��й�ȣ�� �Է��ϼ���")
	@Length(max = 5, min = 3, message = "��й�ȣ�� 3~5���ڸ� �Է��ϼ���")*/
	@Size(max = 5, min = 3, message = "3~5���ڸ� �Է°���")
	@Pattern(regexp = "^[0-9]+$", message = "pw�� ���ڸ� �Է� �����մϴ�") //���ڷ� �����ؼ� ���ڷ� ����. 1�� �̻��� ���ڸ� �Է��ؾ���
	//@Pattern(regexp = "^[0-9]{3,5}$", message = "pw�� ���ڸ� �Է�") //���ڸ� �Է�, �ּ� 3���� �ִ� 5����
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
