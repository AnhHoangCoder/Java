package J04012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class push {
    public static class Employee {
        private static int stt = 0;
        private String maNV, hoTen, cv;
        private int luongCoBan, dayCong;

        public Employee(String hoTen, int luongCoBan, int dayCong, String cv){
            stt++;
            this.maNV = String.format("NV%02d", stt);
            this.hoTen = hoTen;
            this.luongCoBan = luongCoBan;
            this.dayCong = dayCong;
            this.cv = cv;
        }

        public int luongThang(){
            return luongCoBan * dayCong;
        }

        public int tienThuong(){
            if(dayCong >= 25){
                return 20 * luongThang() / 100;
            }
            else if(dayCong >= 22){
                return 10 * luongThang() / 100;
            }
            else{
                return 0;
            }
        }

        public int phuCap(){
            if(cv.equals("GD")){
                return 250000;
            }
            else if(cv.equals("PGD")){
                return 200000;
            }
            else if(cv.equals("TP")){
                return 180000;
            }
            else{
                return 150000;
            }
        }

        public int thuNhap(){
            return luongThang() + tienThuong() + phuCap();
        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(maNV).append(" ").append(hoTen).append(" ")
                    .append(luongThang()).append(" ")
                    .append(tienThuong()).append(" ")
                    .append(phuCap()).append(" ")
                    .append(thuNhap());
            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String hoTen = br.readLine().trim();
        int luongCoBan = Integer.parseInt(br.readLine().trim());
        int dayCong =  Integer.parseInt(br.readLine().trim());
        String cv =  br.readLine().trim();

        Employee e = new Employee(hoTen, luongCoBan, dayCong, cv);
        System.out.print(e);
    }
}
