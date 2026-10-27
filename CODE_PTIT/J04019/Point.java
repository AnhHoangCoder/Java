package J04019;

import java.util.Scanner;

public class Point {
    private double x, y;

    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public static Point nextPoint(Scanner sc){
        Point res = new Point();
        res.x = sc.nextDouble();
        res.y = sc.nextDouble();
        return res;
    }

    public double distance(Point other){
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
