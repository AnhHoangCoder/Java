//Cho đồ thị vô hướng G=<V, E> được biểu diễn dưới dạng ma trận kề. Hãy viết chương trình thực hiện chuyển đổi biểu diễn đồ thị dưới dạng danh sách kề.
//
//        Input:
//
//Dòng đầu tiên ghi số N là số đỉnh của đồ thị (không quá 1000)
//N dòng tiếp theo đưa vào các phần tử của ma trận kề.
//        Output:
//
//Đưa ra danh sách kề tương ứng theo khuôn dạng trong ví dụ dưới đây.
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
//List(1) = 2 3 5
//
//
//List(2) = 1 3 5
//
//
//List(3) = 1 2 4
//
//
//List(4) = 3 5 6
//
//
//List(5) = 1 2 4 6
//
//
//List(6) = 4 5

import java.util.*;
import java.io.*;

public class J02105 {
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
        int[][] a = new int[n][n];

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append("List(").append(i + 1).append(") = ");
            for(int j = 0; j < n; j++){
                a[i][j] = nextInt();
                if(a[i][j] == 1){
                    sb.append(j + 1).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}