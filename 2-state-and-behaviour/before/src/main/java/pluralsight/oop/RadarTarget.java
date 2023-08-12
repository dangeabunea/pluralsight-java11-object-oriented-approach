package pluralsight.oop;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Math.random;
import static java.lang.System.out;
import static java.lang.Thread.sleep;
import static java.util.concurrent.Executors.newSingleThreadExecutor;

public class  RadarTarget {
    private String callSign;
    private int flightLevel;
    private int requiredFlightLevel;
    private String model;

    public RadarTarget (String callSign, int flightLevel, String model){
//        this will call the instance variable not the constructor parameter
        this.callSign= callSign;
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
        sb.append(model);
        return sb.toString();
    }
    private String getClimbDescendIndicator(){
        if (this.requiredFlightLevel > this.flightLevel){
            return "Up";
        }
        if (this.requiredFlightLevel < this.flightLevel){
            return "Down";
        }
        return "=";
    }
//    Lets tell the pilot to change altitude

    public void changeAltitude(int newFL) {
        out.println(this.callSign + "change altitude" + newFL);
        out.println();

        this.requiredFlightLevel = newFL;
//        Simulate long-running operation
        ExecutorService es = newSingleThreadExecutor();
        es.execute(() -> {
            try{
                sleep((long) (random() * 5 * 1000));
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            this.flightLevel = requiredFlightLevel;
        });
    }
}
