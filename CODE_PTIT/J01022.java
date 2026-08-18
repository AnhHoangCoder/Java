//Người ta tạo ra một dãy xâu ký tự nhị phân X[] trong đó:
//
//X[1] = “0”
//
//X[2] = “1”
//
//X[n] = X[n-2] + X[n-1] với n>2
//
//Với phép cộng (+) là phép nối hai xâu với nhau.
//
//Cho hai số tự nhiên N và K (1<N<93; K đảm bảo trong phạm vi của xâu X[N]).
//
//Hãy xác định ký tự thứ K trong xâu X[N] là ký tự ‘0’ hay ký tự ‘1’.
//
//Input: Dòng 1 ghi số bộ test. Mỗi bộ test ghi trên một dòng 2 số nguyên N và K.
//
//        Output: Ghi ra màn hình kết quả tương ứng với từng bộ test.
//
//Ví dụ:
//
//
//Input
//
//        Output
//
//2
//
//
//        6 4
//
//
//        8 19
//
//
//
//        0
//
//
//        1

import java.util.Scanner;

public class J01022 {
    static long[] len = new long[93];

    public static char find(int n, long k){
        if(n == 1){
            return '0';
        }

        if(n == 2){
            return '1';
        }

        if (k <= len[n-2]) {
            return find(n - 2, k);
        }
        else{
            return find(n - 1, k - len[n - 2]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        len[1] = 1;
        len[2] = 1;

        for(int i = 3; i < 93; i++){
            len[i] = len[i-1] + len[i-2];
        }

        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();

            System.out.println(find(n, k));
        }
    }
}
