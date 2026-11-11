package J05014;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Teacher> tes = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            String stt = String.format("GV%02d", i);
            String hoTen = br.readLine().trim();
            String id = br.readLine().trim();
            float tin = Float.parseFloat(br.readLine().trim());
            float toan = Float.parseFloat(br.readLine().trim());
            tes.add(new Teacher(stt, hoTen, id, tin, toan));
        }
        tes.sort((a, b) ->
                Float.compare(b.Total(), a.Total()));

        tes.forEach(System.out::println);
    }
}
