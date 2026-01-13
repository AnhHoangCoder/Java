package Home_work;

import java.util.Scanner;

public class java0153 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long k = sc.nextLong();

            long sum = 0;
            for(int i = 1 ; i <= n ; i++){
                sum += (i%k);
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
