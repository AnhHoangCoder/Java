//Nhập một dãy số nguyên có n phần tử (n không quá 100, các phần tử trong dãy không quá 109). Hãy viết chương trình kiểm tra xem dãy có phải đối xứng hay không. Nếu đúng in ra YES, nếu sai in ra NO.
//
//Dữ liệu vào: Dòng đầu ghi số bộ test, mỗi bộ test gồm hai dòng. Dòng đầu là số phần tử của dãy, dòng sau ghi ra dãy đó, mỗi số cách nhau một khoảng trống.
//
//Kết quả: In ra kết quả kiểm tra.
//
//
//Input
//
//        Ouput
//
//2
//
//
//        4
//
//
//        1 4 4 1
//
//
//        5
//
//
//        1 5 5 5 3
//
//
//
//YES
//
//
//        NO

import java.util.Scanner;

public class J02004 {
    static boolean check(int[] a, int n){
        for(int i = 0; i < n/2; i++){
            if(a[i] != a[n - i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            if(check(a, n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
