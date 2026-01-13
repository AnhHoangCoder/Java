package Home_work;

import java.util.Scanner;

public class java0106 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            long n = sc.nextLong();
            if(checkSoThuanNghich(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
    public static boolean checkSoThuanNghich(long n){
        String s = String.valueOf(n);
        for(int i=0;i<s.length()/2;i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(s.length()-i-1);
            if(c1 != c2){
                return false;
            }
        }
        return true;
    }
}
