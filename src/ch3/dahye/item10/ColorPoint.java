package ch3.dahye.item10;

import java.awt.*;
import java.util.Objects;

public class ColorPoint {
    private final Color color;
    private final Point point;

    public ColorPoint(int x, int y, Color color){
        this.point = new Point(x,y);
        this.color = Objects.requireNonNull(color);
    }

    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        if(!(o instanceof ColorPoint))
            return false;
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(cp);
    }

}
