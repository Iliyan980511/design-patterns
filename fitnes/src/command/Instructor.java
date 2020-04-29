package command;

import command.command;

public class Instructor {

	private command command;	

	public void setCommand(command command) {
		this.command = command;
	}
	
	public void ChangeTraining() {
		System.out.println("Instructor changed training");
		this.command.execute();
	}
}