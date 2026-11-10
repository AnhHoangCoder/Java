package J05012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class MatHang {
        private String id, name;
        private int soLuong, ck;
        private long donGia;

        public MatHang(String id, String name, int soLuong, long donGia, int ck){
            this.id = id;
            this.name = name;
            this.soLuong = soLuong;
            this.donGia = donGia;
            this.ck = ck;
        }

        public long Total(){
            return donGia * soLuong - (long)ck;
        }

        @Override
        public String toString(){
            return String.format("%s %s %d %d %d %d", id, name, soLuong, donGia, ck, Total());
        }
    }

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
