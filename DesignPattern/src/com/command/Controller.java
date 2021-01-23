package com.command;

public class Controller {
	private ICommand turnOnCommand;
	private ICommand turnOffCommand;
	private ICommand dimUpCommand;
	private ICommand dimDownCommand;
	public Controller(ICommand turnOnCommand,ICommand turnOffCommand,ICommand dimUpCommand,ICommand dimDownCommand) {
		this.turnOnCommand = turnOnCommand;
		this.turnOffCommand = turnOffCommand;
		this.dimUpCommand = dimUpCommand;
		this.dimDownCommand = dimDownCommand;
	}
	public void clickOn() {
		this.turnOnCommand.execute();
	}
	public void clickOff() {
		this.turnOffCommand.execute();
	}
	public void dimUp() {
		this.dimUpCommand.execute();
	}
	public void dimDown() {
		this.dimDownCommand.execute();
	}
}
