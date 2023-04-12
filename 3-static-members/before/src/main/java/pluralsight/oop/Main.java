package pluralsight.oop;
//using the static import
import static java.lang.System.out;
import static pluralsight.oop.ConversionHelper.fromNmToMeters;

public class Main {
    public static void main(String[] args) {
        int altitudeInFeet = 28000;
        double distInNm = 10;
//        Call the class name and class methods to call the convertor methods
        int altitudeInFL = ConversionHelper.fromFeetToFL(300);
        System.out.println(altitudeInFeet + " fr -> FL " + altitudeInFL);

//        Let's use a static import for the final conversion calling the method only
         double distInMeters = fromNmToMeters(10);
         out.println(distInNm + " NM ->  " + distInMeters + "m");

//          To instantiate the distance class, we cannot use the distance class directly, we have to use
//          calculate class then period and the static class name
        Calculators.Distance d = new Calculators.Distance(1, 2 ,3,4 );
        out.println("Distance is " + d.calculate());
    }
}
