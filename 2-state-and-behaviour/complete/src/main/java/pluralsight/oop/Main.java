package pluralsight.oop;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create radar target
        RadarTarget os791 = new RadarTarget(
                "OS791",
                280,
                "B737-800");

        // Print current label
        System.out.println(os791.getLabel());
        System.out.println();

        // Change altitude command
        os791.changeAltitude(200);
        for (int i=0; i< 5; i++){
            Thread.sleep(1000);
            System.out.println(os791.getLabel());
            System.out.println();
        }
    }
}
