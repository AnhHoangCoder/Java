package J05027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Lecturer {
        private String id, name, dpm;

        public Lecturer(String id, String name, String dpm){
            this.id = id;
            this.name = name;
            this.dpm = dpm;
        }

        public String getName(){
            return name.toLowerCase();
        }

        public String DPM(){
            String ans = "";
            String[] a = dpm.toUpperCase().split("\\s+");
            for(int i = 0; i < a.length; i++){
                ans += a[i].charAt(0);
            }
            return ans;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s", id, name, DPM());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Lecturer> lecs = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String id = String.format("GV%02d", i);
            String name = br.readLine().trim();
            String dpm = br.readLine().trim();
            lecs.add(new Lecturer(id, name, dpm));
        }

        int q = Integer.parseInt(br.readLine().trim());
        while(q-- > 0){
            String s = br.readLine().trim();
            String tmp = s.toLowerCase();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("DANH SACH GIANG VIEN THEO TU KHOA %s:", s)).append("\n");
            for(Lecturer l : lecs){
                if(l.getName().contains(tmp)){
                    sb.append(l).append("\n");
                }
            }

            System.out.print(sb);
        }
    }
}
