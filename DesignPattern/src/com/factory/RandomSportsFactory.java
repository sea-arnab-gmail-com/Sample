package com.factory;

public class RandomSportsFactory implements ISportsFactory{
	@Override
	public ISports getSports() {
		ISports sportsObj = null;
		String[] sports = {"Cricket","Football","BasketBall"};
		int sportsIndex = Double.valueOf(Math.random() *  3).intValue();
		switch(sports[sportsIndex]) {
		case "Cricket":
			sportsObj = new Cricket();
			break;
		case "Football":
			sportsObj = new Football();
			break;
		case "BasketBall":
			sportsObj = new BasketBall();
			break;
		}	
		return sportsObj;
	}
}
