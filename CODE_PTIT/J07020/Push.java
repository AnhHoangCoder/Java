package J07020;

import java.util.*;
import java.io.*;

public class Push {
    public static class khachHang {
        private static int stt = 0;
        private String maKH, nameKH, sex, date, addr;

        public khachHang(String name, String sex, String date, String addr) {
            stt++;
            this.maKH = String.format("KH%03d", stt);
            this.nameKH = name;
            this.sex = sex;

            String[] a = date.split("/");
            int m = Integer.parseInt(a[0]);
            int d = Integer.parseInt(a[1]);
            int y = Integer.parseInt(a[2]);

            this.date = String.format("%02d/%02d/%04d", d, m , y);
            this.addr = addr;
        }

        public String getMaKH(){
            return maKH;
        }

        public String getNameKH(){
            return nameKH;
        }

        public String getAddress(){
            return addr;
        }
    }

    public static class matHang {
        private static int stt = 0;
        private String maMH, nameMH, dvt;
        private int buy, sell;

        public matHang(String nameMH, String dvt, int buy, int sell){
            stt++;
            this.maMH = String.format("MH%03d", stt);
            this.nameMH = nameMH;
            this.dvt = dvt;
            this.buy = buy;
            this.sell = sell;
        }

        public String getMaMH(){
            return maMH;
        }
        public String getNameMH(){
            return nameMH;
        }
        public String getDvt(){
            return dvt;
        }
        public int getBuy(){
            return buy;
        }
        public int getSell(){
            return sell;
        }
    }

    public static class hoaDon {
        private static int stt = 0;
        private String maHD, maKH, maMH;
        private int soLuong;
        private khachHang KH;
        private matHang MH;

        public hoaDon(String maKH, String maMH, int soLuong, khachHang kh, matHang mh){
            stt++;
            this.maHD = String.format("HD%03d", stt);
            this.maKH = maKH;
            this.maMH = maMH;
            this.soLuong = soLuong;
            this.KH = kh;
            this.MH = mh;
        }

        public long thanhTien(){
            return (long)soLuong * MH.getSell();
        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(maHD).append(" ")
                    .append(KH.getNameKH()).append(" ")
                    .append(KH.getAddress()).append(" ")
                    .append(MH.getNameMH()).append(" ")
                    .append(MH.getDvt()).append(" ")
                    .append(MH.getBuy()).append(" ")
                    .append(MH.getSell()).append(" ")
                    .append(soLuong).append(" ")
                    .append(thanhTien());
            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        Map<String, khachHang> mp1 = new HashMap<>();
        Map<String, matHang> mp2 = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("KH.in")))){
            int t = Integer.parseInt(br.readLine().trim());

            while(t-- >0){
                String name = br.readLine().trim();
                String sex =  br.readLine().trim();
                String date =  br.readLine().trim();
                String addr =  br.readLine().trim();

                khachHang kh = new khachHang(name, sex, date, addr);
                mp1.put(kh.getMaKH(), kh);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Ko tim thay File: " + e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("MH.in")))){
            int t = Integer.parseInt(br.readLine().trim());

            while(t-- >0){
                String name = br.readLine().trim();
                String dvt = br.readLine().trim();
                int buy = Integer.parseInt(br.readLine().trim());
                int sell = Integer.parseInt(br.readLine().trim());

                matHang mh = new matHang(name, dvt, buy, sell);
                mp2.put(mh.getMaMH(), mh);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Ko tim thay File: " + e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("HD.in")))){
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            while(t-- >0){
                String[] a = br.readLine().trim().split("\\s+");

                String maKH = a[0];
                String maMH = a[1];
                int soLuong = Integer.parseInt(a[2]);
                hoaDon hd = new hoaDon(maKH, maMH, soLuong, mp1.get(maKH), mp2.get(maMH));
                sb.append(hd).append("\n");
            }

            System.out.print(sb);
        }
        catch(FileNotFoundException e){
            System.out.println("Ko tim thay File: " + e.getMessage());
        }
    }
}
