package pluralsight.oop;

import pluralsight.oop.airspace.AirSector;
import pluralsight.oop.airspace.EnRouteSector;
import pluralsight.oop.airspace.TMASector;
import pluralsight.oop.geography.Circle;
import pluralsight.oop.geography.Coordinate;
import pluralsight.oop.geography.Rectangle;
import pluralsight.oop.radar.Aircraft;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define sectors with bad weather
        List<AirSector> sectorsWithBadWeather = List.of(
                new TMASector(
                        new Circle(new Coordinate(20, 20), 10),
                        100),
                new EnRouteSector(
                        new Rectangle(
                                new Coordinate(0, 0),
                                new Coordinate(10, 20),
                                new Coordinate(0, 20),
                                new Coordinate(10, 0)),
                        200, 400));

        // Define aircraft
        List<Aircraft> flyingAircraft = List.of(
                new Aircraft("OS876", new Coordinate(20, 20), 50),
                new Aircraft("RO345", new Coordinate(5, 15), 200),
                new Aircraft("TA234", new Coordinate(30, 10), 230)
        );

        // OS876 in TMA,
        // RO345 in EnRoute
        sectorsWithBadWeather.forEach(s -> {
            flyingAircraft.forEach(a -> {
                if (s.isInSector(a.getCoordinate(), a.getAltitudeFl())) {
                    System.out.println("WARNING -> " + a.getCallSign() + " in bad weather sector");
                }
            });
        });

        // OS876 in TMA,
        // RO345 in EnRoute
        sectorsWithBadWeather.forEach(c -> System.out.println(c.isCrowded(1, 10)));
    }
}
