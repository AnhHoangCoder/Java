package Home_work;

import java.util.Scanner;

public class java0102 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i++){
            char tmp = sc.next().charAt(0);
            if (Character.isUpperCase(tmp)) {
                tmp = Character.toLowerCase(tmp);
            }
            else if (Character.isLowerCase(tmp)) {
                tmp = Character.toUpperCase(tmp);
            }
            System.out.println(tmp);
        }
        sc.close();
    }
}
