package command;

import command.command;
import command.Instructor;
import command.downcommand;
import command.standcommand;
import command.workout;
import command.looker;

public class main {

	public main(String[] args) {
		Instructor instructor = new Instructor();
		workout trainee = new workout();
		
		looker viewer1 = new looker();
		looker viewer2 = new looker();
		looker viewer3 = new looker();
		
		trainee.subscribe(viewer1);
		trainee.subscribe(viewer2);
		trainee.subscribe(viewer3);
		
		
		command changeTrainingToLegni = new downcommand(trainee);
		command changeTrainingToStani = new standcommand(trainee); 
		
		instructor.setCommand(changeTrainingToLegni);
		instructor.ChangeTraining();
		
		instructor.setCommand(changeTrainingToStani);
		instructor.ChangeTraining();
		
	}
}

