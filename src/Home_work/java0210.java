package Home_work;

import java.util.Scanner;

public class java0210 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n ; i++) {
                a[i] = sc.nextInt();
            }
            int num = a[0];
            int res = -1;
            for(int i = 1 ; i < n ; i++){
                res = Math.max(res , a[i] - num);
                num = Math.min(num , a[i]);
            }
            System.out.println(res);
        }
    }
}
