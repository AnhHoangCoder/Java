package Home_work_for;

import java.util.Scanner;

public class Bai_2{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số n từ bàn phím : ");
        int n = sc.nextInt();
        if(n%2 == 0){
            int sum = 0;
            while(n > 0){
                sum += (n%10);
                n /= 10;
            }
            System.out.print("Vậy tổng các số trong số chẵn n là : ");
            System.out.println(sum);
        }
        else{
            System.out.println("Tôi ko tính tổng số lẻ , bye bye , hehehe");
        }
    }
}