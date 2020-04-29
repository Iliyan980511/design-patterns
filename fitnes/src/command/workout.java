package command;

import java.util.ArrayList;
import java.util.List;

public class workout {
	private String training;
	private List<looker> viewers = new ArrayList<looker>();

	
	
	public void setTraining(String training)
	{
		this.training = training;
		for(looker viewer: this.viewers) {
			viewer.setTraining(this.training);
		}		
	}
	public void subscribe(looker viewer) {
		this.viewers.add(viewer);		
	}
}
