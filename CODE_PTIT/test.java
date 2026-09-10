import java.util.*;
import java.io.*;

public class test{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        StringBuilder sb = new StringBuilder();

        st.nextToken();
        int t = (int)st.nval;
        while(t-->0){
            st.nextToken();
            int n = (int)st.nval;
            st.nextToken();
            long k = (long)st.nval;


        }
    }
}