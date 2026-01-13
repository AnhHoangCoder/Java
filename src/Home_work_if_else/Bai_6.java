package Home_work_if_else;

import java.util.Scanner;

public class Bai_6{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào điểm trung bình để kiểm tra học lực : ");

        float diem = sc.nextFloat();

        System.out.println((diem >= 8) ? "Giỏi" : (diem >= 6.5) ? "Khá" : (diem >= 5) ? "Trung bình" : "Yếu");
        sc.close();
    }
}