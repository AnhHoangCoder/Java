package J04010;

import java.util.*;
import java.io.*;

public class push {
    public static class Point {
        private double x, y;

        public Point(){
            this.x = 0;
            this.y = 0;
        }

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }


        public Point(Point p){
            this.x = p.x;
            this.y = p.y;
        }

        public double getX(){
            return this.x;
        }

        public double getY(){
            return this.y;
        }

        public double distance(Point other){
            double dx = other.x - this.x;
            double dy = other.y - this.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public double distance(Point p1, Point p2){
            double dx = p2.x - p1.x;
            double dy = p2.y - p1.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException{
        while(tok == null || !tok.hasMoreTokens()){
            String line = br.readLine();
            if(line == null) return null;
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    static boolean check(double a, double b, double c){
        final double eps = 1e-9;
        return a + b > c + eps && b + c > a + eps && a + c > b + eps;
    }

    static double dienTichTg(double a, double b, double c){
        return Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4;
    }

    static double banKinh(double a, double b, double c){
        double S = dienTichTg(a, b, c);
        return (a * b * c) / (4 * S);
    }

    static double dienTichDt(double R){
        return Math.PI * R * R;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(getToken());
        StringBuilder sb = new StringBuilder();
        while(t-- >0){
            double x1, x2, x3;
            double y1, y2, y3;
            x1 = Double.parseDouble(getToken());
            y1 = Double.parseDouble(getToken());
            x2 = Double.parseDouble(getToken());
            y2 = Double.parseDouble(getToken());
            x3 = Double.parseDouble(getToken());
            y3 = Double.parseDouble(getToken());

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);

            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);

            if(!check(a, b, c)){
                sb.append("INVALID\n");
                continue;
            }

            sb.append(String.format("%.03f", dienTichDt(banKinh(a, b, c)))).append("\n");
        }
        System.out.print(sb);
    }
}
