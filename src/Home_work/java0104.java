package Home_work;

import java.util.Scanner;

public class java0104 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n+1];
        arr[1] = 1;
        for(int i=2;i<=n;i++){
            arr[i] = arr[i-1] * i;
        }
        long sum = 0;
        for(int i=1;i<=n;i++){
            sum += arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
