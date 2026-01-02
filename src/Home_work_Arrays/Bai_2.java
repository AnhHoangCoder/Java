package Home_work_Arrays;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Bai_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n : ");

        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            Random rand = new Random();
            int soNguyen = rand.nextInt(100);
            lst.add(soNguyen);
        }

        for(int i = 0 ; i < lst.size() ; i++){
            System.out.print(lst.get(i) + " ");
        }
    }
}