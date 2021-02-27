package aircraft;

import java.util.Map;

public class TakeOffDistancingRules {
    private Map<WakeTurbulence, Integer> rules;

    public TakeOffDistancingRules() {
        rules = Map.of(
                WakeTurbulence.Light, 60,
                WakeTurbulence.Medium, 90,
                WakeTurbulence.Heavy, 110,
                WakeTurbulence.Super, 180
        );
    }

    public int calculateWaitTime(Aircraft a) {
        return rules.get(a.getWakeTurbulence());
    }
}
