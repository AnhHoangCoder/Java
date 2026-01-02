package Home_work_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Bai_3{
    public static void main(String[] args){
        System.out.println("Nhập vào n phần tử : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            Random rand = new Random();
            int soNguyen = rand.nextInt(1,1000);
            lst.add(soNguyen);
        }
        System.out.println(lst);
        int count = 0;
        ArrayList<Integer> lst2 = new ArrayList<>();
        for(int i = 0 ; i < lst.size() ; i++){
            int num = lst.get(i);
            if(num < 80){
                count++;
                lst2.add(i);
            }
        }
        System.out.println("Có " + count + " số nhỏ hơn 80");
        if(lst2.isEmpty()){
            System.out.println("Có cc");
        }
        else{
            System.out.println("Các vị trí index của các số đó là : " + lst2);
        }
    }
}