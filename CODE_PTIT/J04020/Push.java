package J04020;

import java.util.Scanner;

public class Push {
    public static class Pair <T extends Number, U extends Number> {
        private T first;
        private U second;

        public Pair(T first, U second){
            this.first = first;
            this.second = second;
        }

        private boolean isPrime(int n){
            if(n < 2) return false;
            for(int i = 2; (long) i * i <= n; i++){
                if(n % i == 0) return false;
            }
            return true;
        }

        public boolean isPrime(){
            return isPrime(first.intValue()) && isPrime(second.intValue());
        }

        @Override
        public String toString(){
            return first + " " + second;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
