//Cho ma trận vuông A[N][N]. Hãy in các phần tử thuộc ma trận theo kiểu từ trái qua phải ở hàng đầu tiên, sau đó từ phải qua trái ở hàng thứ hai ...
//
//Xem hình ví dụ để hiểu rõ hơn.
//
//
//
//Input:
//
//Dòng đầu tiên đưa vào số lượng bộ test T.
//Những dòng kế tiếp đưa vào T bộ test. Mỗi bộ test gồm hai dòng: dòng đầu tiên đưa vào N là cấp của ma trận A[N][N]; dòng tiếp theo đưa vào N×N số A[i][j] ; các số được viết cách nhau một vài khoảng trống.
//T, N, A[i][j] thỏa mãn ràng buộc: 1≤ T ≤100; 1≤ N ≤100; 1≤ A[i][j] ≤150.
//Output:
//
//Đưa ra kết quả mỗi test theo từng dòng.
//Ví dụ:
//
//Input:
//
//Output:
//
//        2
//        3
//        45 48 54 21 89 87 70 78 15
//        2
//        25 27 23 21
//
//
//        45 48 54 87 89 21 70 78 15
//        25 27 21 23
import java.io.*;
import java.util.*;

public class J02101 {
    static BufferedReader br;
    static StreamTokenizer st;

    static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StreamTokenizer(br);

        int t = nextInt();
        while(t-->0){
            int n = nextInt();
            int[][] a = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = nextInt();
                }
            }
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < n; i++){
                if(i % 2 == 0){
                    for(int j = 0; j < n; j++){
                        sb.append(a[i][j]);
                        if(j < n - 1 || i < n - 1){
                            sb.append(" ");
                        }
                    }
                }
                else{
                    for(int j = n - 1; j >= 0; j--){
                        sb.append(a[i][j]);
                        if(j > 0 || i < n - 1){
                            sb.append(" ");
                        }
                    }
                }
            }
            System.out.println(sb);
        }
    }
}