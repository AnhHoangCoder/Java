package J05020;

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

        public String getLop() {
            return lop;
        }

        public String getId() {
            return id;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %s", id, name, lop, email);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        ArrayList<Student> sts = new ArrayList<>();
        while(t-- >0){
            String id = br.readLine().trim();
            String name = br.readLine().trim();
            String lop = br.readLine().trim();
            String email = br.readLine().trim();
            sts.add(new Student(id, name, lop, email));
        }

        sts.sort((a, b) -> {
            int cmp = a.getLop().compareTo(b.getLop());
            if(cmp != 0) return cmp;
            return a.getId().compareTo(b.getId());
        });

        sts.forEach(System.out::println);
    }
}
