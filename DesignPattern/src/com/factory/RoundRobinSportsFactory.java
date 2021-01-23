package com.factory;

public class RoundRobinSportsFactory implements ISportsFactory {
	private int sportsIndex;
	private static String[] SPORT_NAMES = { "Cricket", "Football", "BasketBall" };

	public RoundRobinSportsFactory() {
		this.sportsIndex = 0;
	}

	@Override
	public ISports getSports() {
		ISports sportsObj = null;
		switch(SPORT_NAMES[this.sportsIndex]) {
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
		this.sportsIndex = (this.sportsIndex + 1) % SPORT_NAMES.length;
		return sportsObj;
	}
}
