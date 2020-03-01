import java.lang.Math;
public class SphereCircumference implements ISubscriber {

    public void double Circumference(double r)
    {
        double circumference= Math.PI*2*r;
        System.out.println( "The circumference of the circle is:"+circumference) ;
    }

}
