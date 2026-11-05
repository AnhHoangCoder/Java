package J05004;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= t; i++){
            String maSv = String.format("B20DCCN%03d", i);
            String hoTen = br.readLine().trim();
            String lop = br.readLine().trim();
            String date = br.readLine().trim();
            double gpa = Double.parseDouble(br.readLine().trim());

            Student st = new Student(maSv, hoTen, lop, date, gpa);
            sb.append(st);
        }
        System.out.print(sb);
    }
}
