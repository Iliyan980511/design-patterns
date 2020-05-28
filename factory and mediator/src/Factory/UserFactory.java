package Factory;

public class UserFactory {
	public static Users getUsers(String type, String Fname, String Lname, String Egn){
		if("User1".equalsIgnoreCase(type)) return new User1();
		if("User2".equalsIgnoreCase(type)) return new User2();
		
		if("User3".equalsIgnoreCase(type)) return new User3();
		
		
		return null;
	}
}

