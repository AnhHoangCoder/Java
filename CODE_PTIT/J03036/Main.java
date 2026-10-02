package J03036;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] a = new String[n];
        for(int i = 0; i < n; i++){
            a[i] = br.readLine().trim();
        }

        int L = a[0].length();
        long best = Long.MAX_VALUE;

        for(int i = 0; i < L; i++){
            String D = a[0].substring(i) + a[0].substring(0, i);
            long total = 0;
            boolean ok = true;

            for(int j = 0; j < n; j++){
                if(a[j].length() != L){
                    ok = false;
                    break;
                }
                String dbl = a[j] + a[j];
                int pos = dbl.indexOf(D);
                if(pos == -1 || pos >= L) ok = false;
                else total += pos;
            }
            if(ok) best = Math.min(best, total);
        }
        System.out.println(best == Long.MAX_VALUE ? -1 : best);
    }
}
