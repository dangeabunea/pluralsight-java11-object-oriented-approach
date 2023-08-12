package pluralsight.oop;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Partial flight plan
        FlightPlan harareToJohannesburg = new FlightPlan("RGA", "ORT");
//    We call the 2nd constructor in class FlightPlan using the name we have given it to call
//        the print method
        harareToJohannesburg.print();
        System.out.println();
//     Complete Flight Plan
        FlightPlan harareToLondon = new FlightPlan("RGA", "LHR ", LocalDateTime.of(2023,4, 8, 23,15), List.of("RGA","ETA","LHR"));
        harareToLondon.print();
    }
}
