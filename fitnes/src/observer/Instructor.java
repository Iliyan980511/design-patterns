package observer;

import observer.workout;

public class Instructor {
	workout trainee;
	public Instructor(workout trainee)
	{
		this.trainee = trainee;
	}
	public void ChangeTraining(String newTraining)
	{
		this.trainee.setTraining(newTraining);
	}
	
}
