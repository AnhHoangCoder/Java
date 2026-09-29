package J07018;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("SINHVIEN.in"))) {
            int t = Integer.parseInt(br.readLine().trim());
            SinhVien[] sv = new SinhVien[t];

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < t; i++){
                String hoten = br.readLine();
                String lop =  br.readLine();
                String date =  br.readLine();
                double gpa = Double.parseDouble(br.readLine().trim());
                sv[i] = new SinhVien(hoten, lop, date, gpa);
                sb.append(sv[i]).append("\n");
            }
            System.out.print(sb);
        }
        catch (FileNotFoundException e) {
            System.out.println("Ko tim thay file: " + e.getMessage());
        }
    }
}
