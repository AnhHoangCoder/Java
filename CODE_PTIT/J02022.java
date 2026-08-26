//Cho số nguyên dương N (2 < N <10). Một số nguyên dương K có N chữ số được gọi là số xa cách nếu thỏa mãn:
//
//K không chứa chữ số 0
//Tất cả các chữ số từ 1 đến N đều xuất hiện trong K đúng 1 lần
//Không có hai chữ số liên tiếp nào trong K có hiệu bằng 1.
//Hãy liệt kê tất cả các số thỏa mãn theo thứ tự tăng dần.
//
//Input
//
//Dòng đầu ghi số bộ test (không quá 10)
//Mỗi bộ test là 1 số nguyên dương N (2 < N < 10)
//Output
//
//Liệt kê tất cả các số thỏa mãn, mỗi số trên một dòng.
//
//Sau mỗi test in ra một khoảng trống.
//
//Ví dụ
//
//
//Input
//
//        Output
//
//2
//
//
//        3
//
//
//        4
//
//
//
//
//
//
//        2413
//
//
//        3142

import java.util.Scanner;

public class J02022 {
    static int n;
    static int[] a;
    static boolean[] used;
    static StringBuilder sb;

    static void backTrack(int pos){
        if(pos == n){
            for(int i = 0; i < n; i++){
                sb.append(a[i]);
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++){
            if(used[i]) continue;
            if(pos > 0 && Math.abs(i - a[pos - 1]) == 1){
                continue;
            }

            used[i] = true;
            a[pos] = i;
            backTrack(pos + 1);
            used[i] = false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while(t-->0){
            n = sc.nextInt();
            a = new int[n];
            used = new boolean[n + 1];
            sb = new StringBuilder();

            backTrack(0);
            result.append(sb);
            result.append("\n");
        }
        System.out.print(result);
    }
}
