package J05016;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Customer> cts = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String maKh = String.format("KH%02d", i);
            String name =  br.readLine().trim();
            String roomNumber = br.readLine().trim();
            String checkIn =  br.readLine().trim();
            String checkOut = br.readLine().trim();
            int money = Integer.parseInt(br.readLine().trim());
            cts.add(new Customer(maKh, name, roomNumber, checkIn, checkOut, money));
        }

        cts.sort((a, b) -> Long.compare(b.Total(), a.Total()));

        cts.forEach(System.out::println);
    }
}
