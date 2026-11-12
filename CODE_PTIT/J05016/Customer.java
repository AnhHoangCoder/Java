package J05016;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Customer {
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
