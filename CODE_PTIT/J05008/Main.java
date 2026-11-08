package J05008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            Point[] a = new Point[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Point(sc.nextDouble(), sc.nextDouble());
            }

            double ans = 0;
            for(int i = 0; i < n; i++){
                double x1 = a[i].getX();
                double y1 = a[i].getY();
                double x2 = a[(i + 1) % n].getX();
                double y2 = a[(i + 1) % n].getY();

                ans += x1 * y2 - x2 * y1;
            }
            ans = Math.abs(ans / 2);

            sb.append(String.format("%.3f", ans)).append("\n");
        }
        System.out.println(sb);
    }
}
