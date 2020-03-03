import java.lang.Math;
public class SphereCircumference implements ISubscriber {

    public void double getcircumference(double r)
    {
        return(Math.PI*2*r) ;
    }
    @Override
    public void notifySubscriber(String input) {
        System.out.println("Circumference of Sphere is " + getcircumference(Double.parseDouble(input)));
    }

}
