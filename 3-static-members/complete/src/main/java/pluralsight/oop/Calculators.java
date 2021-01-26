package pluralsight.oop;

public class Calculators {

    public static class Distance {
        private int x1;
        private int y1;
        private int x2;
        private int y2;

        public Distance(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public double calculate(){
            return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        }
    }
}
