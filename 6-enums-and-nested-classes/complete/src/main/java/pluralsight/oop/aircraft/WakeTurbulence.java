package pluralsight.oop.aircraft;

public enum WakeTurbulence {
    LIGHT(60),
    MEDIUM(90),
    HEAVY(110),
    SUPER(180);

    private int timeOffset;

    WakeTurbulence(int timeOffset){
        this.timeOffset = timeOffset;
    }

    public int getTimeOffset() {
        return timeOffset;
    }
}
