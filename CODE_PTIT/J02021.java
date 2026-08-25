//Cho hai số N và K (2 < K < N < 10).
//
//Sử dụng thuật toán sinh kế tiếp hoặc quay lui, hãy liệt kê tất cả các tổ hợp chập K phần tử của N số nguyên dương đầu tiên theo thứ tự tăng dần.
//
//        Input
//
//Chỉ có một dòng ghi hai số N và K.
//
//Output
//
//Ghi ra lần lượt các tổ hợp, các giá trị số trong tổ hợp viết sát cạnh nhau, các tổ hợp cách nhau một khoảng trống.  Dòng cuối cùng ghi ra tổng số tổ hợp theo mẫu như trong ví dụ.
//
//        Ví dụ
//
//
//
//Input
//
//        Output
//
//5 3
//
//
//        123 124 125 134 135 145 234 235 245 345
//
//
//Tong cong co 10 to hop

import java.util.Scanner;

public class J02021 {
    static int n, k, count;

    static void backTrack(int start, int[] a, int idx, StringBuilder sb){
        if(idx == k){
            for(int i = 0; i < k; i++){
                sb.append(a[i]).append(i < k - 1 ? "" : " ");
            }
            count++;
            return;
        }

        for(int i = start; i <= n; i++){
            a[idx] = i;
            backTrack(i + 1, a, idx + 1, sb);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        int[] a = new int[k];
        for(int i = 0; i < k; i++){
            a[i] = i + 1;
        }

        StringBuilder sb = new StringBuilder();
        count = 0;

        backTrack(1, a, 0, sb);
        sb.append("\n").append("Tong cong co ").append(count).append(" to hop");
        System.out.println(sb);
    }
}
