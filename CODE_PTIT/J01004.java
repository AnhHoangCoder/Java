//
//Viết chương trình kiểm tra một số nguyên dương có phải số nguyên tố hay không. Dòng đầu của dữ liệu vào ghi số bộ test. Mỗi dòng tiếp theo có một nguyên dương không quá 9 chữ số. Kết quả in ra YES nếu đó là số nguyên tố, in ra NO nếu ngược lại.
//
//
//
//
//Input
//
//        Output
//
//3
//
//
//        123456
//
//
//        997
//
//
//        111111111
//
//
//
//NO
//
//
//        YES
//
//
//NO

import java.util.Scanner;

public class J01004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            System.out.println(prime(n) ? "YES" : "NO");
            t--;
        }
    }
    public static boolean prime(int n){
        if(n <= 1) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i * i <= n; i += 6){
            if(n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
