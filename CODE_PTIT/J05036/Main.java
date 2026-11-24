package J05036;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Item> its = new ArrayList<>();

        int n = Integer.parseInt(br.readLine().trim());
        for(int i = 1; i <= n; i++){
            String id = String.format("MH%02d", i);
            String name = br.readLine().trim();
            String uom = br.readLine().trim();
            double pur = Double.parseDouble(br.readLine().trim());
            double quantity = Double.parseDouble(br.readLine().trim());
            its.add(new Item(id, name, uom, pur, quantity));
        }

        its.forEach(System.out::println);
    }
}
