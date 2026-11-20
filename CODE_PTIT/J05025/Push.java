package J05025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Lecturer {
        private String id, name, department;

        public Lecturer(String id, String name, String department){
            this.id = id;
            this.name = name;
            this.department = department;
        }

        public String getDepart(){
            return department;
        }

        public String getName(){
            String[] a =  name.split("\\s+");
            return a[a.length - 1];
        }

        public String Depart(){
            String ans = "";
            String[] a = department.toUpperCase().split("\\s+");
            for(int i = 0; i < a.length; i++){
                ans += a[i].charAt(0);
            }
            return ans;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s", id, name, Depart());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Lecturer> lecs = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String id = String.format("GV%02d", i);
            String name = br.readLine().trim();
            String department = br.readLine().trim();
            lecs.add(new Lecturer(id, name, department));
        }

        lecs.sort((a, b) -> {
            int tmp = a.getName().compareTo(b.getName());
            if(tmp != 0){
                return tmp;
            }
            return a.getDepart().compareTo(b.getDepart());
        });

        lecs.forEach(System.out::println);
    }
}
