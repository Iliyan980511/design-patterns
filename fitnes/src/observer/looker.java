package observer;

import observer.Iobservable;
import observer.Iobserver;

public class looker implements Iobserver {
	private String training;
	private Iobservable trainee;
	
	public looker() {
	}

	@Override
	public void update() {
		if(trainee == null) {
			System.out.println("No trainee");
			return;
		}
		
		training = trainee.getUpdate();
		System.out.println("Viewer changed training to "+ this.training);
		
	}

	@Override
	public void setworkout(Iobservable trainee) {
		this.trainee = trainee;
	}
	
	public String getTraining() {
		return this.training;
	}

	public void setTraining(String training) {
		this.training = training;
	}

	@Override
	public void setworkout1(Iobservable observer) {
		// TODO Auto-generated method stub
		
	}

	
	


}
