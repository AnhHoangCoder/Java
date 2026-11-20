package J05027;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Lecturer> lecs = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String id = String.format("GV%02d", i);
            String name = br.readLine().trim();
            String dpm = br.readLine().trim();
            lecs.add(new Lecturer(id, name, dpm));
        }

        int q = Integer.parseInt(br.readLine().trim());
        while(q-- > 0){
            String s = br.readLine().trim();
            String tmp = s.toLowerCase();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("DANH SACH GIANG VIEN THEO TU KHOA %s:", s)).append("\n");
            for(Lecturer l : lecs){
                if(l.getName().contains(tmp)){
                    sb.append(l).append("\n");
                }
            }

            System.out.print(sb);
        }
    }
}
