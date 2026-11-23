package J05034;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Student {
        private int stt;
        private String id, name, lop, email, dn;

        public Student(int stt, String id, String name, String lop, String email, String dn) {
            this.stt = stt;
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.email = email;
            this.dn = dn;
        }

        public String getName(){
            return name;
        }

        public String getDn(){
            return dn;
        }

        @Override
        public String toString(){
            return String.format("%d %s %s %s %s %s", stt, id, name, lop, email, dn);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Student> st = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String id = br.readLine().trim();
            String name = br.readLine().trim();
            String lop = br.readLine().trim();
            String email = br.readLine().trim();
            String dn =  br.readLine().trim();
            st.add(new Student(i, id, name, lop, email, dn));
        }

        st.sort((a, b) ->
                a.getName().compareTo(b.getName()));

        int q = Integer.parseInt(br.readLine().trim());
        while(q-- > 0){
            StringBuilder ans = new StringBuilder();
            String tmp =  br.readLine().trim();
            for(Student s : st){
                if(s.getDn().equals(tmp)){
                    ans.append(s).append("\n");
                }
            }
            System.out.print(ans);
        }
    }
}
