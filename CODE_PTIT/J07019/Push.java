package J07019;

import java.util.*;
import java.io.*;

public class Push {
    public static class SanPham {
        private String maL, name;
        private long gia1, gia2;

        public SanPham(String ma, String name, long gia1, long gia2) {
            this.maL = ma;
            this.name = name;
            this.gia1 = gia1;
            this.gia2 = gia2;
        }
        public long getDonGia(String loai){
            return ((loai.equals("1")) ? gia1 : gia2);
        }

        public String getMa(){
            return maL;
        }

        public String getName(){
            return name;
        }
    }

    public static class HoaDon {
        private static int dem = 0;
        private int stt;
        private String mal;
        private long slm;
        private SanPham sp;

        public HoaDon(String maL, long num, SanPham sp){
            this.stt = ++dem;
            this.mal = maL;
            this.slm = num;
            this.sp = sp;
        }

        public String getLoai(){
            return mal.substring(mal.length() - 1);
        }

        public long thanhTien(){
            return slm * sp.getDonGia(getLoai());
        }

        public long giamGia(){
            long num = thanhTien();
            if(slm >= 150){
                return num * 50 / 100;
            }
            else if(slm >= 100){
                return num * 30 / 100;
            }
            else if(slm >= 50){
                return num * 15 / 100;
            }
            else{
                return 0;
            }
        }

        public long phaiTra(){
            return thanhTien() - giamGia();
        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(mal).append("-").append(String.format("%03d", stt))
                    .append(" ").append(sp.getName()).append(" ")
                    .append(giamGia()).append(" ").append(phaiTra());
            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        Map<String, SanPham> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("DATA1.in")))){
            int t = Integer.parseInt(br.readLine().trim());
            while(t-- > 0){
                String ma = br.readLine().trim();
                String name = br.readLine().trim();
                long gia1 = Long.parseLong(br.readLine().trim());
                long gia2 = Long.parseLong(br.readLine().trim());
                SanPham sp = new SanPham(ma, name, gia1, gia2);
                map.put(sp.getMa(), sp);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Ko tim thay file: " + e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("DATA2.in"))){
            int t = Integer.parseInt(br.readLine().trim());
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < t; i++){
                String[] a =  br.readLine().trim().split("\\s+");
                String ma = a[0];
                long soLuong = Long.parseLong(a[1]);

                HoaDon hd = new HoaDon(ma, soLuong, map.get(ma.substring(0, 2)));
                sb.append(hd).append("\n");
            }
            System.out.print(sb);
        }
        catch(FileNotFoundException e){
            System.out.println("Ko tim thay file: " + e.getMessage());
        }
    }
}
