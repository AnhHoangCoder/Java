package J04019;

import java.util.Scanner;

public class push {
    public static class Point {
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

    public static class Triangle {
        private Point a, b, c;
        public Triangle(Point a, Point b, Point c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public boolean valid(){
            double x = a.distance(b);
            double y = a.distance(c);
            double z = b.distance(c);
            if(x + y > z && x + z > y && y + z > x){
                return true;
            }
            return false;
        }

        public String getPerimeter(){
            return String.format("%.3f", a.distance(b) + b.distance(c) + c.distance(a));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
