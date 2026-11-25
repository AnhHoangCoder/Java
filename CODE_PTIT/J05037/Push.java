package J05037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Item {
        private String id, name, uom;
        private double pur;
        private int qtt;

        public Item(String id, String name, String uom, double pur, int qtt){
            this.id = id;
            this.name = name;
            this.uom = uom;
            this.pur = pur;
            this.qtt = qtt;
        }

        public long shFee(){
            return Math.round(pur * qtt * 0.05);
        }

        public long total(){
            return Math.round(pur * qtt + shFee());
        }

        public long sell(){
            return (long) (Math.ceil((1.02 * total() / qtt) / 100) * 100);
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %d %d %d", id, name, uom, shFee(), total(), sell());
        }
    }

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
