package J05035;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Student> st = new ArrayList<>();

        int n = Integer.parseInt(br.readLine().trim());
        for(int i = 1; i <= n; i++){
            String id = br.readLine().trim();
            String name = br.readLine().trim();
            String lop =  br.readLine().trim();
            String email = br.readLine().trim();
            String dn = br.readLine().trim();
            st.add(new Student(i, id, name, lop, email, dn));
        }

        st.sort((a, b) ->
                a.getId().compareTo(b.getId()));

        int q = Integer.parseInt(br.readLine().trim());
        while(q-- >0){
            StringBuilder ans = new StringBuilder();
            String tmp = br.readLine().trim();
            for(Student s : st){
                if(s.getDn().compareTo(tmp) == 0){
                    ans.append(s).append("\n");
                }
            }

            System.out.print(ans);
        }
    }
}
