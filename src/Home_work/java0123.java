package Home_work;

import java.util.Scanner;
import java.util.Arrays;

public class java0123 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2 ; i*i <= n ; i++){
            if(isPrime[i]){
                for(int j = i*i ; j <= n ; j +=i){
                    isPrime[j] = false;
                }
            }
        }

        if(isPrime[n]){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
