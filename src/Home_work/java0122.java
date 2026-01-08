package Home_work;

import java.util.Scanner;

public class java0122 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int res = 1;
            for(int i=2;i<=n;i++){
                res = LCD(res,i);
            }
            System.out.println(res);
        }
    }
    public static int GCD(int a ,int b){
        if(b==0) return a;
        return GCD(b , a%b);
    }
    public static int LCD(int a , int b){
        int USCLN = GCD(a,b);
        return (a / USCLN) * b;
    }
}
