package J04013;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String maTS, hoTen;
        double toan, ly, hoa;
        maTS = br.readLine().trim();
        hoTen = br.readLine().trim();
        toan = Double.parseDouble(br.readLine());
        ly = Double.parseDouble(br.readLine());
        hoa = Double.parseDouble(br.readLine());

        ThiSinh ts = new ThiSinh(maTS, hoTen, toan, ly, hoa);
        System.out.println(ts);
    }
}
