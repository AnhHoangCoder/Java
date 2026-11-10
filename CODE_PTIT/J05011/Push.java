package J05011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Push {
    public static class Player {
        private String id, name, in, out;
        public Player(String id, String name, String in, String out){
            this.id = id;
            this.name = name;
            this.in = in;
            this.out = out;
        }

        public int toMinutes(String times){
            String[] parts = times.split(":");
            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            return h * 60 + m;
        }

        public int gamePlay(){
            return toMinutes(out) - toMinutes(in);
        }

        @Override
        public String toString() {
            int ans = gamePlay();
            return String.format("%s %s %d gio %d phut", id, name, ans/60, ans%60);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<Player> players = new ArrayList<>();
        while(n-- >0){
            String id = br.readLine().trim();
            String name = br.readLine().trim();
            String in = br.readLine().trim();
            String out = br.readLine().trim();
            players.add(new Player(id, name, in, out));
        }

        players.sort((a, b) ->
                Integer.compare(b.gamePlay(), a.gamePlay()));

        players.forEach(System.out::println);
    }
}