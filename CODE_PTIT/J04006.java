//Viết chương trình khai báo lớp Sinh Viên gồm các thông tin: Mã SV, Họ tên, Lớp, Ngày sinh và Điểm GPA (dạng số thực float). Hàm khởi tạo không có tham số, gán các giá trị thuộc tính ở trạng thái mặc định (xâu ký tự rỗng, giá trị số bằng 0).
//
//Đọc thông tin 1 sinh viên từ bàn phím (không có mã sinh viên) và in ra màn hình. Trong đó Mã SV được gán là B20DCCN001. Ngày sinh được chuẩn hóa về dạng dd/mm/yyyy.
//
//        Input
//
//Gồm 4 dòng lần lượt là Họ tên, Lớp, Ngày sinh và Điểm GPA.
//
//Trong đó:
//
//Họ tên không quá 30 chữ cái.
//Lớp theo đúng định dạng thường dùng ở PTIT
//Ngày sinh có đủ 3 phần ngày tháng năm nhưng có thể chưa đúng chuẩn dd/mm/yyyy.
//Điểm GPA đảm bảo trong thang điểm 4 với 2 nhiều nhất 2 số sau dấu phẩy.
//Output
//
//Ghi thông tin sinh viên trên 1 dòng, mỗi thông tin cách nhau 1 khoảng trống.
//
//Ví dụ
//
//
//Input
//
//        Output
//
//Nguyen Hoa Binh
//
//
//D20CQCN04-B
//
//
//2/2/2002
//
//
//        2
//
//
//
//B20DCCN001 Nguyen Hoa Binh D20CQCN04-B 02/02/2002 2.00

import java.util.*;
import java.io.*;

public class J04006 {
    static int stt;
    public static class SinhVien{
        private String MaSv, hoTen, Lop, date;
        private float gpa;

        public SinhVien(){
            MaSv = "";
            hoTen = "";
            Lop = "";
            date = "";
            gpa = 0;
        }

        public void nhap(BufferedReader br) throws IOException {
            String id = "B20DCCN";
            stt++;
            id = String.format("%s%03d", id, stt);

            MaSv = id;
            hoTen = br.readLine();
            Lop = br.readLine();
            date = br.readLine();
            gpa = Float.parseFloat(br.readLine().trim());

            String[] a = date.split("/");
            int d = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            int y = Integer.parseInt(a[2]);

            date = String.format("%02d/%02d/%d", d, m, y);
        }

        public void xuat(){
            System.out.printf("%s %s %s %s %.2f%n", MaSv, hoTen, Lop, date, gpa);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stt = 0;

        SinhVien a = new SinhVien();
        a.nhap(br);
        a.xuat();
    }
}