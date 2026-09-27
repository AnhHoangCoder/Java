//Khai báo lớp Point (điểm trong không gian hai chiều) có mô tả như sau:
//
//
//
//Viết chương trình nhập 3 điểm p1, p2, p3. Hãy tính diện tích tam giác được tạo bởi 3 điểm đó.
//
//Công thức Heron tính diện tích tam giác khi biết độ dài 3 cạnh là a,b,c:
//
//
//
//Input
//
//Dòng đầu ghi số bộ test, không quá 10
//Mỗi bộ test ghi trên 1 dòng 6 số thực có giá trị tuyệt đối không quá 1000 lần lượt là tọa độ của 3 điểm A, B, C.
//Output
//
//Nếu 3 điểm không thể tạo thành tam giác thì in ra INVALID
//Nếu 3 điểm tạo thành 1 tam giác thì in ra diện tích của tam giác đó, làm tròn đến 2 chữ số phần thập phân.
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
//12.50

import java.util.*;

public class J04009 {
    public static class Point {
        private double x, y;

        public Point() {
            this.x = 0.0;
            this.y = 0.0;
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return this.x;
        }

        public double getY() {
            return this.y;
        }

        public double distance(Point p) {
            double dx = this.x - p.getX();
            double dy = this.y - p.getY();
            return Math.sqrt(dx * dx + dy * dy);
        }

        public static double distance(Point p1, Point p2) {
            double dx = p2.getX() - p1.getX();
            double dy = p2.getY() - p1.getY();
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    static double DienTich(Point p1, Point p2, Point p3) {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);

        if (a + b <= c || b + c <= a || c + a <= b) {
            return -1;
        }

        return Math.sqrt(a + b + c)
                * Math.sqrt(a + b - c)
                * Math.sqrt(b + c - a)
                * Math.sqrt(c + a - b) / 4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
                .useLocale(Locale.US);

        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);

            double s = DienTich(p1, p2, p3);

            if (s < 0) {
                sb.append("INVALID\n");
            } else {
                sb.append(String.format(Locale.US, "%.2f%n", s));
            }
        }

        System.out.print(sb);
        sc.close();
    }
}