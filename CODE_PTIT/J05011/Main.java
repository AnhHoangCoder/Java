package J05011;

import java.util.*;
import java.io.*;

public class Main {
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
