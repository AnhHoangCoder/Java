package J07010;

import java.io.*;
import java.util.*;

public class Push_Code_PTIT {
    public static class SinhVien {
        private static int stt = 0;
        private String MaSv, hoTen, date, lop;
        private double gpa;

        public SinhVien(){
            this.MaSv = "";
            this.hoTen = "";
            this.lop = "";
            this.date = "";
            this.gpa = 0;
        }

        public void nhap(String hoTen, String lop, String date, double gpa){
            stt++;
            this.MaSv = String.format("B20DCCN%03d", stt);
            this.hoTen = hoTen;
            this.lop = lop;

            String[] a = date.split("/");
            int d = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            int y = Integer.parseInt(a[2]);

            this.date = String.format("%02d/%02d/%d", d, m , y);
            this.gpa = gpa;
        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            String GPA = String.format("%.02f", gpa);
            sb.append(MaSv).append(" ").append(hoTen).append(" ").append(lop).append(" ")
                    .append(date).append(" ").append(GPA).append("\n");
            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("SV.in")))){
            int t = Integer.parseInt(br.readLine().trim());
            SinhVien[] sv = new SinhVien[t];
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < t; i++){
                sv[i] = new SinhVien();
                String hoTen = br.readLine();
                String lop = br.readLine();
                String date = br.readLine();
                double gpa = Double.parseDouble(br.readLine().trim());
                sv[i].nhap(hoTen, lop, date, gpa);
            }
            for(int i = 0; i < t; i++){
                sb.append(sv[i]).append("\n");
            }
            System.out.print(sb);
        }
        catch(FileNotFoundException e){
            System.out.println("Ko tim thay file: " + e.getMessage());
        }
    }
}