package J05015;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        ArrayList<Push.Player> pls = new ArrayList<>();

        while (n-- > 0) {
            String hoTen = br.readLine().trim();
            String donVi = br.readLine().trim();
            String timeEnd = br.readLine().trim();

            pls.add(new Push.Player(hoTen, donVi, timeEnd));
        }

        pls.sort((a, b) ->
                Integer.compare(a.getTimeEnd(), b.getTimeEnd()));

        for (Push.Player p : pls) {
            System.out.println(p);
        }
    }
}
