package J05005;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String maSv = String.format("B20DCCN%03d", i);
            String hoTen = br.readLine().trim();
            String lop = br.readLine().trim();
            String date = br.readLine().trim();
            double gpa = Double.parseDouble(br.readLine().trim());
            Student s =  new Student(maSv, hoTen, lop, date, gpa);
            students.add(s);
        }

        students.sort((a, b) ->
                Double.compare(b.getGpa(), a.getGpa()));
        students.forEach(System.out::println);
    }
}
