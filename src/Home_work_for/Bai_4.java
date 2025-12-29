package Home_work_for;

import java.util.Scanner;

public class Bai_4{
    public static void main(String[] argc){
        System.out.print("Nhập vào số n : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Những số chia hết cho 3 từ 1 đến n là ");
        for(int i = 1 ; i <= n ; i++){
            if(i%3 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}