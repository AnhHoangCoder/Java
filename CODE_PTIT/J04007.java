//Một nhân viên làm việc trong công ty được lưu lại các thông tin sau:
//
//Mã nhân viên: được gán giá trị là 00001
//Họ tên: Xâu ký tự không quá 40 chữ cái.
//Giới tính: Nam hoặc Nu
//Ngày sinh: đúng theo chuẩn dd/mm/yyyy
//Địa chỉ: Xâu ký tự không quá 100 chữ cái
//Mã số thuế: Dãy số có đúng 10 chữ số
//Ngày ký hợp đồng: đúng theo chuẩn dd/mm/yyyy
//Viết chương trình nhập một nhân viên (không nhập mã) in ra màn hình thông tin của nhân viên đó.
//
//Input
//
//Gồm 6 dòng lần lượt ghi các thông tin theo thứ tự đã ghi trong đề bài. Không có mã nhân viên.
//
//        Output
//
//Ghi ra đầy đủ thông tin nhân viên trên một dòng, các thông tin cách nhau đúng một khoảng trống.
//
//        Ví dụ
//
//
//Input
//
//Nguyen Van Hoa
//
//
//        Nam
//
//
//22/11/1982
//
//
//Mo Lao-Ha Dong-Ha Noi
//
//
//8333123456
//
//
//        31/12/2013
//
//
//
//
//Output
//
//
//
//00001 Nguyen Van Hoa Nam 22/11/1982 Mo Lao-Ha Dong-Ha Noi 8333123456 31/12/2013

import java.util.*;
import java.io.*;

public class J04007 {
    static int stt;

    public static class Employee {
        private String MaNV, hoTen, Sex, date, diaChi, maSoThue, ngayKyHD;

        public Employee(){
            MaNV = "";
            hoTen = "";
            Sex = "";
            date = "";
            diaChi = "";
            maSoThue = "";
            ngayKyHD = "";
        }

        public void nhap(BufferedReader br) throws IOException {
            hoTen = br.readLine();
            Sex = br.readLine();
            date = br.readLine();
            diaChi = br.readLine();
            maSoThue = br.readLine();
            ngayKyHD = br.readLine();

            stt++;
            MaNV = String.format("%05d", stt);
        }

        public void xuat(){
            System.out.printf("%s %s %s %s %s %s %s %n", MaNV, hoTen, Sex,  date, diaChi, maSoThue, ngayKyHD);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stt = 0;

        Employee e = new Employee();
        e.nhap(br);
        e.xuat();
    }
}