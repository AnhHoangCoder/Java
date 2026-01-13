package Home_work_if_else;

import java.util.Scanner;

public class Bai_4{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào tháng : ");
        int mon = sc.nextInt();

        if(mon != 2){
            switch (mon){
                case 4 : case 6 : case 9 : case 11 :
                    System.out.println("Có 30 ngày");
                    break;
                default :
                    System.out.println("Có 31 ngày");
            }
        }
        else{
            System.out.print("Hãy nhập thêm năm : ");
            int nam = sc.nextInt();
            if(((nam % 4 == 0) && (nam % 100 != 0)) || (nam % 400 == 0)){
                System.out.println("Có 29 ngày");
            }
            else{
                System.out.println("Có 28 ngày");
            }
        }
        sc.close();
    }
}