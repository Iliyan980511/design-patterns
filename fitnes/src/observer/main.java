package observer;

public class main {

	public main(String[] args) {
		workout trainee = new workout();
		Instructor instructor = new Instructor(trainee);
		Iobserver viewer1 = new looker();
		Iobserver viewer2 = new looker();
		Iobserver viewer3 = new looker();
		
		trainee.subscribe(viewer1);
		trainee.subscribe(viewer2);
		trainee.subscribe(viewer3);
		
		instructor.ChangeTraining("Stani");
		System.out.println();
		instructor.ChangeTraining("Legni");



	}

}

