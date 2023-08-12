package pluralsight.oop;

public final class ConversionHelper {
//    Change altitude from feet to flylevel
    private static final int METERS_IN_ONE_NM = 1852;
//    We can also use this MIONM variable as private static int without the final keyword so that we
//    can assign any value to it.
//    To define a static block initializer you use the keyword static
    /*   static {
    *           metersInOneNm = 1852;
    *           }
    *
    * */
    public static int fromFeetToFL(int feet){
        return feet/100;
    }
//    Converts Meters in one Nautical Mile, which uses a static variable DECLARED FINAL (constant that takes 1 nautical
//    mile to be 1852)
    public static double fromNmToMeters(double nm){
        return nm * METERS_IN_ONE_NM;
    }
}
