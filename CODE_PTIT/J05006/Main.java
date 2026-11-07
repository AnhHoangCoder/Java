package J05006;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            String maNv = String.format("%05d", i);
            String hoTen = br.readLine().trim();
            String sex = br.readLine().trim();
            String date = br.readLine().trim();
            String addr = br.readLine().trim();
            String idThue = br.readLine().trim();
            String nkhd = br.readLine().trim();
            Employee e = new Employee(maNv, hoTen, sex, date, addr, idThue, nkhd);
            sb.append(e).append("\n");
        }
        System.out.print(sb);
    }
}
