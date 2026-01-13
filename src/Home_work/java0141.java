package Home_work;

import java.util.Scanner;

public class java0141 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            if(checkFiBo(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
    public static boolean checkFiBo(long n){
        if(n == 0 || n == 1) return true;
        long a = 0 , b = 1;
        long c;
        while(b < n){
            c = a + b;
            a = b;
            b = c;
        }
        if(b > n) return false;
        return true;
    }
}
