//Cho ma trận vuông A cỡ N*N chỉ bao gồm các số nguyên dương không quá 1000. Hãy sắp đặt các giá trị trong ma trận A sao cho các số được điền lần lượt theo kiểu xoắn ốc tăng dần, theo chiều kim đồng hồ.
//
//Input
//
//Dòng đầu ghi số N (2 < N < 20).
//
//N dòng tiếp theo ghi ma trận A, các giá trị nguyên dương và không quá 1000.
//
//Output
//
//Ghi ra ma trận kết quả
//
//Ví dụ
//
//
//Input
//
//        Output
//
//3
//
//
//        3 6 1
//
//
//        8 7 9
//
//
//        4 12 5
//
//
//
//        1 3 4
//
//
//        9 12 5
//
//
//        8 7 6

import java.util.*;
import java.io.*;

public class J02102 {
    static BufferedReader br;
    static StreamTokenizer st;

    static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StreamTokenizer(br);

        int n = nextInt();
        int[] a = new int[n * n];

        int tmp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[tmp++] = nextInt();
            }
        }

        Arrays.sort(a);

        tmp = 0;
        int[][] b =  new int[n][n];
        StringBuilder sb = new StringBuilder();

        int col1 = 0, col2 = n - 1, row1 = 0, row2 = n - 1;
        while(row1 <= row2 && col1 <= col2){
            for(int i = col1; i <= col2; i++){
                b[row1][i] = a[tmp++];
            }
            row1++;
            for(int i = row1; i <= row2; i++){
                b[i][col2] = a[tmp++];
            }
            col2--;
            if(row1 <= row2){
                for(int i = col2; i >= col1; i--){
                    b[row2][i] = a[tmp++];
                }
                row2--;
            }
            if(col1 <= col2){
                for(int i = row2; i >= row1; i--){
                    b[i][col1] =  a[tmp++];
                }
                col1++;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sb.append(b[i][j]);
                if(j < n - 1){
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}