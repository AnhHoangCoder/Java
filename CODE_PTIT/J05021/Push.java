package J05021;

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

        public String getId(){
            return id;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %s", id, name, lop, email);
        }
    }


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
