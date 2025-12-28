package Home_work_for;

import java.util.Scanner;

public class Bai_3{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n từ bàn phím : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            if(i % 2 == 0 || i == 3) continue;
            sum += i;
        }
        System.out.print("Tổng các số lẻ từ 1 -> n (-3) = ");
        System.out.println(sum);
    }
}