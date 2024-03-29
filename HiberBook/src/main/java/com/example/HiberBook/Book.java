package com.example.HiberBook;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Long id;
@Column(name="title")
private String title;
@Column(name="author")
private String author;
@Column(name="year")
private int year;
@Column(name="price")
private double price;
// Constructors
public Book() {
super();
// TODO Auto-generated constructor stub
}
public Book(Long id, String title, String author, int year, double price) {
super();
this.id = id;
this.title = title;
this.author = author;
this.year = year;
this.price = price;
}
public Book(String title, String author, int year, double price) {
super();
this.title = title;
this.author = author;
this.year = year;
this.price = price;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
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
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" +
year + ", price=" + price + "]";
}
}