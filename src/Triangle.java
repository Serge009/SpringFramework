import org.springframework.core.env.PropertyResolver;

import java.util.List;

/**
 * Created by Matrix on 22.07.2014.
 */
public class Triangle {

    private String type;

    private int height;

    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    /*
    private Point pointA;
    private Point pointB;
    private Point pointC;


    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    */

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "type='" + type + '\'' +
                ", height=" + height +
                ", points=" + points +
                '}';
    }

    public void draw() {
        System.out.println(this);
    }

}
