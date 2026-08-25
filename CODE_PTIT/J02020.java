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
//Ghi ra lần lượt các tổ hợp, mỗi tổ hợp trên một dòng, các phần tử cách nhau một khoảng trống. Dòng cuối cùng ghi ra tổng số tổ hợp theo mẫu như trong ví dụ.
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
//        1 2 3
//
//
//        1 2 4
//
//
//        1 2 5
//
//
//        1 3 4
//
//
//        1 3 5
//
//
//        1 4 5
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
//
//
//Tong cong co 10 to hop

import java.util.Scanner;

public class J02020 {
    static int n, k;
    static int[] a;
    static boolean sinh(){
        int i = k - 1;
        while(i >= 0 && a[i] == n - k + i + 1) i--;
        if(i < 0) return false;
        a[i]++;
        for(int j = i + 1; j < k; j++){
            a[j] = a[j - 1] + 1;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        a = new int[k];
        for(int i = 0; i < k; i++){
            a[i] = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        do{
            for(int i = 0; i < k; i++){
                sb.append(a[i]);
                if(i < k - 1){
                    sb.append(" ");
                }
            }
            sb.append("\n");
            count++;
        }while(sinh());
        sb.append("Tong cong co ").append(count).append(" to hop");

        System.out.println(sb);
    }
}
