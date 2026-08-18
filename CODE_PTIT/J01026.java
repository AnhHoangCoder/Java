//Nhập một số nguyên dương không quá 9 chữ số. Hãy kiểm tra xem đó có phải số chính phương hay không.
//
//Dòng đầu của dữ liệu vào ghi số bộ test, mỗi bộ test là một số nguyên dương ghi trên một dòng.
//
//Kết quả: ghi ra YES nếu đúng và NO nếu không.
//
//Ví dụ:
//
//
//Input
//
//        Output
//
//3
//
//
//        11
//
//
//        121
//
//
//        361
//
//
//
//NO
//
//
//        YES
//
//
//YES

import java.util.Scanner;

public class J01026 {
    static boolean check(int n){
        if(n == 1) return true;
        int a = (int)Math.sqrt(n);
        return a * a == n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(check(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
