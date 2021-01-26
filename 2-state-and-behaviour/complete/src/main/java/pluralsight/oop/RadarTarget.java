package pluralsight.oop;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RadarTarget {
    private String callSign;
    private int flightLevel;
    private int requiredFlightLevel;
    private String model;

    public RadarTarget(String callSign, int flightLevel, String model) {
        this.callSign = callSign;
        this.flightLevel = flightLevel;
        this.requiredFlightLevel = flightLevel;
        this.model = model;
    }

    public String getLabel(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.callSign);
        sb.append(System.lineSeparator());
        sb.append(this.flightLevel)
                .append(this.getClimbDescendIndicator())
                .append(this.requiredFlightLevel);
        sb.append(System.lineSeparator());
        sb.append(model);

        return sb.toString();
    }

    public void changeAltitude(int newFl) {
        System.out.println(this.callSign + " change altitude " + newFl);
        System.out.println();

        this.requiredFlightLevel = newFl;

        // Simulate long running operation
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(() -> {
            try {
                Thread.sleep((long)(Math.random() * 5 * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.flightLevel = requiredFlightLevel;
        });
    }

    private String getClimbDescendIndicator(){
        if(this.requiredFlightLevel > this.flightLevel){
            return "▲";
        }
        if(this.requiredFlightLevel < this.flightLevel){
            return "▼";
        }
        return "=";
    }
}
