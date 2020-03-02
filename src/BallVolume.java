import java.lang.Math;
public class SphereVolume implements ISubscriber {

    public static double getVolume(double r)
    {
        return (
                  (4*Math.PI*Math.pow(r,3))/3
                );
    }
    @Override
    public void notifySubscriber(String input) {
        System.out.println("Volume of Ball (radius= " + Double.parseDouble(input)+ ")= " + getVolume(Double.parseDouble(input)));
    }
}
