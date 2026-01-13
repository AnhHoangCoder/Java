package Home_work;

import java.util.Scanner;

public class java0105 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            int n = sc.nextInt();
            if(check_soLocPhat(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
    public static boolean check_soLocPhat(int n){
        String s = String.valueOf(n);
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if((c != '0') && (c != '6') && (c != '8')) return false;
        }
        return true;
    }
}
