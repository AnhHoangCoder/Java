//Cho số tự nhiên n. Nhiệm vụ của bạn là tìm số nguyên nhỏ nhất chia hết cho 1, 2, .., n.
//
//        Input:
//
//Dòng đầu tiên đưa vào T là số lượng bộ test.
//T dòng tiếp theo mỗi dòng đưa vào một bộ test. Mỗi bộ test là một số tự nhiên n.
//T thỏa mãn ràng buộc: 1≤T≤104; n không quá 100.
//Output:
//
//Đưa ra kết quả mỗi test theo từng dòng.
//Ví dụ:
//
//
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
//        5
//
//
//
//        6
//
//
//        60

import java.util.Scanner;
import java.math.BigInteger;

public class J02008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            BigInteger ans = BigInteger.ONE;

            for(int i = 2; i <= n; i++){
                BigInteger x = BigInteger.valueOf(i);
                ans = ans.divide(ans.gcd(x)).multiply(x);
            }
            System.out.println(ans);
        }
    }
}
