package Home_work;

import java.util.Scanner;


public class java0116 {
    public static void main(String[] args){
        final int Max = 1_000_000;

        int[] uPrime = new int[Max+1];
        for(int i = 1 ; i <= Max ; i++){
            uPrime[i] = i;
        }

        for(int i = 2 ; i*i <= Max ; i++){
            if(uPrime[i] == i){
                for(int j = i*i ; j <= Max ; j+=i){
                    if(uPrime[j] == j){
                        uPrime[j] = i;
                    }
                }
            }
        }

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            for(int i = 1 ; i <= n ; i++){
                System.out.print(uPrime[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
