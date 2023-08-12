package pluralsight.oop;
//Other that handle other
public class  Calculators {
//    This class is any other top level class though they are static, they uphold OOP by having
//    The class keyword, arguments, constructors and another method that calculates
    public static class Distance{
        private int x1, x2, y1, y2;

        public Distance(int x1,int x2, int y1, int y2){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
        public double calculate(){
            return Math.sqrt((x2 -x1) * (x2 - x1) + (y2-y1) * (y2 -y1));
        }
    }

}
//Maybe later we may add other calculate like the fuel consumtion we use the Calculator class as staticgit
