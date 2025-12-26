package Home_work_if_else;

import java.util.Scanner;

public class Bai_2{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao (m):");
        double height = sc.nextDouble();

        System.out.println("Nhập vào cân nặng (kg):");
        double weight = sc.nextDouble();

        double BMI = weight / (height * height);

        System.out.print("BMI của bạn = ");
        System.out.println(BMI);

        if(BMI < 15){
            System.out.println("Bộ trưởng bộ hài cốt");
        }
        else if(BMI < 16){
            System.out.println("Hoàng kim cốt");
        }
        else if(BMI < 18.5){
            System.out.println("Hơi cốt");
        }
        else if(BMI < 25){
            System.out.println("Đầy đặn");
        }
        else if(BMI < 30){
            System.out.println("Múp");
        }
        else if(BMI < 35){
            System.out.println("Hơi chuppy");
        }
        else{
            System.out.println("CHUPPY");
        }
    }
}