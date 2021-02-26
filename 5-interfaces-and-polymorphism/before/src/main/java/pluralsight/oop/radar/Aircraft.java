package pluralsight.oop.radar;

import pluralsight.oop.geography.Coordinate;

public class Aircraft {
    private String callSign;
    private Coordinate coordinate;
    private int altitudeFl;

    public Aircraft(String callSign, Coordinate coordinate, int altitudeFl) {
        this.callSign = callSign;
        this.coordinate = coordinate;
        this.altitudeFl = altitudeFl;
    }

    public String getCallSign() {
        return callSign;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public int getAltitudeFl() {
        return altitudeFl;
    }
}
