package J05030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Student {
        private String id, name, lop;
        private double diem1, diem2, diem3;

        public Student(String id, String name, String lop, double diem1, double diem2, double diem3){
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
        }

        public String getId(){
            return id;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %.1f %.1f %.1f", id, name, lop, diem1, diem2, diem3);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        ArrayList<Student> studs = new ArrayList<>();
        while(t-- >0){
            String id = br.readLine().trim();
            String name = br.readLine().trim();
            String lop = br.readLine().trim();
            double diem1 = Double.parseDouble(br.readLine().trim());
            double diem2 = Double.parseDouble(br.readLine().trim());
            double diem3 = Double.parseDouble(br.readLine().trim());
            studs.add(new Student(id, name, lop, diem1, diem2, diem3));
        }

        studs.sort((a, b) ->
                a.getId().compareTo(b.getId()));

        StringBuilder sb = new StringBuilder();
        int stt = 1;
        for(Student s : studs){
            sb.append(stt).append(" ");
            stt++;
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }
}
