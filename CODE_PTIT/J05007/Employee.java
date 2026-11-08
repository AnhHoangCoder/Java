package J05007;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String maNv, hoTen, sex, date, addr, idThue, nkhd;

    public Employee(String maNv, String hoTen, String sex, String date, String addr, String idThue, String nkhd) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.sex = sex;
        this.date = date;
        this.addr = addr;
        this.idThue = idThue;
        this.nkhd = nkhd;
    }

    public LocalDate getDate(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return  LocalDate.parse(date, fmt);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", maNv, hoTen, sex, date, addr, idThue, nkhd);
    }
}
