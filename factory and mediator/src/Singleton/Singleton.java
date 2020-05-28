package Singleton;



public class Singleton {
private static Singleton User;
	
	private static Singleton getInstance() {
		if(User == null) {
			User = new Singleton();
		}
		return User;
	}
	
	public Object printMessage(String msg) {
		System.out.println("User says addBot: " + msg);
		Object addBot = null;
		return addBot;
	}
	
	public static void main(String[] args) {
		
		Singleton st = Singleton.getInstance();
		st.printMessage("Bot has been added");

	}

}
