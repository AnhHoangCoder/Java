package J05010;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<MatHang> mhs = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine().trim();
            String group = br.readLine().trim();
            double buy = Double.parseDouble(br.readLine().trim());
            double pass = Double.parseDouble(br.readLine().trim());

            mhs.add(new MatHang(i, name, group, buy, pass));
        }

        mhs.sort(Comparator.comparingDouble(MatHang::loiNhuan)
                .reversed());

        mhs.forEach(System.out::println);
    }
}
