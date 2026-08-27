//Cho dãy số A[] có N phần tử là các số nguyên dương khác nhau từng đôi một.
//
//Hãy sắp xếp dãy theo thứ tự giảm dần, sau đó liệt kê tất cả các dãy con (đúng thứ tự trước sau) của A[] có tổng các phần tử là số lẻ.
//
//Các dãy con được liệt kê theo thứ tự từ điển tăng dần.
//
//        Input
//
//Dòng đầu ghi số bộ test, mỗi test có 2 dòng:
//
//Dòng đầu ghi số N (2 < N <15)
//Dòng thứ 2 ghi N số của dãy A[], các số đều nguyên dương, nhỏ hơn 100 và khác nhau từng đôi một.
//Output
//
//Với mỗi test, liệt kê tất cả các dãy con có tổng các phần tử là số lẻ theo thứ tự từ điển tăng dần, mỗi dãy con trên một dòng.
//
//        Ví dụ
//
//
//Input
//
//        Output
//
//1
//
//
//        4
//
//
//        2 3 4 5
//
//
//
//        3
//
//
//        3 2
//
//
//        4 3
//
//
//        4 3 2
//
//
//        5
//
//
//        5 2
//
//
//        5 4
//
//
//        5 4 2

import java.util.*;

public class J02024 {
    static int n;
    static int[] a;
    static int[] cur;
    static int curSize;
    static StringBuilder sb = new StringBuilder();

    static void solve(int start, int sum){
        for(int i = n - 1; i >= start; i--){
            cur[curSize++] = a[i];
            sum += a[i];

            if(sum % 2 == 1){
                for(int j = 0; j < curSize; j++){
                    sb.append(cur[j]);
                    if(j < curSize - 1){
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }

            solve(i + 1, sum);
            sum -= a[i];
            curSize--;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            for(int l = 0, r = a.length - 1; l < r; l++, r--){
                int tmp = a[l];
                a[l] = a[r];
                a[r] = tmp;
            }

            cur = new int[n];
            curSize = 0;
            solve(0, 0);
        }

        System.out.println(sb);
    }
}
