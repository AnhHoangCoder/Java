package J05033;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Time {
        private int hour, minute, second;

        public Time(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public long totalTime(){
            return hour * 60 * 60 + minute * 60 + second;
        }

        @Override
        public String toString() {
            return String.format("%d %d %d", hour, minute, second);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =  Integer.parseInt(br.readLine());
        ArrayList<Time> t = new ArrayList<>();
        while (n-- > 0){
            String[] a =  br.readLine().trim().split("\\s+");
            t.add(new Time(Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2])));
        }

        t.sort((a, b) ->
                Long.compare(a.totalTime(), b.totalTime()));

        t.forEach(System.out::println);
    }
}
