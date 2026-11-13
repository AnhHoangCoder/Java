package J05018;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Student> stus = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String id = String.format("HS%02d", i);
            String hoTen = br.readLine().trim();
            String[] a = br.readLine().trim().split("\\s+");
            float m1 = Float.parseFloat(a[0]);
            float m2 = Float.parseFloat(a[1]);
            float m3 = Float.parseFloat(a[2]);
            float m4 = Float.parseFloat(a[3]);
            float m5 = Float.parseFloat(a[4]);
            float m6 = Float.parseFloat(a[5]);
            float m7 = Float.parseFloat(a[6]);
            float m8 = Float.parseFloat(a[7]);
            float m9 = Float.parseFloat(a[8]);
            float m10 = Float.parseFloat(a[9]);
            stus.add(new Student(id, hoTen, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10));
        }

        stus.sort((a, b) -> {
            int cmp = Float.compare(b.getScore(), a.getScore());
            if(cmp != 0) return cmp;
            return a.getId().compareTo(b.getId());
        });

        stus.forEach(System.out::println);
    }
}
