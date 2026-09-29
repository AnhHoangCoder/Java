package J07016;

import java.util.*;
import java.io.*;

public class Main {
    static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i * i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    public static void main(String [] args) throws Exception {
        Map<Integer, int[]> map = new TreeMap<>();

        for(int file = 1; file <= 2; file++){
            String name = "DATA" + file + ".in";

            try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(name)))){
                ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();

                for(Integer x : list){
                    if(isPrime(x)){
                        map.putIfAbsent(x, new int[2]);
                        map.get(x)[file - 1]++;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, int[]> e : map.entrySet()){
            int[] a = e.getValue();
            if(a[0] > 0 && a[1] > 0){
                sb.append(e.getKey()).append(" ").append(a[0]).append(" ").append(a[1]).append("\n");
            }
        }
        System.out.print(sb);
    }
}
