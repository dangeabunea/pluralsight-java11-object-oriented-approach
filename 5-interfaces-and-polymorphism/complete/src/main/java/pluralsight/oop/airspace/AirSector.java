package pluralsight.oop.airspace;

import pluralsight.oop.geography.Coordinate;

public interface AirSector {
    boolean isInSector(Coordinate x, int altitude);

    default boolean isCrowded(int aircraft, int maxNbAircraft) {
        return aircraft > maxNbAircraft;
    }
}
