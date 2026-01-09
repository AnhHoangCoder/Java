package Home_work;

import java.util.Scanner;
import java.util.Arrays;

public class java0139 {
    public static void main(String[] args){
        final int Max = 100_000;
        boolean[] isPrime = new boolean[Max+1];
        Arrays.fill(isPrime , true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2 ; i*i <= Max ; i++){
            if(isPrime[i]){
                for(int j = i*i ; j <= Max ; j+= i){
                    isPrime[j] = false;
                }
            }
        }

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(!isPrime[n] && checkChuSo(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean checkChuSo(int n){
        int sum = 0;
        int tmp = n;
        for(int i = 2 ; i*i <= n ; i++){
            while(n%i == 0){
                sum += SumChuso(i);
                n /= i;
            }
        }
        if(n > 1){
            sum += SumChuso(n);
        }
        return (sum == SumChuso(tmp));
    }
    public static int SumChuso(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
