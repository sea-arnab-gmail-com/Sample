package com.design.pattern;

public class PrototypeMain {
	public static void main(String[] args) throws CloneNotSupportedException{
		BookShop bookShop = new BookShop();
		bookShop.setBookShopName("Honesty");
		bookShop.loadData();
		System.out.println(bookShop);
		
		BookShop bookShop1 = (BookShop)bookShop.clone();
		bookShop.getBookList().remove(2);
		System.out.println(bookShop1);
	}
}
