package J05019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalTime;
import java.util.LinkedHashMap;

public class Push {
    public static class Rainy {
        private String id, name;
        private long totalMinutes, totalRain;

        public void addMinutes(long totalMinutes) {
            this.totalMinutes += totalMinutes;
        }

        public void addRain(long totalRain) {
            this.totalRain += totalRain;
        }

        public Rainy(int id, String name, long totalMinutes, long totalRain) {
            this.id = String.format("T%02d", id);
            this.name = name;
            this.totalMinutes = totalMinutes;
            this.totalRain = totalRain;
        }

        public double rainAvg(){
            return totalRain * 60.0 / totalMinutes;
        }

        @Override
        public String toString() {
            return String.format("%s %s %.2f", id, name, rainAvg());
        }
    }

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
