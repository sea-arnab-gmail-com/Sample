package com.observer;

public interface Subject {

	void subscribe(Subscriber subscriber);

	void unsubscribe(Observer subscriber);

	void sendNotification();

	void upload(String title);

}