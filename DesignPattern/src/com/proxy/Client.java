package com.proxy;

public class Client {
	public static void main(String[] args) {
		String bookContent = "ABC DEF GHI JKL MNO";
		IBookParser bookParser = new ProxyBookParser(bookContent);
		System.out.println("Number Of Words="+bookParser.getNumberOfWords());
	}
}
