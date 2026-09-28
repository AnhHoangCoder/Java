package J07005;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] cnt = new int[1000];

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("DATA.IN")));
        for(int i = 0; i < 100000; i++){
            int x = in.readInt();
            cnt[x]++;
        }
        in.close();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] > 0){
                sb.append(i).append(" ").append(cnt[i]).append("\n");
            }
        }

        System.out.print(sb);
    }
}
