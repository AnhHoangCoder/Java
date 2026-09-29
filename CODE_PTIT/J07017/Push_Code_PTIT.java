package J07017;

import java.util.*;
import java.io.*;

public class Push_Code_PTIT {
    public static class Pair<A, B> {
        private A first;
        private B second;

        public Pair(A a, B b){
            this.first = a;
            this.second = b;
        }

        public boolean isPrime(){
            return checkPrime((Integer)first) && checkPrime((Integer)second);
        }

        private boolean checkPrime(int n){
            if(n < 2) return false;
            if(n == 2 || n == 3) return true;
            if(n % 2 == 0 || n % 3 == 0) return false;
            for(int i = 5; i * i <= n; i += 6){
                if(n % i == 0 || n % (i + 2) == 0) return false;
            }
            return true;
        }

        @Override
        public String toString(){
            return first + " " + second;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
