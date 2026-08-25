//Cho dãy số A[] gồm có N phần tử. Một bộ 3 số (a, b, c) được gọi là bộ ba số Pytago nếu như a^2 + b^2 = c^2.
//
//Nhiệm vụ của bạn là kiểm tra xem có tồn tại bộ ba số Pytago trong dãy số A[] hay không?
//
//Input:
//
//Dòng đầu tiên là số lượng bộ test T (T ≤ 20).
//Mỗi test gồm số nguyên N (1≤ N ≤5000).
//Dòng tiếp theo gồm N số nguyên A[i] (1 ≤ A[i] ≤ 109).
//Output:
//
//Với mỗi test, in ra trên một dòng “YES” nếu tìm được, và “NO” trong trường hợp ngược lại.
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
//        5
//
//
//        3 1 4 6 5
//
//
//        3
//
//
//        1 1 1
//
//
//
//
//
//
//YES
//
//
//        NO

import java.util.Scanner;
import java.util.Arrays;

public class J02016 {
    static boolean hasPytago(int[] a, int n){
        for(int k = n - 1; k >= 2; k--){
            long target = (long) a[k] * a[k];
            int i = 0, j = k - 1;
            while(i < j){
                long sum = (long) a[i] * a[i] + (long) a[j] * a[j];
                if(sum == target){
                    return true;
                }
                else if(sum < target){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            sb.append(hasPytago(a, n) ? "YES" : "NO");
            System.out.println(sb);
        }
    }
}
