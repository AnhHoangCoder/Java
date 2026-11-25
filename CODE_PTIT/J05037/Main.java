package J05037;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Item> its = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String id = String.format("MH%02d", i);
            String name = br.readLine().trim();
            String uom = br.readLine().trim();
            double pur = Double.parseDouble(br.readLine().trim());
            int qtt = Integer.parseInt(br.readLine().trim());
            its.add(new Item(id, name, uom, pur, qtt));
        }
        its.sort((a, b) -> Double.compare(b.sell(), a.sell()));

        its.forEach(System.out::println);
    }
}
