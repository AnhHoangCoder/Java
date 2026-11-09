package J05009;

import java.util.*;
import java.io.*;

public class Main {
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
            if(s.total() == maxPoint) {
                sb.append(s).append("\n");
            }
        }

        System.out.print(sb);
    }
}
