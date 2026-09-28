package J07010;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("SV.in")))){
            int t = Integer.parseInt(br.readLine().trim());
            SinhVien[] sv = new SinhVien[t];
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < t; i++){
                sv[i] = new SinhVien();
                String hoTen = br.readLine();
                String lop = br.readLine();
                String date = br.readLine();
                double gpa = Double.parseDouble(br.readLine().trim());
                sv[i].nhap(hoTen, lop, date, gpa);
            }
            for(int i = 0; i < t; i++){
                sb.append(sv[i]).append("\n");
            }
            System.out.print(sb);
        }
        catch(FileNotFoundException e){
            System.out.println("Ko tim thay file: " + e.getMessage());
        }
    }
}
