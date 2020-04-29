package command;

import command.command;
import command.workout;

public class standcommand implements command{
	private workout trainee;
	
	public standcommand(workout trainee) {
		this.trainee = trainee;
	}
	@Override
	public void execute() {
		trainee.setTraining("Stani");
	}
}