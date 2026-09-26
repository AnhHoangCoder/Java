//Viết chương trình khai báo lớp Thí Sinh gồm các thông tin: Họ tên, Ngày sinh, Điểm môn 1, Điểm môn 2, Điểm môn 3 và Tổng điểm.
//
//Đọc thông tin 1 thí sinh từ bàn phím và in ra màn hình 3 thông tin: Họ tên, Ngày sinh, Tổng điểm.
//
//Input
//
//Gồm 5 dòng lần lượt, mỗi dòng ghi 1 thông tin: Họ tên, Ngày sinh, Điểm môn 1, Điểm môn 2, Điểm môn 3. Họ tên không quá 50 chữ cái, Ngày sinh viết đúng chuẩn dd/mm/yyyy. Các giá trị điểm là số thực (float).
//
//Output
//
//Ghi ra Họ tên, Ngày sinh và Tổng điểm. Mỗi thông tin cách nhau một khoảng trống. Điểm được ghi ra với 1 số sau dấu phẩy.
//
//Ví dụ
//
//
//Input
//
//        Output
//
//Nguyen Hoang Ha
//
//
//11/10/2001
//
//
//        4.5
//
//
//        10.0
//
//
//        5.5
//
//
//
//Nguyen Hoang Ha 11/10/2001 20.0

import java.util.*;
import java.io.*;

public class J04005 {
    public static class Student{
        private String name, date;
        private float diem1, diem2, diem3, tongDiem;

        public void nhap(BufferedReader br) throws IOException {
            name = br.readLine();
            date = br.readLine();
            diem1 = Float.parseFloat(br.readLine().trim());
            diem2 = Float.parseFloat(br.readLine().trim());
            diem3 = Float.parseFloat(br.readLine().trim());
            tongDiem = diem1 + diem2 + diem3;
        }

        public void xuat(){
            System.out.printf("%s %s %.1f%n", name, date, tongDiem);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Student s = new Student();
        s.nhap(br);
        s.xuat();
    }
}