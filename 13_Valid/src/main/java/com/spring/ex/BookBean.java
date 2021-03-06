package com.spring.ex;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;

public class BookBean {
	@NotEmpty(message = "제목을 입력하세요")
	private String title;
	@Length(min = 5, message = "저자는 5글자 이상 입력하세요")
	private String author;
	@Pattern(regexp = "^[0-9]+$", message = "숫자만 입력가능합니다")
	@Max(value = 9999, message = "가격은 5자리 이하의 숫자를 입력하세요")
	private String price;
	@NotEmpty(message = "출판사를 입력하세요")
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
