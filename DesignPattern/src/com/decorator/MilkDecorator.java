package com.decorator;

public class MilkDecorator extends AddOnDecorator{
	private Coffee coffee;
	public MilkDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
	@Override
	public double cost() {
		return this.coffee.cost() + 3.0D;
	}
}
