//Cho ma trận A chỉ gồm các số nguyên dương cấp N*M. Hãy viết chương trình tính tích của A với ma trận chuyển vị của A.
//
//Dữ liệu vào: Dòng đầu tiên ghi số bộ test. Với mỗi bộ test: Dòng đầu tiên ghi hai số n và m là bậc của ma trân a; n dòng tiếp theo, mỗi dòng ghi m  số của một dòng trong ma trận A.
//
//Kết quả: Với mỗi bộ test ghi ra thứ tự bộ test, sau đó đến ma trận tích tương ứng, mỗi số cách nhau đúng một khoảng trống.
//
//Ví dụ
//
//
//Input
//
//        Output
//
//1
//
//
//        2  2
//
//
//        1  2
//
//
//        3  4
//
//
//
//Test 1:
//
//
//        5 11
//
//
//        11 25

import java.util.*;
import java.io.*;

public class J02103 {
    static BufferedReader br;
    static StreamTokenizer st;

    static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    static int[][] transpose(int[][] a, int n, int m){
        int[][] res = new int[m][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                res[j][i] = a[i][j];
            }
        }
        return res;
    }

    static int[][] mul_matrix(int[][] a, int[][] b, int n, int p, int m){
        int[][] res = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int sum = 0;
                for(int k = 0; k < p; k++){
                    sum += a[i][k] * b[k][j];
                }
                res[i][j] = sum;
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StreamTokenizer(br);

        int t = nextInt();
        for(int c = 1; c <= t; c++){
            int n = nextInt();
            int m = nextInt();

            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = nextInt();
                }
            }

            int[][] b = transpose(a, n, m);

            StringBuilder sb = new StringBuilder();

            sb.append("Test ").append(c).append(":\n");

            int[][] res = mul_matrix(a, b, n, m, n);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    sb.append(res[i][j]);
                    if(j < n - 1){
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }

            System.out.print(sb);
        }
    }
}