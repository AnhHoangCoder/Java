package J05006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Push {
    public static class Employee {
        private String maNv, hoTen, sex, date, addr, idThue, nkhd;

        public Employee(String maNv, String hoTen, String sex, String date, String addr, String idThue, String nkhd) {
            this.maNv = maNv;
            this.hoTen = hoTen;
            this.sex = sex;
            this.date = date;
            this.addr = addr;
            this.idThue = idThue;
            this.nkhd = nkhd;
        }
        @Override
        public String toString() {
            return String.format("%s %s %s %s %s %s %s", maNv, hoTen, sex, date, addr, idThue, nkhd);
        }
    }

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
