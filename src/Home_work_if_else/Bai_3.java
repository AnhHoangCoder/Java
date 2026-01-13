package Home_work_if_else;

import java.util.Scanner;

public class Bai_3{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào năm : ");
        int nam = sc.nextInt();

        if(((nam % 4 == 0) && (nam % 100 != 0)) || (nam % 400 == 0)){
            System.out.println(nam + " là năm nhuận.");
        }
        else{
            System.out.println(nam + " ko phải năm nhuận.");
        }
        sc.close();
    }
}