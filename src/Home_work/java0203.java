package Home_work;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class java0203 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                int num = sc.nextInt();
                if(num > 0){
                    list.add(num);
                }
            }
            Collections.sort(list);
            int dem = 1;
            for(int i = 0 ; i < list.size() ; i++){
                if(dem == list.get(i)){
                    dem++;
                }
                else if(dem > list.get(i)){
                    break;
                }
            }
            System.out.println(dem);
        }
    }
}
