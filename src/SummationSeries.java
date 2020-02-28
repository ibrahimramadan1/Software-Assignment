public class SummationSeries implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        try{
            int number = Integer.parseInt(input);
            double result = (number*(number+1))/2.0;
            System.out.println("summation from 1 to "+number+" is : "+result);
        }catch (NumberFormatException ignore){

        }
    }
}
