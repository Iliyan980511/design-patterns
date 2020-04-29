package command;

import command.command;
import command.workout;

public class downcommand implements command{
	
	private workout trainee;
	
	public downcommand(workout trainee) {
		this.trainee = trainee;
	}
	@Override
	public void execute() {
		trainee.setTraining("Legni");
	}
}