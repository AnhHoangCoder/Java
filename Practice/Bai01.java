package Practice;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i = a ; i <= b ; i++){
                if(i % 7 == 0 && i % 5 != 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }    
}
