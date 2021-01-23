package com.proxy;

public class BookParser implements IBookParser{
	private int numberOfWords;
	public BookParser(String bookContent) {
		this.numberOfWords = 0;
		if(null != bookContent) {
			bookContent = bookContent.trim();
			if(bookContent.length() > 0 && bookContent.contains(" ")) {
				String[] words = bookContent.split(" ");
				this.numberOfWords = words.length;
			}
		}
	}	
	@Override
	public int getNumberOfWords() {
		return this.numberOfWords;
	}
}
