package J05028;

import java.util.*;
import java.io.*;

public class Main {
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
