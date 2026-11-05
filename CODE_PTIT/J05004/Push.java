package J05004;

import java.io.*;

public class Push {
    public static class Student {
        private String maSv, hoTen, lop, date;
        private double gpa;

        public Student(String maSv, String hoTen, String lop, String date, double gpa){
            hoTen = hoTen.replaceAll("\\s+", " ");
            String[] a = hoTen.toLowerCase().split(" ");
            for(int i = 0; i < a.length; i++){
                a[i] = Character.toUpperCase(a[i].charAt(0)) +  a[i].substring(1);
            }

            StringBuilder name = new StringBuilder();
            for(int i = 0; i < a.length; i++){
                name.append(a[i]);
                if(i == a.length - 1){
                    break;
                }
                name.append(" ");
            }

            String[] b = date.split("/");
            int day = Integer.parseInt(b[0]);
            int month = Integer.parseInt(b[1]);
            int year = Integer.parseInt(b[2]);

            String dateNew = String.format("%02d/%02d/%04d", day, month, year);
            this.maSv = maSv;
            this.hoTen = name.toString();
            this.lop = lop;
            this.date = dateNew;
            this.gpa = gpa;
        }

        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(maSv).append(" ").append(hoTen).append(" ")
                    .append(lop).append(" ").append(date).append(" ")
                    .append(String.format("%.2f", gpa)).append("\n");
            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= t; i++){
            String maSv = String.format("B20DCCN%03d", i);
            String hoTen = br.readLine().trim();
            String lop = br.readLine().trim();
            String date = br.readLine().trim();
            double gpa = Double.parseDouble(br.readLine().trim());

            Student st = new Student(maSv, hoTen, lop, date, gpa);
            sb.append(st);
        }
        System.out.print(sb);
    }
}
