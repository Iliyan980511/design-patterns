package Factory;

public abstract class Users {
	
	public abstract String Fname();
	public abstract String Lname();
	public abstract String Egn();
	
	@Override
	public String toString(){
		return "Fname= "+this.Fname()+", Lname="+this.Lname()+", Egn="+this.Egn();
	}
	public String getIvan() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getFname() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLname() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEgn() {
		// TODO Auto-generated method stub
		return null;
	}
}
