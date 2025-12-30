package Home_work_for;

import java.util.Scanner;

public class Bai_5{
    public static void main(String[] argc){
        //Tìm tất cả các số hoàn hảo từ 1 - 1000
        //số hoàn hảo là số có tổng các ước nguyên dương nhỏ hơn nó + lại bằng chính nó
        for(int i = 1 ; i <= 1000 ; i++){
            if(check_number(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean check_number(int n){
        int sum = 0;
        for(int i = 1 ; i < n ; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        return (sum == n);
    }
}