package com.proxy;

public class ProxyBookParser implements IBookParser{
	private BookParser bookParser;
	private String bookContent;
	public ProxyBookParser(String bookContent) {
		this.bookContent = bookContent;
	}	
	@Override
	public int getNumberOfWords() {
		if(null == this.bookParser)
			this.bookParser = new BookParser(this.bookContent);
		return this.bookParser.getNumberOfWords();
	}
}
