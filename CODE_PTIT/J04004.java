//Viết chương trình xây dựng lớp Phân số gồm hai phần tử là tử số và mẫu số. Các giá trị đều nguyên dương và không quá 9 chữ số.
//
//Sau đó thực hiện nhập vào hai phân số p và q. Tính tổng p + q, rút gọn và in ra kết quả.
//
//        Input
//
//Có bốn số nguyên dương lần lượt là tử số và mẫu số của p rồi đến q.
//
//Output
//
//Ghi ra phân số tổng p + q ở dạng tối giản như trong ví dụ
//
//Ví dụ
//
//Input
//
//        Output
//
//123 456 12 34
//
//
//        1609/2584

import java.util.*;

public class J04004 {
    public static long GCD(long a, long b){
        while(b != 0){
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static long LCM(long a, long b){
        return a / GCD(a, b) * b;
    }

    public static class PhanSo{
        private long tu, mau;

        public PhanSo(){
            this.tu = 0;
            this.mau = 0;
        }

        public PhanSo(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
        }

        public long getTu(){
            return tu;
        }
        public long getMau(){
            return mau;
        }

        public void Sum(PhanSo other){
            long lcm = LCM(this.mau, other.getMau());
            long tuMoi = this.tu * (lcm / this.mau) + other.getTu() * (lcm / other.getMau());
            this.tu = tuMoi;
            this.mau = lcm;
        }

        public void rutGon(){
            long gcd = GCD(this.tu, this.mau);
            this.tu /= gcd;
            this.mau /= gcd;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long aTu =  sc.nextLong();
        long aMau = sc.nextLong();

        long bTu = sc.nextLong();
        long bMau = sc.nextLong();

        PhanSo a = new PhanSo(aTu, aMau);
        PhanSo b = new PhanSo(bTu, bMau);

        a.rutGon();
        b.rutGon();

        a.Sum(b);
        a.rutGon();
        StringBuilder sb = new StringBuilder();
        sb.append(a.getTu()).append("/").append(a.getMau());
        System.out.println(sb);
    }
}