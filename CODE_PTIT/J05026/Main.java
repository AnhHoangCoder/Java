package J05026;

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
            String dpm =  br.readLine().trim();
            lecs.add(new Lecturer(id, name, dpm));
        }

        int q = Integer.parseInt(br.readLine().trim());
        while(q-- >0){
            String depm = br.readLine().trim();
            String tmp = "";
            String[] a = depm.toUpperCase().split("\\s+");
            for(int i = 0; i < a.length; i++){
                tmp += a[i].charAt(0);
            }

            StringBuilder sb = new StringBuilder();
            sb.append(String.format("DANH SACH GIANG VIEN BO MON %s:", tmp)).append("\n");
            for(Lecturer l : lecs){
                if(l.DPM().compareTo(tmp) == 0){
                    sb.append(l).append("\n");
                }
            }
            System.out.print(sb);
        }
    }
}
