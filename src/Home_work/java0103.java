package Home_work;

import java.util.Scanner;

public class java0103 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum += 1.0/i;
        }
        String msg = String.format("%.4f" , sum);
        System.out.println(msg);
        sc.close();
    }
}
