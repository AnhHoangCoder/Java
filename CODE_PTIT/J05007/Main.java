package J05007;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        ArrayList<Employee> ems = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            String maNv = String.format("%05d", i);
            String hoTen = br.readLine().trim();
            String sex =  br.readLine().trim();
            String date = br.readLine().trim();
            String addr = br.readLine().trim();
            String idThue = br.readLine().trim();
            String nkhd = br.readLine().trim();
            Employee e = new Employee(maNv, hoTen, sex, date, addr, idThue, nkhd);
            ems.add(e);
        }
        ems.sort(Comparator.comparing(Employee::getDate));
        ems.forEach(System.out::println);
    }
}
