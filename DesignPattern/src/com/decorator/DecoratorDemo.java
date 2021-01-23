package com.decorator;

public class DecoratorDemo {
	public static void main(String[] args) {
		Coffee coffee = new ChocolateDecorator(new MilkDecorator(new Expresso()));
		System.out.println("Coffee Cost="+coffee.cost());
		
	}	
}	