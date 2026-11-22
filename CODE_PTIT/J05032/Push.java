package J05032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Push {
    public static class Human {
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        Human youngest, oldest;
        String[] a = br.readLine().trim().split("\\s+");
        youngest = new Human(a[0], a[1]);
        oldest = new Human(a[0], a[1]);

        for(int i = 1; i < n; i++){
            String[] b = br.readLine().trim().split("\\s+");
            Human tmp = new Human(b[0], b[1]);
            if(tmp.tinhTuoi() < youngest.tinhTuoi()){
                youngest = tmp;
            }

            if(tmp.tinhTuoi() > oldest.tinhTuoi()){
                oldest = tmp;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(youngest.getName()).append("\n");
        sb.append(oldest.getName()).append("\n");
        System.out.print(sb);
    }
}
