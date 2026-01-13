package Home_work;

import java.util.Scanner;

public class java0110 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0 ; i < t ; i++){
            long n = sc.nextLong();
            System.out.println(tfm(n));
        }
        sc.close();
    }
    public static String tfm(long n){
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        String tmp = "084";

        int idx;
        while((idx = sb.indexOf(tmp)) != -1){
            sb.delete(idx , idx + tmp.length());
        }
        return sb.toString();
    }
}
