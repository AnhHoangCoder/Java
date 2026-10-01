package J07020;

import java.util.*;
import java.io.*;

public class Main {
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
