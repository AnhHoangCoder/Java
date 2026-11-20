package J05025;

import java.util.*;
import java.io.*;

public class Main {
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
