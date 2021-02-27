package aircraft;

public enum WakeTurbulence {
    Light(60),
    Medium(90),
    Heavy(110),
    Super(180);

    private int timeOffset;

    WakeTurbulence(int timeOffset){
        this.timeOffset = timeOffset;
    }

    public int getTimeOffset() {
        return timeOffset;
    }
}
