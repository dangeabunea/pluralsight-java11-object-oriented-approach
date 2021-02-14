package pluralsight.oop;

import pluralsight.oop.airspace.AirSector;
import pluralsight.oop.geography.Coordinate;
import pluralsight.oop.geography.DistanceCalculator;
import pluralsight.oop.radar.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        List<Aircraft> flyingAircraft = List.of(
                new Aircraft("OS876", new Coordinate(20,20), 300),
                new Aircraft("RO345", new Coordinate(5,15), 200),
                new Aircraft("TA234", new Coordinate(30,10), 230)
        );

        List<AirSector> sectorsWithBadWeather = new ArrayList<>();

        sectorsWithBadWeather.forEach(s -> {
            flyingAircraft.forEach(a -> {
                if(s.isInSector(a.getCoordinate(), a.getAltitudeFl())){
                    System.out.println("WARNING -> " + a.getCallSign() + " in bad weather sector");
                }
            });
        });
        *
         */
    }
}
