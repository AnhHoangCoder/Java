package J05021;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String id;
        ArrayList<Student> sts = new ArrayList<>();
        while((id = br.readLine()) != null){
            id = id.trim();
            String name = br.readLine().trim();
            String lop = br.readLine().trim();
            String email = br.readLine().trim();
            sts.add(new Student(id, name, lop, email));
        }

        sts.sort((a, b) ->
                a.getId().compareTo(b.getId()));

        sts.forEach(System.out::println);
    }
}
