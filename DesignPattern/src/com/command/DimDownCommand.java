package com.command;

public class DimDownCommand implements ICommand{
	private Light light;
	public DimDownCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		this.light.dimDown();
	}
	
	@Override
	public void unexecute() {
		this.light.dimUp();
	}
}
