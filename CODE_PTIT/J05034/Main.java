package J05034;

import java.util.*;
import java.io.*;

public class Main {
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
