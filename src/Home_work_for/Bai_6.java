package Home_work_for;

import java.util.Scanner;

public class Bai_6{
    public static void main(String[] argc){
        System.out.print("Nhập vào số nguyên a > 0 từ bàn phím : ");

        while(true){
            int n = new Scanner(System.in).nextInt();
            if(check_nt(n)){
                System.out.println(n + " là số nguyên tố");
            }
            else{
                System.out.println(n + " ko là số nguyên tố");
            }
            System.out.println("Bạn có muốn tiếp tục sử dụng phần mềm ko ?");
            System.out.println("Nếu có thì bấm y");
            char tmp = new Scanner(System.in).next().charAt(0);
            if(tmp != 'y' && tmp != 'Y'){
                break;
            }
        }
    }
    public static boolean check_nt(long n){
        if(n < 2) return false;
        if(n == 2 || n == 3)  return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5 ; i*i <= n ; i+=6){
            if(n%i == 0 || n%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
}