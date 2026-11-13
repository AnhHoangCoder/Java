package J05017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Customer {
        private String id, name;
        private int oldIdx,  newIdx;

        public Customer(String id, String name, int oldIdx, int newIdx) {
            this.id = id;
            this.name = name;
            this.oldIdx = oldIdx;
            this.newIdx = newIdx;
        }

        public int Total(){
            int length = newIdx - oldIdx;
            int money = 0;
            double fee;
            if(length <= 50){
                money =  length * 100;
                fee = 1.02;
            }
            else if(length <= 100){
                money =  50 * 100 + (length - 50) * 150;
                fee = 1.03;
            }
            else{
                money = 50 * 100 + 50 * 150 + (length - 100) * 200;
                fee = 1.05;
            }
            return (int)Math.round(money * fee);
        }

        @Override
        public String toString(){
            return String.format("%s %s %d", id, name, Total());
        }
    }

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
