//Dãy số Fibonacci được định nghĩa theo công thức như sau:
//
//F1 = 1
//
//F2 = 1
//
//Fn = Fn-1 + Fn-2 với n>2
//
//Viết chương trình tính số Fibonacci thứ n (với n không quá 92)
//
//Dữ liệu vào: Dòng đầu ghi số bộ test. Mỗi bộ test là một số nguyên n.
//
//Kết quả: Với mỗi bộ test, ghi ra số Fibonacci thứ n trên một dòng.
//
//Ví dụ
//
//
//Input
//
//Output
//
//3
//
//
//        2
//
//
//        5
//
//
//        20
//
//
//
//        1
//
//
//        5
//
//
//        6765

import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        long[] f = new long[93];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= 92; i++){
            f[i] = f[i-1] + f[i-2];
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
