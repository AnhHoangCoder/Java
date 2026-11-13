package J05017;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Customer> cts = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String id = String.format("KH%02d", i);
            String name = br.readLine().trim();
            int oldIdx = Integer.parseInt(br.readLine().trim());
            int newIdx = Integer.parseInt(br.readLine().trim());
            cts.add(new Customer(id, name, oldIdx, newIdx));
        }

        cts.sort((a, b) ->
                Integer.compare(b.Total(), a.Total()));

        cts.forEach(System.out::println);
    }
}
