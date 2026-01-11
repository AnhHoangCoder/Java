package Home_work;

import java.util.Scanner;

public class java0205 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }
            int res = Integer.MIN_VALUE;
            for(int i = 1 ; i < n-1 ; i++){
                if(a[i] > a[i-1] && a[i] > a[i+1]){
                    res = Math.max(res , a[i]);
                }
            }
            if(res == Integer.MIN_VALUE){
                System.out.println(-1);
            }
            else{
                System.out.println(res);
            }
        }
    }
}
