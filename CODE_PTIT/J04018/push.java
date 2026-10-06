package J04018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class push {
    public static class Complex {
        private int real, imag;

        public Complex(int real, int imag) {
            this.real = real;
            this.imag = imag;
        }

        public static Complex add(Complex a, Complex b) {
            return new Complex(a.real + b.real, a.imag + b.imag);
        }

        public static Complex multiply(Complex a, Complex b) {
            int Real = a.real * b.real - a.imag * b.imag;
            int Imag = a.real * b.imag + a.imag * b.real;
            return new Complex(Real, Imag);
        }

        @Override
        public String toString() {
            char tmp = '+';
            StringBuilder sb = new StringBuilder();
            sb.append(real).append(" ");
            if(imag < 0){
                tmp = '-';
            }
            sb.append(tmp).append(" ").append(Math.abs(imag)).append("i");
            return sb.toString();
        }
    }

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

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(getToken());
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int a = Integer.parseInt(getToken());
            int b = Integer.parseInt(getToken());
            int c = Integer.parseInt(getToken());
            int d = Integer.parseInt(getToken());

            Complex A = new Complex(a, b);
            Complex B = new Complex(c, d);

            Complex tmp = Complex.add(A, B);
            Complex C = Complex.multiply(tmp, A);
            Complex D = Complex.multiply(tmp, tmp);

            sb.append(C).append(", ").append(D).append("\n");
        }
        System.out.print(sb);
    }
}
