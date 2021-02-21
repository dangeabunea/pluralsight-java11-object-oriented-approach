package pluralsight.oop;

import static pluralsight.oop.ConversionHelper.fromNmToMeters;

public class Main {
    public static void main(String[] args) {
        int altitudeInFeet = 28000;
        double distInNm = 10;

        int altitudeInFl = ConversionHelper.fromFeetToFL(altitudeInFeet);
        System.out.println(altitudeInFeet + " ft -> FL" + altitudeInFl);

        double distInMeters = fromNmToMeters(10);
        System.out.println(distInNm + " Nm -> " + distInMeters + " m");

        Calculators.Distance d = new Calculators.Distance(1,1,3,3);
        System.out.println("Distance is " + d.calculate());
    }
}
