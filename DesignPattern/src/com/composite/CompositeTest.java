package com.composite;

public class CompositeTest {
	public static void main(String[] args) {
		Component hd = new Leaf(5000,"Hard Drive");
		Component monitor = new Leaf(4000,"Monitor");
		Component mouse = new Leaf(500,"Mouse");
		Component cpu = new Leaf(10000,"CPU");
		Component ram = new Leaf(8000,"RAM");
		
		Composite peripheral = new Composite("Peripheral");
		Composite cabinet = new Composite("Cabinet");
		Composite motherBoard = new Composite("MotherBoard");
		Composite computer = new Composite("Computer");
		
		motherBoard.addComponent(cpu);
		motherBoard.addComponent(ram);
		
		peripheral.addComponent(monitor);
		peripheral.addComponent(mouse);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(motherBoard);
		
		
		computer.addComponent(peripheral);
		computer.addComponent(cabinet);
		
		computer.showPrice();
		
	}
}
