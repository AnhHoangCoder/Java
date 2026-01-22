package Practice;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Max cua mang la : " + max);
        System.out.println("Min cua mang la : " + min);
        sc.close();
    }    
}
