package com.decorator;

public class CaramelDecorator extends AddOnDecorator{
	private Coffee coffee;
	public CaramelDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public double cost() {
		return this.coffee.cost() + 4.0D;
	}
}
