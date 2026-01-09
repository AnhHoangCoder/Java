package Home_work;

import java.util.Scanner;

public class java0152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int m = sc.nextInt();

            boolean check = false;
            for(int i=0;i<m;i++){
                if((a*i) % m == 1) {
                    check = true;
                    System.out.println(i);
                    break;
                }
            }
            if(!check){
                System.out.println(-1);
            }
        }
    }
}
