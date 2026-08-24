//Hãy thực hiện thuật toán sắp xếp chèn trên dãy N số nguyên. Ghi ra các bước thực hiện thuật toán.
//
//Dữ liệu vào: Dòng 1 ghi số N (không quá 100). Dòng 2 ghi N số nguyên dương (không quá 100).
//
//Kết quả: Ghi ra màn hình từng bước thực hiện thuật toán. Mỗi bước trên một dòng, các số trong dãy cách nhau đúng một khoảng trống.
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
//Buoc 0: 5
//
//
//Buoc 1: 5 7
//
//
//Buoc 2: 3 5 7
//
//
//Buoc 3: 2 3 5 7

import java.util.Scanner;

public class J02012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            int key = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
            sb.append("Buoc ").append(i).append(": ");
            for(int u = 0; u <= i; u++){
                sb.append(a[u]);
                if(j < n - 1){
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
