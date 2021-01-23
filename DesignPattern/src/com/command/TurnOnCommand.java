package com.command;

public class TurnOnCommand implements ICommand{
	private Light light;
	public TurnOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		this.light.turnOn();
	}
	
	@Override
	public void unexecute() {
		this.light.turnOff();
	}
}
