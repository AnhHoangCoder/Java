package Home_work;

import java.util.Scanner;

public class java0109 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        long start = power(10 , n-1);
        long end = power(10 , n);

        int tmp = 0;
        for(long i = start ; i < end ; i++){
            if(checkChanLe(i)){
                tmp++;
                System.out.print(i + " ");
                if(tmp % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
    public static boolean checkChanLe(long n){
        int chan = 0 , le = 0;
        while(n > 0){
            long a = n % 10;
            if(a % 2 == 0) chan++;
            else le++;
            n/=10;
        }
        return (chan == le);
    }
    public static long power(long a , int b){
        long res = 1;
        while(b > 0){
            if(b % 2 == 1) res *= a;
            a *= a;
            b /= 2;
        }
        return res;
    }
}
