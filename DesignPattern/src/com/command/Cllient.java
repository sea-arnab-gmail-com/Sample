package com.command;

public class Cllient {
	public static void main(String[] args) {
		Light light = new Light();
		ICommand turnOnCommand = new TurnOnCommand(light);
		ICommand turnOffCommand = new TurnOffCommand(light);
		ICommand dimUpCommand = new DimUpCommand(light);
		ICommand domDownCommand = new DimDownCommand(light);
		Controller controller = new Controller(turnOnCommand,turnOffCommand,dimUpCommand,domDownCommand);
		controller.clickOn();
		controller.clickOff();
		controller.dimUp();
		controller.dimDown();
	}
}
