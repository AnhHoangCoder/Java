//Cho mảng A[] gồm n số nguyên dương và số K. Hãy đếm số các cặp phần tử có hiệu nhỏ hơn K. Ví dụ A[] = {1, 10, 4, 2 }, K=3 ta nhận được kết quả là 2 tương ứng với các cặp (1, 2), (4, 2).
//
//Input:
//
//Dòng đầu tiên đưa vào số lượng bộ test T.
//Mỗi bộ test gồm hai dòng: dòng đầu tiên ghi số n và số K; dòng tiếp theo là n số A[i] ; các số được viết cách nhau một vài khoảng trống.
//T, n, k, A[i] thỏa mãn ràng buộc: 1 ≤  T  ≤ 100; 1 ≤  n  ≤ 104; 1 ≤  k ≤ 103; 1 ≤  A[i]  ≤ 105.
//Output:
//
//Đưa ra kết quả mỗi test theo từng dòng.
//Ví dụ:
//
//Input	Output
//2
//        4 3
//        1 10 4 2
//        3 5
//        2 3 4	2
//        3

import java.util.Scanner;
import java.util.Arrays;

public class J02027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);

            long count = 0;
            int left = 0;
            for(int right = 0; right < n; right++){
                while(a[right] - a[left] >= k){
                    left++;
                }
                count += ((long)right - left);
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}
