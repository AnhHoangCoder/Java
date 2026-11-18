package J05023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Student {
        private String id, name, lop, email;

        public Student(String id, String name, String lop, String email){
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.email = email;
        }

        public String getYear(){
            return "20" + lop.substring(1,3);
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %s", id, name, lop, email);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        ArrayList<Student> studs = new ArrayList<>();
        while(t-- >0){
            String id = br.readLine().trim();
            String name = br.readLine().trim();
            String lop = br.readLine().trim();
            String email = br.readLine().trim();
            studs.add(new Student(id, name, lop, email));
        }

        int q = Integer.parseInt(br.readLine().trim());
        while(q-- > 0){
            String year = br.readLine().trim();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("DANH SACH SINH VIEN KHOA %s:", year)).append("\n");
            for(Student s : studs){
                if(s.getYear().equals(year)){
                    sb.append(s).append("\n");
                }
            }
            System.out.print(sb);
        }
    }
}
