package Home_work;

import java.util.Scanner;

public class java0111 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            if(checkLienKe(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean checkLienKe(long n){
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for(int i = 0 ; i < sb.length()-1 ; i++){
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i+1);
            if(Math.abs(c1-c2) != 1) return false;
        }
        return true;
    }
}
