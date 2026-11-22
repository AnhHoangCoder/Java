package J05032;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        Human youngest, oldest;
        String[] a = br.readLine().trim().split("\\s+");
        youngest = new Human(a[0], a[1]);
        oldest = new Human(a[0], a[1]);

        for(int i = 1; i < n; i++){
            String[] b = br.readLine().trim().split("\\s+");
            Human tmp = new Human(b[0], b[1]);
            if(tmp.tinhTuoi() < youngest.tinhTuoi()){
                youngest = tmp;
            }

            if(tmp.tinhTuoi() > oldest.tinhTuoi()){
                oldest = tmp;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(youngest.getName()).append("\n");
        sb.append(oldest.getName()).append("\n");
        System.out.print(sb);
    }
}
