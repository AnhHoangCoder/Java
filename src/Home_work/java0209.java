package Home_work;

import java.util.Scanner;

public class java0209 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] a = new int[n];
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }
            while(q-- >0){
                int l = sc.nextInt();
                int r = sc.nextInt();
                int sum = Sum_arr(a , l-1 , r-1);
                System.out.println(sum);
            }
        }
    }
    public static int Sum_arr(int[] a , int l , int r){
        int sum = 0;
        for(int i = l ; i <= r ; i++){
            sum += a[i];
        }
        return sum;
    }
}
