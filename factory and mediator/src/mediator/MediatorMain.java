package mediator;

public class MediatorMain {

    public static void main(String[] args) {

        MessageMediator mediator = new ChatMessageMediator();
        User user1 = new ChatUser(mediator, "User1");
        User user2 = new ChatUser(mediator, "User2");
        User user3 = new ChatUser(mediator, "User3");

        user1.send("addBot");
        printMessage("The user was removed because he used the forbidden word cat");

    }

	private static void printMessage(String string) {
		// TODO Auto-generated method stub
		
	}

}