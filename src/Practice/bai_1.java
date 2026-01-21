package Practice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class bai_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên a = ");
        int a = sc.nextInt();
        System.out.print("Nhập vào số nguyên b = ");
        int b = sc.nextInt();

        List<Integer> list = new ArrayList<Integer> ();
        for(int i=a;i<=b;i++){
            if((i % 7 == 0) && (i % 5 != 0)){
                list.add(i);
            }
        }
        showList(list);
        sc.close();
    }
    public static void showList(List<Integer> list){
        if(list != null && !list.isEmpty()){
            int size = list.size();
            for(int i=0;i<size-1;i++){
                System.out.print(list.get(i) + ", ");
            }
            System.out.println(list.get(size-1));
        }
    }
}
