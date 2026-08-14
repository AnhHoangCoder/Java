//Cho số nguyên dương N.
//
//Nhiệm vụ của bạn là hãy xác định xem có bao nhiêu ước số của N chia hết cho 2?
//
//Input:
//
//Dòng đầu tiên là số lượng bộ test T (T ≤ 100).
//
//Mỗi bộ test gồm một số nguyên N (1 ≤ N ≤ 109)
//
//Output:
//
//Với mỗi test, in ra đáp án tìm được trên một dòng.
//
//Ví dụ:
//
//
//Input:
//
//Output:
//
//        2
//
//
//        9
//
//
//        8
//
//
//
//        0
//
//
//        3
//

import java.util.Scanner;

public class J01012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(count(n));
        }
    }
    public static int count(int n){
        int count = 0;
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                if(i % 2 == 0){
                    count++;
                }

                int other = n / i;
                if(other != i && other % 2 == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
