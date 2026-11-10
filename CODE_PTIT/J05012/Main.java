package J05012;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<MatHang> mh = new ArrayList<>();
        while(n-- >0){
            String id = br.readLine().trim();
            String name = br.readLine().trim();
            int soLuong = Integer.parseInt(br.readLine().trim());
            long donGia = Long.parseLong(br.readLine().trim());
            int ck = Integer.parseInt(br.readLine().trim());
            mh.add(new MatHang(id, name, soLuong, donGia, ck));
        }

        mh.sort((a, b) ->
                Long.compare(b.Total(), a.Total()));

        mh.forEach(System.out::println);
    }
}
