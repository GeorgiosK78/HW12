package de.uni.koeln.se.bookstore.datamodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private String author;
	private Integer dateyear;
	//neu
	private int price;
	
	public Book() {}
	
	public Book(String name, String author, Integer dateyear) {
		this.name=name;
		this.author=author;
		this.dateyear=dateyear;
	}
	
	//neu
	public Book(String name, String author, Integer dateyear,int price) {
		this.name=name;
		this.author=author;
		this.dateyear=dateyear;
		this.price=price;
	}
	//getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getDateyear() {
		return dateyear;
	}

	public void setDateyear(Integer dateyear) {
		this.dateyear = dateyear;
	}

	//neu
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	
	
	
	
}
