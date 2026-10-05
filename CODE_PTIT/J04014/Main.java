package J04014;

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
