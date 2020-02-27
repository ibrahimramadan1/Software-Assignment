import java.lang.Math; 

public class twoPowerN implements ISubscriber{

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		double x= Double.parseDouble(input);
		double result=Math.pow(2,x);
		System.out.println("2 Power "+x+" is "+result);
		
	}

}
