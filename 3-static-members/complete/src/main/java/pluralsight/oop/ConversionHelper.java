package pluralsight.oop;

public final class ConversionHelper {
    private static int metersInOneNm;

    static {
        metersInOneNm = 1852;
    }

    public static int fromFeetToFL(int feet) {
        return feet / 100;
    }

    public static double fromNmToMeters(double nm) {
        return nm * metersInOneNm;
    }
}
