package Home_work;

import java.util.Scanner;

public class java0112 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            System.out.printf("%.4f" , KhoangCach(x1 , y1 , x2 , y2));
            System.out.println();
        }
    }
    public static double KhoangCach(double x1 , double y1 , double x2 , double y2){
        double x = x2 - x1;
        double y = y2 - y1;
        return Math.sqrt(x*x + y*y);
    }
}
