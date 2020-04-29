package observer;
import java.util.ArrayList;
import java.util.List;


public class workout implements Iobservable{

	private List<Iobserver> observers = new ArrayList<Iobserver>();
	private String training;

	public void setTraining(String training) {
		this.training = training;
		this.notifyobservers();
	}
	
	@Override
	public void notifyobservers() {
		for(Iobserver observer: this.observers) {
			observer.update();
		}
		
	}
	@Override
	public String getUpdate() {
		return training;
	}

		
	

	@Override
	public void unsubscribe(Iobserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subscribe(Iobserver observer) {
		// TODO Auto-generated method stub
		
	}

}