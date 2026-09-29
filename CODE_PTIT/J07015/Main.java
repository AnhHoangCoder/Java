package J07015;

import java.util.*;
import java.io.*;

public class Main {
    static boolean isPrime(Integer s){
        int n = s;
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i * i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception{
        ArrayList<Integer> list;
        try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("SONGUYEN.in")))){
            list = (ArrayList<Integer>)in.readObject();
        }

        Map<Integer, Integer> map = new TreeMap<>();
        for(Integer x : list){
            if(isPrime(x)){
                map.merge(x, 1, Integer::sum);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            sb.append(e.getKey()).append(" ").append(e.getValue()).append("\n");
        }
        System.out.print(sb);
    }
}
