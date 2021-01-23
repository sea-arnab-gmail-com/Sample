package com.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	private String bookShopName;
	private List<Book> bookList = new ArrayList<>();
	public String getBookShopName() {
		return bookShopName;
	}
	public void setBookShopName(String bookShopName) {
		this.bookShopName = bookShopName;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public void loadData() {
		for(int i=1;i<=10;i++) {
			Book book = new Book();
			book.setBid(i);
			book.setBname("Book"+i);
			this.bookList.add(book);
		}
	}
	@Override
	public String toString() {
		return "BookShop [bookShopName=" + bookShopName + ", bookList=" + bookList + "]";
	}
	
	@Override
	public BookShop clone() throws CloneNotSupportedException{
		BookShop bookShop = new BookShop();
		bookShop.setBookShopName(this.bookShopName);
		bookShop.getBookList().addAll(this.bookList);
		return bookShop;
	}
}
