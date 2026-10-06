package J04015;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String maNgach = br.readLine().trim();
        String hoTen = br.readLine().trim();
        int luongCoBan = Integer.parseInt(br.readLine().trim());
        GiaoVien gv = new GiaoVien(maNgach, hoTen, luongCoBan);
        System.out.println(gv);
    }
}
