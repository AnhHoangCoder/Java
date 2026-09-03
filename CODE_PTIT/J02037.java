//Cho dãy A[] chỉ bao gồm các số nguyên dương không quá 105 nhưng không biết trước số phần tử của dãy. Người ta gọi dãy A[] là dãy ưu thế nếu thỏa mãn 1 trong 2 điều kiện sau đây:
//
//Dãy gọi là ưu thế chẵn nếu số phần tử của dãy là chẵn và số lượng số chẵn trong dãy nhiều hơn số lượng số lẻ.
//Dãy gọi là ưu thế lẻ nếu số phần tử của dãy là lẻ và số lượng số lẻ trong dãy nhiều hơn số lượng số chẵn.
//Hãy kiểm tra xem dãy A[] có phải là dãy ưu thế hay không.
//
//Input:
//
//Dòng đầu ghi số bộ test, không quá 10
//Mỗi bộ test là một dãy các số nguyên dương (không quá 104) và có không quá 200 số, các số cách nhau 1 khoảng trống, không biết trước số lượng phần tử.
//Output:
//
//Nếu dãy A[] thỏa mãn là dãy ưu thế thì in ra YES, nếu không in ra NO
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
//        11 22 33 44 55 66 77
//
//
//        23 34 45 56 67 78 89 90 121 131 141 151 161 171
//
//
//
//YES
//
//
//        NO
//

import java.util.Scanner;

public class J02037 {
    static boolean check_uu_the(int[] a){
        int n = a.length;
        boolean check = false;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                count++;
            }
        }
        return (n % 2 == 0 && count > n - count) || (n % 2 == 1 && n - count > count);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String[] s = sc.nextLine().trim().split("\\s+");

            int[] a = new int[s.length];
            for(int i = 0; i < a.length; i++){
                a[i] = Integer.parseInt(s[i]);
            }

            System.out.println((check_uu_the(a) ? "YES" : "NO"));
        }
    }
}
