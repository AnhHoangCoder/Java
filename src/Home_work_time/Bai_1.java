package Home_work_time;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bai_1 {
    public static void main(String[] argc){
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày tháng năm sinh của bạn : ");

        String tmp = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate birth = LocalDate.parse(tmp , dtf);

        int day = birth.getDayOfMonth();
        int month = birth.getMonthValue();
        int year = birth.getYear();

        System.out.println("Ngày tháng năm sinh của bạn là  : " + day + "/" + month + "/" + year);

        //Xuất theo định dạng
        SimpleDateFormat dinhdang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        //tạo 1 đối tượng date để get time trong đối tượng cal
        Date d = cal.getTime();
        String s = dinhdang.format(d);
        System.out.println("Bây giờ là : " + s);
        sc.close();
    }
}
