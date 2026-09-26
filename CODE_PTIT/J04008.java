//Khai báo lớp Point (điểm trong không gian hai chiều) có mô tả như sau:
//
//
//
//Viết chương trình nhập 3 điểm p1, p2, p3. Hãy tính chu vi tam giác được tạo bởi 3 điểm đó.
//
//Input
//
//Dòng đầu ghi số bộ test, không quá 10
//Mỗi bộ test ghi trên 1 dòng 6 số thực có giá trị tuyệt đối không quá 1000 lần lượt là tọa độ của 3 điểm.
//        Output
//
//Nếu 3 điểm không thể tạo thành tam giác thì in ra INVALID
//Nếu 3 điểm tạo thành 1 tam giác thì in ra chu vi của tam giác đó, làm tròn đến 3 chữ số phần thập phân.
//        Ví dụ
//
//
//Input
//
//        Output
//
//3
//
//
//        0 0 0 5 0 199
//
//
//        1 1 1 1 1 1
//
//
//        0 0 0 5 5 0
//
//
//
//INVALID
//
//
//        INVALID
//
//
//17.071

import java.util.*;

public class J04008 {
    public static class Point{
        private double x, y;

        public Point(){
            this.x = 0;
            this.y = 0;
        }

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        public double getX(){
            return this.x;
        }

        public double getY(){
            return this.y;
        }

        public Point(Point p){
            this.x = p.getX();
        }

        public double distance(Point p){
            double dx = p.getX() - this.x;
            double dy = p.getY() - this.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public double distance(Point p1, Point p2){
            double dx = p1.getX() - p2.getX();
            double dy = p1.getY() - p2.getY();
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    public static boolean KolaTamGiac(Point p1, Point p2, Point p3){
        double eps = 1e-6;
        double s2 = (p2.getX() - p1.getX()) * (p3.getY() -  p1.getY()) - (p3.getX() - p1.getX()) * (p2.getY() -  p1.getY());
        return Math.abs(s2) < eps;
    }

    public static double ChuVi(Point p1, Point p2, Point p3){
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        return a + b + c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while(t-- > 0){
            double x1, y1, x2, y2, x3, y3;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);

            if(KolaTamGiac(p1, p2, p3)){
                sb.append("INVALID").append("\n");
                continue;
            }

            String sum = String.format("%.3f", ChuVi(p1, p2, p3));
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}