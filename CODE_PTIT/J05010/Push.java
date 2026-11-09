package J05010;

import java.io.*;
import java.util.*;

public class Push {
    public static class MatHang {
        private int maMh;
        private String name, group;
        private double buy, pass;

        public MatHang(int maMh, String name, String group,
                       double buy, double pass) {
            this.maMh = maMh;
            this.name = name;
            this.group = group;
            this.buy = buy;
            this.pass = pass;
        }

        public double loiNhuan() {
            return pass - buy;
        }

        @Override
        public String toString() {
            return String.format("%d %s %s %.2f",
                    maMh, name, group, loiNhuan());
        }
    }

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
