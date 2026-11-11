package J05013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Employee {
        private String id, hoTen;
        private float lt, th;

        public Employee(String id, String hoTen, float lt, float th){
            this.id = id;
            this.hoTen = hoTen;

            while(lt > 10){
                lt /= 10;
            }

            while(th > 10){
                th /= 10;
            }
            this.lt = lt;
            this.th = th;
        }

        public float diemTb(){
            return (lt + th) / 2;
        }

        public String kq(){
            float ans = diemTb();
            if(ans < 5){
                return "TRUOT";
            }
            else if(ans < 8){
                return "CAN NHAC";
            }
            else if(ans < 9.5){
                return "DAT";
            }
            else{
                return "XUAT SAC";
            }
        }

        @Override
        public String toString(){
            return String.format("%s %s %.2f %s", id, hoTen, diemTb(), kq());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Employee> ems = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String id = String.format("TS%02d", i);
            String hoTen = br.readLine().trim();
            float lt = Float.parseFloat(br.readLine().trim());
            float th = Float.parseFloat(br.readLine().trim());
            ems.add(new Employee(id, hoTen, lt, th));
        }

        ems.sort((a, b) ->
                Float.compare(b.diemTb(), a.diemTb()));

        ems.forEach(System.out::println);
    }
}
