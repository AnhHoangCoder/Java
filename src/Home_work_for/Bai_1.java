package Home_work_for;

import java.util.Scanner;

public class Bai_1{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số nguyên n: ");
        int n = sc.nextInt();
        int tmp = n;
        long s = 1;
        while(n > 1){
            s *= n;
            n--;
        }
        System.out.print("Kết quả của " + tmp + "! = ");
        System.out.println(s);
    }
}