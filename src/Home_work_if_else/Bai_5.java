package Home_work_if_else;

import java.util.Scanner;

public class Bai_5{
    public static void main(String[] argc){
        System.out.println("Ta có phương trình bậc 2 : a(x^2) + bx + c = 0");
        System.out.print("a = ");

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();

        System.out.print("Vậy phương trình có: ");

        if(a == 0){
            if(b == 0){
                System.out.println("vô số nghiệm");
            }
            else{
                System.out.println("có 1 nghiệm duy nhất");
                System.out.print("x = ");
                System.out.println((-c) / b);
            }
        }
        else {
            double delta = (b * b) - (4 * a * c);
            if(delta > 0){
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                System.out.println("có 2 nghiệm phân biệt");

                System.out.print("x1 = ");
                System.out.println(x1);

                System.out.print("x2 = ");
                System.out.println(x2);
            }
            else if(delta == 0){
                double x = (-b) / (2 * a);
                System.out.println("có nghiệm kép");

                System.out.print("x = ");
                System.out.println(x);
            }
            else{
                delta *= (-1);
                double thuc = (-b) / (2 * a);
                double ao = Math.sqrt(delta) / (2 * a);

                System.out.println("có 2 nghiệm phức phân biệt");

                System.out.print("x1 = ");
                System.out.print(thuc + " ");

                char tmp1 = '+';
                if(ao < 0){
                    tmp1 = '-';
                }
                System.out.println(tmp1 + " " + ao + "i");

                System.out.print("x2 = ");
                System.out.print(thuc + " ");
                char tmp2 = '+';
                ao *= (-1);
                if(ao < 0){
                    tmp2 = '-';
                }
                System.out.println(tmp2 + " " + ao + "i");
            }
        }
        sc.close();
    }
}