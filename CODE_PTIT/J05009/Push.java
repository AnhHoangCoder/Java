package J05009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Student {
        private int maTs;
        private String hoTen, date;
        private double m1, m2, m3;

        public Student(int maTs, String hoTen, String date, double m1, double m2, double m3){
            this.maTs = maTs;
            this.hoTen = hoTen;
            this.date = date;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }

        public int getMaTs() {
            return maTs;
        }

        public double total(){
            return m1 + m2 + m3;
        }

        @Override
        public String toString(){
            return String.format("%d %s %s %.1f", maTs, hoTen, date, total());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Student> students = new ArrayList<>();

        double maxPoint = 0;
        for(int i = 1; i <= n; i++){
            String hoTen = br.readLine().trim();
            String date = br.readLine().trim();
            double m1 = Double.parseDouble(br.readLine().trim());
            double m2 = Double.parseDouble(br.readLine().trim());
            double m3 = Double.parseDouble(br.readLine().trim());

            Student st = new Student(i, hoTen, date, m1, m2, m3);
            maxPoint = Math.max(maxPoint, st.total());
            students.add(st);
        }

        StringBuilder sb = new StringBuilder();

        for(Student s : students){
            if(s.total() == maxPoint){
                sb.append(s).append("\n");
            }
        }

        System.out.print(sb);
    }
}
