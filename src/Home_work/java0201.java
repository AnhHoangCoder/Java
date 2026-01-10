package Home_work;

import java.util.Scanner;
import java.util.Arrays;

public class java0201{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int res = Integer.MAX_VALUE;
            for(int i = 0 ; i < n-1 ; i++){
                res = Math.min(res , a[i+1] - a[i]);
            }
            System.out.println(res);
        }
    }
}