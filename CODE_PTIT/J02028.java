//Cho dãy số A[] gồm có N phần tử không âm và số K.
//
//Nhiệm vụ của bạn là hãy xác định xem có tìm được 1 dãy con liên tiếp mà tổng các phần tử bằng K hay không?
//
//Input:
//
//Dòng đầu tiên là số lượng bộ test T (T ≤ 20).
//
//Mỗi test gồm số nguyên N và K (1≤ N ≤ 100 000, 0 ≤ K ≤ 1018).
//
//Dòng tiếp theo gồm N số nguyên A[i] (0 ≤ A[i] ≤ 109).
//
//Output:
//
//Với mỗi test, in ra trên một dòng là đáp án thu được. Nếu có hãy in ra “YES”. Nếu không tìm được đáp án, in ra “NO”.
//
//Ví dụ:
//
//
//Input	Output
//3
//
//
//        6 33
//
//
//        1 4 20 3 10 5
//
//
//        7 7
//
//
//        1 4 0 0 3 10 5
//
//
//        2 0
//
//
//        1 4
//
//
//
//YES
//
//
//        YES
//
//
//NO
//
//
//
//
//
//Giải thích test 1:
//
//        20+3+10 = 33

import java.util.Scanner;

public class J02028 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }

            if(k == 0){
                sb.append("NO\n");
                continue;
            }
            int left = 0;
            long sum = 0;
            boolean check = false;
            for(int right = 0; right < n; right++){
                sum += a[right];

                while(sum > k && left < right){
                    sum -= a[left];
                    left++;
                }

                if(sum == k){
                    check = true;
                    break;
                }
            }

            sb.append(check ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}

//Tối ưu I/O
//import java.io.*;
//import java.util.*;
//
//public class J02028 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StreamTokenizer st = new StreamTokenizer(br);
//        StringBuilder sb = new StringBuilder();
//
//        st.nextToken(); int t = (int) st.nval;
//        while(t-- > 0){
//            st.nextToken(); int n = (int) st.nval;
//            st.nextToken(); long k = (long) st.nval;
//
//            long[] a = new long[n];
//            for(int i = 0; i < n; i++){
//                st.nextToken();
//                a[i] = (long) st.nval;
//            }
//
//            if(k == 0){
//              sb.append("NO\n");
//              continue;
//            }
//
//            int left = 0;
//            long sum = 0;
//            boolean check = false;
//            for(int right = 0; right < n; right++){
//                sum += a[right];
//                while(sum > k && left <= right){
//                    sum -= a[left];
//                    left++;
//                }
//                if(sum == k){
//                  check = true;
//                  break;
//                }
//            }
//            sb.append(check ? "YES\n" : "NO\n");
//        }
//        System.out.print(sb);
//    }
//}
