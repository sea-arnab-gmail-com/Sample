package com.factory;

public class FactoryClient {
	public static void main(String[] args) {
		ISportsFactory sportsFactory = new RandomSportsFactory();
		ISports sportsObj = sportsFactory.getSports();
		System.out.println("Random Sports Factory");
		sportsObj.play();
		sportsFactory = new RoundRobinSportsFactory();
		System.out.println("Round Robin Sports Factory");
		for (int i = 1; i <= 10; i++) {
			sportsObj = sportsFactory.getSports();
			sportsObj.play();
		}
	}
}
