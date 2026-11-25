package J05038;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Employee {
        private String id, name, cv;
        private long sal;
        private int qtt;

        public Employee(String id, String name, long sal, int qtt, String cv) {
            this.id = id;
            this.name = name;
            this.sal = sal;
            this.qtt = qtt;
            this.cv = cv;
        }

        public long salMon(){
            return sal * qtt;
        }

        public long bonus(){
            if(qtt >= 25) return (long) (0.2 * salMon());
            if(qtt >= 22) return (long) (0.1 * salMon());
            return 0;
        }

        public int pc(){
            if(cv.equals("GD")) return 250000;
            if(cv.equals("PGD")) return 200000;
            if(cv.equals("TP")) return 180000;
            if(cv.equals("NV")) return 150000;
            return 0;
        }

        public long total(){
            return salMon() + bonus() + pc();
        }

        @Override
        public String toString(){
            return String.format("%s %s %d %d %d %d", id, name, salMon(), bonus(), pc(), total());
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Employee> eps = new ArrayList<>();

        int n = Integer.parseInt(br.readLine().trim());
        for(int i = 1; i <= n; i++){
            String id = String.format("NV%02d", i);
            String name = br.readLine().trim();
            long sal = Long.parseLong(br.readLine().trim());
            int qtt = Integer.parseInt(br.readLine().trim());
            String cv = br.readLine().trim();
            eps.add(new Employee(id, name, sal, qtt, cv));
        }

        StringBuilder ans = new StringBuilder();
        long total = 0;
        for(Employee e : eps){
            total += e.total();
            ans.append(e).append("\n");
        }

        ans.append(String.format("Tong chi phi tien luong: %d", total));
        System.out.print(ans);
    }
}
