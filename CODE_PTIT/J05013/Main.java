package J05013;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Employee> ems = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String id = String.format("TS%02d", i);
            String hoTen = br.readLine().trim();
            float lt = Float.parseFloat(br.readLine().trim());
            float th = Float.parseFloat(br.readLine().trim());
            ems.add(new Employee(id, hoTen, lt, th));
        }

        ems.sort((a, b) ->
                Float.compare(b.diemTb(), a.diemTb()));

        ems.forEach(System.out::println);
    }
}
