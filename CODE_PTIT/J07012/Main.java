package J07012;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list;
        try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA.in")))){
            list = (ArrayList<String>) in.readObject();
        }

        Map<String, Integer> map = new HashMap<>();
        for(String line : list){
            String s = line.toLowerCase().replaceAll("[^a-z0-9]", " ");
            StringTokenizer st = new StringTokenizer(s);
            while(st.hasMoreTokens()){
               map.merge(st.nextToken(), 1 , Integer::sum);
            }
        }

        List<Map.Entry<String, Integer>> res = new ArrayList<>(map.entrySet());
        res.sort((a, b) -> {
            if(!a.getValue().equals(b.getValue())){
                return Integer.compare(b.getValue(), a.getValue());
            }
            return a.getKey().compareTo(b.getKey());
        });

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> entry : res){
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }
        System.out.print(sb);
    }
}
