package J03038;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Character> set = new HashSet<>();
        String s = br.readLine().trim();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                set.add(c);
            }
        }
        System.out.println(set.size());
    }
}
