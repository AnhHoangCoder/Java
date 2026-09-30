package J07019;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, SanPham> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("DATA1.in")))){
            int t = Integer.parseInt(br.readLine().trim());
            while(t-- > 0){
                String ma = br.readLine().trim();
                String name = br.readLine().trim();
                long gia1 = Long.parseLong(br.readLine().trim());
                long gia2 = Long.parseLong(br.readLine().trim());
                map.put(ma, new SanPham(ma, name, gia1, gia2));
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
