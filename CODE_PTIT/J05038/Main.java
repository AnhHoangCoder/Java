package J05038;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Employee> eps = new ArrayList<>();

        int n = Integer.parseInt(br.readLine().trim());
        for(int i = 1; i <= n; i++){
            String id = String.format("NV%02d", i);
            String name = br.readLine().trim();
            long sal = Long.parseLong(br.readLine().trim());
            int qtt = Integer.parseInt(br.readLine().trim());
            String cv = br.readLine().trim();
            eps.add(new Employee(id, name, sal, qtt, cv));
        }

        StringBuilder ans = new StringBuilder();
        long total = 0;
        for(Employee e : eps){
            total += e.total();
            ans.append(e).append("\n");
        }

        ans.append(String.format("Tong chi phi tien luong: %d", total));
        System.out.print(ans);
    }
}
