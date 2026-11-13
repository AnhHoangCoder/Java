package J05019;

import java.util.*;
import java.io.*;
import java.time.LocalTime;
import java.time.Duration;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        LinkedHashMap<String, Rainy> map = new LinkedHashMap<>();
        int id = 1;
        while(n-- >0){
            String name = br.readLine().trim();
            String start =  br.readLine().trim();
            String end = br.readLine().trim();
            long rain = Long.parseLong(br.readLine().trim());

            LocalTime startTime = LocalTime.parse(start);
            LocalTime endTime = LocalTime.parse(end);

            long minutes = Duration.between(startTime, endTime).toMinutes();
            if(!map.containsKey(name)){
                Rainy r = new Rainy(id++, name, minutes, rain);
                map.put(name, r);
            }
            else{
                Rainy r = map.get(name);
                r.addMinutes(minutes);
                r.addRain(rain);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Rainy r : map.values()){
            sb.append(r).append("\n");
        }
        System.out.print(sb);
    }
}
