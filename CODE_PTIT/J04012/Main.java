package J04012;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String hoTen = br.readLine().trim();
        int luongCoBan = Integer.parseInt(br.readLine().trim());
        int dayCong =  Integer.parseInt(br.readLine().trim());
        String cv =  br.readLine().trim();

        Employee e = new Employee(hoTen, luongCoBan, dayCong, cv);
        System.out.print(e);
    }
}
