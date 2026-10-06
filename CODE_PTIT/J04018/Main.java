package J04018;

import java.util.*;
import java.io.*;

public class Main {
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
