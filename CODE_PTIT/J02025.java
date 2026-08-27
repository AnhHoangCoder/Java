//Cho dãy số A[] có N phần tử là các số nguyên dương khác nhau từng đôi một. Hãy liệt kê tất cả các dãy con của A[] có tổng các phần tử là số nguyên tố.
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
//Với mỗi test, liệt kê tất cả các dãy con có tổng các phần tử là số nguyên tố theo thứ tự từ điển tăng dần, mỗi dãy con trên một dòng.
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
//        4
//
//
//        3 2 5 4
//
//
//
//        2
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
//        5
//
//
//        5 2
//
//
//        5 4 2
//

import java.util.*;

public class J02025 {
    static int n;
    static int[] a;
    static int[] cur;
    static int curSize;
    static StringBuilder sb = new StringBuilder();

    public static boolean primes(int n){
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        for(int i = 5; i * i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    static void backTrack(int start, int sum){
        for(int i = n - 1; i >= start; i--){
            cur[curSize++] = a[i];
            sum += a[i];

            if(primes(sum)){
                for(int j = 0; j < curSize; j++){
                    sb.append(cur[j]);
                    if(j < curSize - 1) sb.append(" ");
                }
                sb.append("\n");
            }

            backTrack(i + 1, sum);
            sum -= a[i];
            curSize--;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();

        while(t-->0){
            n = sc.nextInt();
            a = new int [n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            for(int l = 0, r = n - 1; l < r; l++, r--){
                int tmp = a[l];
                a[l] = a[r];
                a[r] = tmp;
            }

            cur = new int[n];
            curSize = 0;

            sb.setLength(0);
            backTrack(0, 0);
            ans.append(sb);
        }
        System.out.println(ans);
    }
}
