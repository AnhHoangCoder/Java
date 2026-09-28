package J07011;

import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("VANBAN.in")))) {
            Map<String, Integer> map = new HashMap<>();

            int t = Integer.parseInt(br.readLine().trim());

            Pattern valid = Pattern.compile("^[a-zA-Z0-9]+$");

            while (t-- > 0) {
                String line = br.readLine();
                if (line == null) break;
                String[] a = line.trim().split("[.,?!:;()/\\s-]+");
                for (String s : a) {
                    if (!s.isEmpty() && valid.matcher(s).matches()){
                        s = s.toLowerCase();
                        map.put(s, map.getOrDefault(s, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((a, b) -> {
                if (!a.getValue().equals(b.getValue())) {
                    return Integer.compare(b.getValue(), a.getValue());
                }
                return a.getKey().compareTo(b.getKey());
            });

            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Integer> e : list) {
                sb.append(e.getKey()).append(" ").append(e.getValue()).append("\n");
            }
            System.out.print(sb);
        } catch (FileNotFoundException e) {
            System.out.println("Ko tim thay File: " + e.getMessage());
        }
    }
}