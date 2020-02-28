public class Fibonacci implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		int integer = Integer.parseInt(input);
		int result = 0;
		if (integer <= 0) {
			result = 0;
		} else if (integer == 1) {
			result = 1;
		} else {
			int prevOfPrev = 0;
			int prev = 1;
			for(int times = 0; times <= integer - 2; times++) {
				result = prev + prevOfPrev;
				prevOfPrev = prev;
				prev = result;
			}
		}
		System.out.println("The fibonacci number is :" + result);
	}
}
