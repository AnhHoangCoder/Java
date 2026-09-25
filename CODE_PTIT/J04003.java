//Viết chương trình khai báo lớp Phân số gồm hai thuộc tính private là tử số và mẫu số. Các giá trị đều nguyên dương và không quá 18 chữ số.
//
//Sau đó thực hiện nhập vào một phân số và in ra phân số đó ở dạng tối giản.
//
//        Input
//
//Có hai số nguyên dương lần lượt là tử số và mẫu số.
//
//        Output
//
//Ghi ra phân số tối giản như trong ví dụ
//
//Ví dụ
//
//Input
//
//        Output
//
//123 456
//
//
//        41/152

import java.util.*;
import java.io.*;

public class J04003 {
    public static long GCD(long a, long b){
        while(b != 0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static class PhanSo{
        private long tu, mau;
        public PhanSo(){
            this.tu = 0;
            this.mau = 0;
        }

        public PhanSo(long a, long b){
            this.tu = a;
            this.mau = b;
        }

        public void RutGon(){
            long gcd = GCD(this.tu, this.mau);
            this.tu /= gcd;
            this.mau /= gcd;
        }

        public long getTu(){
            return this.tu;
        }
        public long getMau(){
            return this.mau;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        StringBuilder sb = new StringBuilder();
        PhanSo c = new PhanSo(a, b);
        c.RutGon();
        sb.append(c.getTu()).append("/").append(c.getMau());
        System.out.println(sb);
    }
}