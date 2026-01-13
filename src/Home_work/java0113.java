package Home_work;

import java.util.Scanner;

public class java0113 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(checkLucky(n)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        sc.close();
    }
    public static boolean checkLucky(int n){
        return String.valueOf(n).contains("86");
    }
}
