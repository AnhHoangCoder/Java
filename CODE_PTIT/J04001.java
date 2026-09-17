//Khai báo lớp Point (điểm trong không gian hai chiều) có mô tả như sau:
//
//Viết chương trình nhập vào hai điểm p1, p2 và tính khoảng cách hai điểm đó.
//
//        Input
//
//Dòng đầu ghi số bộ test, không quá 20.
//Mỗi bộ test có 4 số thực lần lượt là tọa độ của 2 điểm A và B, giá trị tuyệt đối không quá 1000.
//Ouput
//
//Với mỗi bộ test, viết ra khoảng cách giữa 2 điểm với 4 chữ số phần thập phân.
//
//        Ví dụ
//
//
//Input
//
//        Output
//
//2
//
//
//        0 0 0 5
//
//
//        0 199 5 6
//
//
//
//        5.0000
//
//
//        193.0648

import java.util.*;

public class J04001 {
    public static class Point {
        private double x, y;

        public Point(){
            this(0, 0);
        }

        public Point(double x, double y) {
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

        public static double distance(Point p1, Point p2){
            double dx = p2.getX() - p1.getX();
            double dy = p2.getY() - p1.getY();
            return Math.sqrt(dx * dx + dy * dy);
        }

        public double distance(Point secondPoint){
            return distance(this, secondPoint);
        }

        @Override
        public String toString(){
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());

            double ans = a.distance(b);
            sb.append(String.format("%.4f", ans)).append("\n");
        }
        System.out.print(sb);
    }
}