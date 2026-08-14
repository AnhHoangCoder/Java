//Cho N số nguyên. Nhiệm vụ của bạn là phân tích các số nguyên đã cho dưới dạng tích của các thừa số nguyên tố, sau đó tính tổng các ước số nguyên tố này.
//
//Input:
//
//Dòng đầu tiên số nguyên N (1 ≤ N ≤ 106).
//N dòng tiếp theo, mỗi dòng gồm một số nguyên có giá trị không vượt quá 2*106.
//Output:
//
//In ra một số nguyên là đáp án tìm được.
//
//Ví dụ:
//
//
//Input:
//
//Output:
//
//        5
//
//
//        7
//
//
//        9
//
//
//        10
//
//
//        13
//
//
//        100
//
//
//
//        47
//
//
//
//
//
//Giải thích test:
//
//        7 = 7
//
//        9 = 3 x 3 à 3 + 3 = 6
//
//        10 = 2 x 5 à 2 + 5 = 7
//
//        13 = 13
//
//        100 = 2 x 2 x 5 x 5 à 2+2+5+5 = 14
//
//Cộng lại, 7 + 6 + 7 + 13 + 14 = 47.

import java.util.Scanner;

public class J01013 {
    static final int MAX = 2000000;
    static int[] spf = new int[MAX + 1];

    public static void sieve() {
        for (int i = 2; i <= MAX; i++) {
            if (spf[i] == 0) {
                for (int j = i; j <= MAX; j += i) {
                    if (spf[j] == 0) {
                        spf[j] = i;
                    }
                }
            }
        }
    }

    public static long Sum(int n) {
        long sum = 0;

        while (n > 1) {
            sum += spf[n];
            n /= spf[n];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sieve();

        int t = sc.nextInt();
        long ans = 0;

        while (t-- > 0) {
            int n = sc.nextInt();
            ans += Sum(n);
        }

        System.out.println(ans);
    }
}