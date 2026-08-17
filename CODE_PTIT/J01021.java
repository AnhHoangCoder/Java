//Cho hai số nguyên không âm a và b. Hãy tính ab.
//
//Nếu kết quả quá lớn hãy chia dư cho 109 + 7.
//
//Input
//
//Gồm không quá 20 bộ test, mỗi test ghi trên một dòng hai số a,b; a không quá 9 chữ số, b không quá 18 chữ số.
//
//Input kết thúc khi a = b = 0
//
//Output
//
//Với mỗi test ghi ra kết quả tính được trên một dòng.
//
//Ví dụ
//
//
//Input
//
//        Output
//
//2 3
//
//
//        2 4
//
//
//        3 2
//
//
//        0 0
//
//
//
//        8
//
//
//        16
//
//
//        9

import java.util.Scanner;

public class J01021 {
    public static long power(long a, long b , long mod){
        if(b == 0) return 1;
        long half = power(a, b/2, mod);
        long result = (half * half) % mod;
        if(b % 2 == 1){
            result = result * a % mod;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        long mod = (long)(1e9+7);
        int t = 20;
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0){
                break;
            }

            System.out.println(power(a,b,mod));
        }
    }
}
