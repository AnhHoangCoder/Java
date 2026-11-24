package J05036;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Item {
        private String id, name, uom;
        private double ship, total, sell;

        public Item(String id, String name, String uom, double pur, double quantity){
            this.id = id;
            this.name = name;
            this.uom = uom;

            this.ship = Math.ceil(pur * quantity * 0.05);
            this.total = Math.ceil(pur * quantity + ship);
            this.sell = 1.02 * total;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %.0f %.0f %.0f", id, name, uom, ship, total, sell);
        }
    }

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
