package Home_work;

import java.util.Scanner;

public class java0121 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            long USCLN = GCD(a,b);
            long BSCNN = (a / USCLN) * b;
            System.out.println(BSCNN + " " + USCLN);
        }
        sc.close();
    }
    public static long GCD(int a , int b){
        if(b == 0) return (long)a;
        return GCD(b , a%b);
    }
}
