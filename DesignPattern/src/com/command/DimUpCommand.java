package com.command;

public class DimUpCommand implements ICommand{
	private Light light;
	public DimUpCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		this.light.dimUp();
	}
	
	@Override
	public void unexecute() {
		this.light.dimDown();
	}
}
