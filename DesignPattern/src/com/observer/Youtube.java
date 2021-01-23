package com.observer;

public class Youtube {

	public static void main(String[] args) {
		Channel channel = new Channel();
		
		Subscriber s1 = new Subscriber("Arnab");
		Subscriber s2 = new Subscriber("Akshay");
		Subscriber s3 = new Subscriber("Atanu");
		Subscriber s4 = new Subscriber("Arunava");
		
		channel.subscribe(s1);
		channel.subscribe(s2);
		channel.subscribe(s3);
		channel.subscribe(s4);
		
		s1.subscribeChannel(channel);
		s2.subscribeChannel(channel);
		s3.subscribeChannel(channel);
		s4.subscribeChannel(channel);
		
		channel.upload("Spirituality");
	}

}
