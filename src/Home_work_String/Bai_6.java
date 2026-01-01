package Home_work_String;

import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder s_num = new StringBuilder();
        StringBuilder s_str = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            if(Character.isDigit(s.charAt(i))){
                s_num.append(s.charAt(i));
            }
            else{
                s_str.append(s.charAt(i));
            }
        }
        System.out.println(s_num);
        System.out.println(s_str);
    }
}
