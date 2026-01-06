package Home_work;

import java.util.Scanner;

public class java0107 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        String de101 = "ABBADCCABDCCABD";
        String de102 = "ACCABCDDBBCDDBB";
        for(int i = 0 ; i < t ; i++){
            int n = sc.nextInt();
            float diem = 0;
            String de = (n == 101) ? de101 : de102;
            for(int j = 0 ; j < 15 ; j++){
                char c = sc.next().charAt(0);
                if(c == de.charAt(j)){
                    diem += (2.0/3);
                }
            }
            System.out.printf("%.2f" , diem);
        }
    }
}
