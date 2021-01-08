package pluralsight.oop;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Partial flight plan
        FlightPlan berlinToBucharest = new FlightPlan(
                "BER",
                "OTP"
        );
        System.out.println(berlinToBucharest);

        System.out.println();

        // Complete flight plan
        FlightPlan parisToLondon = new FlightPlan(
                "CDG",
                "LHR",
                LocalDateTime.of(2020, 01, 10, 23, 15),
                List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR")
        );
        System.out.println(parisToLondon);
    }
}
