package Factory;

public class User2 extends Users {

	private String Fname;
	private String Lname;
	private String Egn;
	
	public void Users(String Fname, String Lname, String Egn){
		this.Fname=Fname;
		this.Lname=Lname;
		this.Egn=Egn;
	}
	@Override
	public String getFname() {
		return this.Fname;
	}

	@Override
	public String getLname() {
		return this.Lname;
	}

	@Override
	public String getEgn() {
		return this.Egn;
	}
	@Override
	public String Fname() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Lname() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Egn() {
		// TODO Auto-generated method stub
		return null;
	}

}

