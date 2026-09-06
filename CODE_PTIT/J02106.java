//Cho ma trận A[] có N hàng và 3 cột, trong đó các vị trí là các giá trị nhị phân (0 hoặc 1). Hãy đếm xem có bao nhiêu hàng mà số lượng số 1 nhiều hơn số lượng số 0.
//
//Input
//
//Dòng đầu ghi số nguyên dương N (không quá 1000).
//
//N dòng tiếp theo, mỗi dòng ghi 3 giá trị nhị phân.
//
//Output
//
//Ghi ra số dòng mà số lượng số 1 nhiều hơn số lượng số 0.
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
//        1 1 0
//
//
//        1 1 1
//
//
//        1 0 0
//
//
//
//        2
//
//
//
//
//        2
//
//
//        1 0 0
//
//
//        0 1 1
//
//
//
//        1

import java.util.*;
import java.io.*;

public class J02106 {
    static BufferedReader br;
    static StreamTokenizer st;

    static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    static int count_1(int[][] a, int n){
        int res = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < 3; j++){
                if(a[i][j] == 1){
                    count++;
                }
            }

            if(count > 3 - count){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StreamTokenizer(br);

        int n = nextInt();
        int[][] a = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = nextInt();
            }
        }

        System.out.println(count_1(a, n));
    }
}