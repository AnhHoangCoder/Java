package J04019;

public class Triangle {
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
