package com.spring.ex;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;

public class BookBean {
	@NotEmpty(message = "������ �Է��ϼ���")
	private String title;
	@Length(min = 5, message = "���ڴ� 5���� �̻� �Է��ϼ���")
	private String author;
	@Pattern(regexp = "^[0-9]+$", message = "���ڸ� �Է°����մϴ�")
	@Max(value = 9999, message = "������ 5�ڸ� ������ ���ڸ� �Է��ϼ���")
	private String price;
	@NotEmpty(message = "���ǻ縦 �Է��ϼ���")
	private String publisher;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public BookBean(String title, String author, String price, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	public BookBean() {
		super();
	}
	
}