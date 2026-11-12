package J05016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Push {
    public static class Customer {
        private String maKh, name, roomNumber, checkIn, checkOut;
        private int money;

        public Customer(String maKh, String name,String roomNumber, String checkIn, String checkOut, int money) {
            this.maKh = maKh;
            this.name = name;
            this.roomNumber = roomNumber;
            this.checkIn = checkIn;
            this.checkOut = checkOut;
            this.money = money;
        }

        public long lengthOfStay(){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate checkInDate = LocalDate.parse(checkIn, dtf);
            LocalDate checkOutDate = LocalDate.parse(checkOut, dtf);
            long days = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
            return days + 1;
        }

        public long Total(){
            int[] a = {25, 34, 50, 80};
            return lengthOfStay() * (long)(a[(roomNumber.charAt(0) - '0') - 1]) + money;
        }

        @Override
        public String toString() {
            return String.format("%s %s %s %d %d", maKh, name, roomNumber, lengthOfStay(), Total());
        }
    }

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
