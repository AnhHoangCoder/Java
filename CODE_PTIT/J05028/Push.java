package J05028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Business {
        private String id, name;
        private int so;

        public Business(String id, String name, int so){
            this.id = id;
            this.name = name;
            this.so = so;
        }

        public int getSo(){
            return so;
        }

        public String getId(){
            return id;
        }

        @Override
        public String toString(){
            return String.format("%s %s %d", id, name, so);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Business> bus = new ArrayList<>();
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- >0){
            String id = br.readLine().trim();
            String name = br.readLine().trim();
            int so = Integer.parseInt(br.readLine().trim());
            bus.add(new Business(id, name, so));
        }

        bus.sort((a, b) -> {
            int tmp = Integer.compare(b.getSo(), a.getSo());
            if(tmp != 0) return tmp;
            return a.getId().compareTo(b.getId());
        });

        bus.forEach(System.out::println);
    }
}
