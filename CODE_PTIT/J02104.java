//Cho đồ thị vô hướng G=<V, E> được biểu diễn dưới dạng ma trận kề. Hãy viết chương trình thực hiện chuyển đổi biểu diễn đồ thị dưới dạng danh sách cạnh.
//
//        Input:
//
//Dòng đầu tiên ghi số N là số đỉnh của đồ thị (không quá 1000)
//N dòng tiếp theo đưa vào các phần tử của ma trận kề.
//        Output:
//
//Đưa ra danh sách cạnh tương ứng theo khuôn dạng trong ví dụ dưới đây.
//Ví dụ:
//
//
//Input
//
//        Output
//
//6
//
//
//        0 1 1 0 1 0
//
//
//        1 0 1 0 1 0
//
//
//        1 1 0 1 0 0
//
//
//        0 0 1 0 1 1
//
//
//        1 1 0 1 0 1
//
//
//        0 0 0 1 1 0
//
//
//
//        (1,2)
//
//
//        (1,3)
//
//
//        (1,5)
//
//
//        (2,3)
//
//
//        (2,5)
//
//
//        (3,4)
//
//
//        (4,5)
//
//
//        (4,6)
//
//
//        (5,6)

import java.util.*;
import java.io.*;

public class J02104 {
    static BufferedReader br;
    static StreamTokenizer st;

    static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StreamTokenizer(br);

        int n = nextInt();
        int[][] a = new int[n + 1][n + 1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                a[i][j] = nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++){
            for(int j = i + 1; j <= n; j++){
                if(a[i][j] == 1){
                    sb.append("(");
                    sb.append(i).append(",").append(j);
                    sb.append(")\n");
                }
            }
        }
        System.out.print(sb);
    }
}