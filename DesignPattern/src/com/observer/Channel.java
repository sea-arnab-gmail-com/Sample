package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	private List<Subscriber> subscribers = new ArrayList<>();
	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void subscribe(Subscriber subscriber) {
		this.subscribers.add(subscriber);
	}
	
	@Override
	public void unsubscribe(Observer subscriber) {
		this.subscribers.remove(subscriber);
	}
	
	@Override
	public void sendNotification() {
		this.subscribers.forEach(subscriber->subscriber.update());
	}
	
	@Override
	public void upload(String title) {
		this.title = title;
		sendNotification();
	}
	
}
