package Home_work;

import java.util.Scanner;

public class java0115 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            for (int i = 2; i * i <= n; i++) {
                int dem = 0;
                if(n % i == 0){
                    while(n % i == 0){
                        n/=i;
                        dem++;
                    }
                    System.out.print(i + " " + dem + " ");
                }
            }
            if(n > 1){
                System.out.print(n + " " + 1);
            }
            System.out.println();
        }
    }
}
