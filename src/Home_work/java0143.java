package Home_work;

import java.util.Scanner;

public class java0143 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int t = sc.nextInt();
       while(t-- >0){
           int n = sc.nextInt();
           System.out.println(soFiBo(n));
       }
    }
    public static long soFiBo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        long a = 0 , b = 1;
        long c;
        while(n-- >1){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
