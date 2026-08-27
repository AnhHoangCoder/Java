//Cho dãy số A[] có N phần tử là các số nguyên dương khác nhau từng đôi một và một số K < N.
//
//Hãy liệt kê tất cả các dãy con khác nhau có K phần tử của A[], mỗi dãy đều được sắp xếp theo thứ tự tăng dần.
//
//Các dãy con được liệt kê lần lượt theo thứ tự từ điển.
//
//        Input
//
//Dòng đầu ghi số bộ test, mỗi test có 2 dòng:
//
//Dòng đầu ghi hai số N và K (2 < K < N <15)
//Dòng thứ 2 ghi N số của dãy A[], các số đều nguyên dương, nhỏ hơn 100 và khác nhau từng đôi một.
//Output
//
//Với mỗi test, liệt kê tất cả các dãy con thỏa mãn, mỗi dãy con trên một dòng.
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
//        4 3
//
//
//        3 2 5 4
//
//
//
//        2 3 4
//
//
//        2 3 5
//
//
//        2 4 5
//
//
//        3 4 5

import java.util.Scanner;
import java.util.Arrays;

public class J02026 {
    static int n, k;
    static int[] a;
    static int[] cur;

    static StringBuilder sb = new StringBuilder();

    static void backTrack(int start, int count){
        if(count == k){
            for(int i = 0; i < k; i++){
                sb.append(cur[i]);
                if(i < k - 1){
                    sb.append(" ");
                }
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i < n; i++){
            cur[count] = a[i];
            backTrack(i + 1, count + 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        while(t-->0){
            n = sc.nextInt();
            k = sc.nextInt();

            a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            cur = new int[k];
            sb.setLength(0);
            backTrack(0, 0);
            ans.append(sb);
        }
        System.out.print(ans);
    }
}
