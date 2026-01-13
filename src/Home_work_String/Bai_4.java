package Home_work_String;

import java.util.Scanner;

public class Bai_4{
    public static void main(String[] args){
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời thím nhập vào chuỗi cần mã hóa : ");
        String str = sc.nextLine();
        System.out.print("Chuỗi sau chuẩn hóa là : ");
        for(int i = 0 ; i < str.length() ; i++){
            System.out.print(b.charAt(a.indexOf(str.charAt(i))));
        }
        sc.close();
    }
}