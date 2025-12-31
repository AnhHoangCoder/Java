package Home_work_time;

//Nhập ngày tháng năm sinh và hiển thị trên màn hình là tuổi hiện tại và date now

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Bai_2 {
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        System.out.print("Nhập vào ngày tháng năm sinh của bạn : ");
        String birth = sc.nextLine();

        birth = birth.replace("-" , "/");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dt = LocalDate.parse(birth , dtf);

        int birth_year = dt.getYear();
        int birth_month = dt.getMonthValue();
        int birth_day = dt.getDayOfMonth();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date d = cal.getTime();

        String s = sdf.format(d);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int tuoi = year - birth_year;
        if(month < birth_month){
            tuoi--;
        }
        else{
            if(day < birth_day){
                tuoi--;
            }
        }

        System.out.println("Bây giờ là " + s);
        System.out.println("Tuổi của bạn là : " + tuoi);
    }
}
