//Cho dãy số A[] gồm có N phần tử nguyên dương. Phần tử thứ i được gọi là điểm cân bằng của dãy số nếu như tổng các số bên trái bằng tổng các số bên phải của nó.
//
//Nhiệm vụ của bạn là điểm cân bằng đầu tiên của dãy A[] cho trước. Nếu không có đáp án, in ra -1.
//
//Input:
//
//Dòng đầu tiên là số lượng bộ test T (T ≤ 10).
//Mỗi test gồm số nguyên N (1≤ N ≤ 100 000), số lượng phần tử trong dãy số ban đầu.
//Dòng tiếp theo gồm N số nguyên A[i] (-1000 ≤ A[i] ≤ 1000).
//Output:
//
//Với mỗi test, in ra trên một dòng vị trí của điểm cân bằng tìm được.
//Ví dụ:
//
//
//Input:
//
//Output
//
//2
//
//
//        7
//
//
//        -7 1 5 2 -4 3 0
//
//
//        5
//
//
//        1 2 3 4 5
//
//
//
//
//
//
//        4
//
//
//        -1

import java.util.Scanner;

public class J02014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            int[] a = new int[n];

            long total = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                total += a[i];
            }

            long leftSum = 0;
            int ans = -1;
            for(int i = 0; i < n; i++){
                long rightSum = total - leftSum - a[i];
                if(rightSum == leftSum){
                    ans = i + 1;
                    break;
                }
                leftSum += a[i];
            }

            System.out.println(ans);
        }
    }
}
