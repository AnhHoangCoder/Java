//Hãy thực hiện thuật toán sắp xếp đổi chỗ trực tiếp trên dãy N số nguyên. Ghi ra các bước thực hiện thuật toán. Dữ liệu vào: Dòng 1 ghi số N (không quá 100). Dòng 2 ghi N số nguyên dương (không quá 100). Kết quả: Ghi ra màn hình từng bước thực hiện thuật toán. Mỗi bước trên một dòng, các số trong dãy cách nhau đúng một khoảng trống.
//
//Ví dụ:
//
//
//Input
//
//        Output
//
//4
//
//
//        5 7 3 2
//
//
//
//Buoc 1: 2 7 5 3
//
//
//Buoc 2: 2 3 7 5
//
//
//Buoc 3: 2 3 5 7
//

import java.util.Scanner;

public class J02010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] > a[j]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }

            sb.append("Buoc ").append(i + 1).append(": ");
            for(int j = 0; j < n; j++){
                sb.append(a[j]);
                if(j < n - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
