
public class SimpleSubscriber implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		System.out.println("Hello, I am a simple subscriber and I am notified with " + input);
	}

}
