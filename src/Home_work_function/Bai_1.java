package Home_work_function;

import java.util.Scanner;

public class Bai_1{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên a : ");
        float a = sc.nextFloat();

        System.out.print("Nhập vào số nguyên b : ");
        float b = sc.nextFloat();

        System.out.print("Nhập vào phép tính ( + , - , * , / ): ");
        char tmp = sc.next().charAt(0);
        if(tmp == '+'){
            System.out.print("Tổng của 2 số là : ");
            System.out.println(sum(a,b));
        }
        else if(tmp == '-'){
            System.out.print("Hiệu của 2 số là : ");
            System.out.println(sub(a,b));
        }
        else if(tmp == '*'){
            System.out.print("Tích của 2 số là : ");
            System.out.println(mul(a,b));
        }
        else if(tmp == '/'){
            System.out.print("Thương của 2 số là : ");
            System.out.println(div(a,b));
        }
    }
    public static float sum(float a , float b){
        return a + b;
    }
    public static float sub(float a , float b){
        return a - b;
    }
    public static float mul(float a , float b){
        return a * b;
    }
    public static float div(float a , float b){
        return a / b;
    }
}