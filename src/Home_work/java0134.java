package Home_work;

import java.util.Scanner;
import java.util.ArrayList;

public class java0134 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 2 ; i*i <= n ; i++){
                while(n % i == 0){
                    list.add(i);
                    n /= i;
                }
            }
            if(n>1){
                list.add(n);
            }
            if(k > list.size()){
                System.out.println(-1);
            }
            else{
                System.out.println(list.get(k-1));
            }
        }
        sc.close();
    }
}
