package Home_work_if_else;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] a){
        System.out.println("Nhập vào tổng 2 số: ");
        int tong = new Scanner(System.in).nextInt();

        System.out.println("Nhập vào hiệu 2 số: ");
        int hieu = new Scanner(System.in).nextInt();

        double x = (double)(tong + hieu) / 2;
        double y = (double)(tong - hieu) / 2;
        System.out.print("Giá trị x cần tìm là: ");
        if(x == (int)x){
            System.out.println(+(int)x);
        }
        else {
            System.out.println(+x);
        }
        System.out.print("Giá trị y cần tìm là: ");
        if(y == (int)y){
            System.out.println(+(int)y);
        }
        else{
            System.out.println(y);
        }
    }
}
