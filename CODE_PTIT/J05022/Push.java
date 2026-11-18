package J05022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Student {
        private String id, fullName, lop, email;

        public Student(String id, String fullName, String lop, String email) {
            this.id = id;
            this.fullName = fullName;
            this.lop = lop;
            this.email = email;
        }

        public String getLop(){
            return lop;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %s", id, fullName, lop, email);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Student> studs = new ArrayList<>();
        while (n-- > 0){
            String id = br.readLine().trim();
            String fullName = br.readLine().trim();
            String lop = br.readLine().trim();
            String email = br.readLine().trim();
            studs.add(new Student(id, fullName, lop, email));
        }

        int q = Integer.parseInt(br.readLine().trim());
        while (q-- > 0){
            String LOP = br.readLine().trim();

            StringBuilder sb = new StringBuilder();
            sb.append(String.format("DANH SACH SINH VIEN LOP %s:", LOP)).append("\n");
            for(Student s: studs){
                if(s.getLop().equals(LOP)){
                    sb.append(s).append("\n");
                }
            }
            System.out.print(sb);
        }
    }
}
