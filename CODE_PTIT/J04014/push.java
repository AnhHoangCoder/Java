package J04014;

import java.util.*;
import java.io.*;

public class push {
    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException {
        while(tok == null || !tok.hasMoreTokens()){
            String line = br.readLine();
            if(line == null) return null;
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    public static class Fraction {
        private long tu, mau;

        public Fraction(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
        }

        static long GCD(long a, long b) {
            while(b != 0){
                long tmp = a % b;
                a = b;
                b = tmp;
            }
            return a;
        }

        void rutGon(){
            long gcd = GCD(tu, mau);
            tu /= gcd;
            mau /= gcd;
        }

        public static Fraction mul(Fraction a, Fraction b) {
            return new Fraction(a.tu * b.tu, a.mau * b.mau);
        }

        public static Fraction C(Fraction a, Fraction b){
            long gcd = GCD(a.mau, b.mau);
            long lcm = a.mau / gcd * b.mau;

            long tu = a.tu * (lcm / a.mau) + b.tu  * (lcm / b.mau);
            Fraction c = new Fraction(tu, lcm);
            c.rutGon();

            Fraction res = mul(c, c);
            res.rutGon();
            return res;
        }

        public static Fraction D(Fraction a, Fraction b){
            Fraction c = C(a, b);
            Fraction e = mul(a, b);
            e.rutGon();

            Fraction res = mul(c, e);
            res.rutGon();
            return res;
        }

        @Override
        public String toString(){
            return tu + "/" + mau;
        }
    }
    
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(getToken());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            int x1 = Integer.parseInt(getToken());
            int y1 = Integer.parseInt(getToken());
            int x2 = Integer.parseInt(getToken());
            int y2 = Integer.parseInt(getToken());

            Fraction a =  new Fraction(x1,y1);
            Fraction b =  new Fraction(x2,y2);

            sb.append(Fraction.C(a, b)).append(" ")
                    .append(Fraction.D(a, b)).append("\n");
        }
        System.out.print(sb);
    }
}
