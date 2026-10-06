package J04015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class push {
    public static class GiaoVien {
        private String maNgach, hoTen;
        private int luongCoBan;

        public GiaoVien(String maNgach, String hoTen, int luongCoBan){
            this.maNgach = maNgach;
            this.hoTen = hoTen;
            this.luongCoBan = luongCoBan;
        }

        public int phuCap(){
            String pc = maNgach.substring(0, 2);
            if(pc.equals("HT")){
                return 2000000;
            }
            else if(pc.equals("HP")){
                return 900000;
            }
            else if(pc.equals("GV")){
                return 500000;
            }
            else{
                return 0;
            }
        }

        public int bacLuong(){
            return Integer.parseInt(maNgach.substring(2));
        }

        public int thuNhap(){
            return bacLuong() * luongCoBan + phuCap();
        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(maNgach).append(" ").append(hoTen).append(" ")
                    .append(bacLuong()).append(" ")
                    .append(phuCap()).append(" ")
                    .append(thuNhap());
            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String maNgach = br.readLine().trim();
        String hoTen = br.readLine().trim();
        int luongCoBan = Integer.parseInt(br.readLine().trim());
        GiaoVien gv = new GiaoVien(maNgach, hoTen, luongCoBan);
        System.out.println(gv);
    }
}