package com.decorator;

public class ChocolateDecorator extends AddOnDecorator{
	private Coffee coffee;
	public ChocolateDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public double cost() {
		return this.coffee.cost() + 2.0D;
	}
}