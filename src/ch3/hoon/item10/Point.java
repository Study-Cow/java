package ch3.hoon.item10;

/**
 * 추이성 위반
 */
public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override public boolean equals(Object o) {
        if(!(o instanceof Point))
            return false;
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }

    public static void main(String[] args) {
        ColorPoint p1 = new ColorPoint(1,2, Color.RED);
        Point p2 = new Point(1,2);
        ColorPoint p3 = new ColorPoint(1,2, Color.BLUE);
        System.out.println(p2.equals(p1));  //true
        System.out.println(p2.equals(p3));  //true
        System.out.println(p1.equals(p3));  //false
    }

}

class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override public boolean equals(Object o) {
        if(!(o instanceof ColorPoint))
            return false;
        return super.equals(o) && ((ColorPoint) o).color == color;
    }

}

enum Color{
    RED,BLUE;
}