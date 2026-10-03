package J03037;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().trim();
        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, -1);
        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i) - 'A';
            if(first[c] == -1){
                first[c] = i;
            }
            else{
                last[c] = i;
            }
        }

        int count = 0;
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 26; j++){
                if(first[i] < first[j] && first[j] < last[i] && last[i] < last[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
