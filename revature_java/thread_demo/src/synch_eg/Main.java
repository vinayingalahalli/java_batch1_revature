package synch_eg;

public class Main {

	public static void main(String[] args) {
		new MessageThread("hey hi", " how u doing?");
		new MessageThread("good evening", " i am doing good....");
		new MessageThread("hey", " are you free?");
		new MessageThread("please", " focus on threads rather than messages");
		new MessageThread("synch", " is there");

	}

}