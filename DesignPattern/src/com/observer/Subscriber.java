package com.observer;

public class Subscriber implements Observer {
	private String name;
	private Channel channel;
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println("Hey "+this.name+"!!Video with the title "+ this.channel.getTitle()  +" has been uploaded");
	}
	
	@Override
	public void subscribeChannel(Channel channel) {
		this.channel = channel;
	}
}
