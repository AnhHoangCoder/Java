package J05014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Teacher {
        private String stt, hoTen, id;
        private float tin, toan;

        public Teacher(String stt, String hoTen, String id, float tin, float toan){
            this.stt = stt;
            this.hoTen = hoTen;
            this.id = id;
            this.tin = tin;
            this.toan = toan;
        }

        public String getMH(){
            if(id.charAt(0) == 'A'){
                return "TOAN";
            }
            else if(id.charAt(0) == 'B'){
                return "LY";
            }
            else{
                return "HOA";
            }
        }

        public float Total(){
            float diemUt = 0;
            if(id.charAt(1) == '1'){
                diemUt = 2;
            }
            else if(id.charAt(1) == '2'){
                diemUt = 15.0f / 10;
            }
            else if(id.charAt(1) == '3'){
                diemUt = 1;
            }

            return tin * 2 + toan + diemUt;
        }

        public String kq(){
            float ans = Total();
            if(ans < 18){
                return "LOAI";
            }
            else{
                return "TRUNG TUYEN";
            }
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %.1f %s", stt, hoTen, getMH(), Total(), kq());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Teacher> tes = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            String stt = String.format("GV%02d", i);
            String hoTen = br.readLine().trim();
            String id = br.readLine().trim();
            float tin = Float.parseFloat(br.readLine().trim());
            float toan = Float.parseFloat(br.readLine().trim());
            tes.add(new Teacher(stt, hoTen, id, tin, toan));
        }
        tes.sort((a, b) ->
                Float.compare(b.Total(), a.Total()));

        tes.forEach(System.out::println);
    }
}
