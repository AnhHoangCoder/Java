package J05032;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Human {
    private String name, date;

    public Human(String name, String date){
        this.name = name;
        this.date = date;
    }

    public String getName(){
        return this.name;
    }

    public long tinhTuoi(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob = LocalDate.parse(date, fmt);
        return ChronoUnit.DAYS.between(dob, LocalDate.now());
    }
}
