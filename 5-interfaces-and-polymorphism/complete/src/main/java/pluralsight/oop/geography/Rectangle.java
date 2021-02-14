package pluralsight.oop.geography;

public class Rectangle {
    private Coordinate c1;
    private Coordinate c2;
    private Coordinate c3;
    private Coordinate c4;

    /*
    c1.....c2
    .........
    c3.....c4
     */
    public Rectangle(Coordinate c1, Coordinate c2, Coordinate c3, Coordinate c4) {
        if (c1.getX() != c3.getX() ||
                c1.getY() != c2.getY() ||
                c4.getX() != c2.getX() ||
                c4.getY() != c3.getY()) {
            throw new IllegalArgumentException("This is not a rectangle");
        }

        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    public Coordinate getC1() {
        return c1;
    }

    public Coordinate getC2() {
        return c2;
    }

    public Coordinate getC3() {
        return c3;
    }

    public Coordinate getC4() {
        return c4;
    }
}
