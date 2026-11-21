package J05029;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Business> bus = new ArrayList<>();
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- >0){
            String id = br.readLine().trim();
            String name = br.readLine().trim();
            int sl = Integer.parseInt(br.readLine());
            bus.add(new Business(id, name, sl));
        }

        bus.sort((a, b) -> {
            int tmp = Integer.compare(b.getSl(), a.getSl());
            if(tmp != 0) return tmp;
            return a.getId().compareTo(b.getId());
        });

        int q = Integer.parseInt(br.readLine().trim());
        while(q-- >0){
            String[] s = br.readLine().trim().split("\\s+");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            StringBuilder sb = new StringBuilder();
            sb.append(String.format("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:", a, b)).append("\n");
            for(Business bu : bus){
                int x = bu.getSl();
                if(x >= a && x <= b){
                    sb.append(bu).append("\n");
                }
            }

            System.out.print(sb);
        }
    }
}