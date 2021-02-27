package pluralsight.oop;


import aircraft.Aircraft;
import aircraft.TakeOffDistancingRules;
import aircraft.WakeTurbulence;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aircraft> aircraft = List.of(
                new Aircraft(1000, "B737", WakeTurbulence.Light),
                new Aircraft(1001, "A320", WakeTurbulence.Light),
                new Aircraft(1002, "A330", WakeTurbulence.Medium),
                new Aircraft(1003, "ATR90", WakeTurbulence.Light),
                new Aircraft(1004, "A380", WakeTurbulence.Super)
        );

        int offset = 0;
        for (Aircraft a : aircraft) {
            offset += a.getWakeTurbulence().getTimeOffset();
            LocalDateTime depTime = LocalDateTime
                    .now()
                    .plusSeconds(offset);
            System.out.println("Aircraft " + a.getModeAOctal() + " takes off at " + depTime.toLocalTime());
        }
    }
}
