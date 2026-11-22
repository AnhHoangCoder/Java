package J05031;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Student> studs = new ArrayList<>();
        int t = Integer.parseInt(br.readLine().trim());
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
                a.getName().compareTo(b.getName()));

        StringBuilder ans = new StringBuilder();
        int stt = 1;
        for(Student s : studs){
            ans.append(stt).append(" ");
            stt++;
            ans.append(s).append("\n");
        }
        System.out.print(ans);
    }
}
