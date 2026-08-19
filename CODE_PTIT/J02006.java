//Cho dãy số a[] có n phần tử và dãy số b[] có m phần tử là các số nguyên dương nhỏ hơn 1000. Gọi tập hợp A là tập các số khác nhau trong a[], tập hợp B là tập các số khác nhau trong b[].
//
//Hãy tìm hợp của A và B
//
//        Input
//
//Dòng đầu ghi 2 số n và m (1 < n,m <100).
//
//Dòng thứ 2 ghi n số của a[].
//
//Dòng thứ 3 ghi m số của b[].
//
//Các số đều dương và nhỏ hơn 1000.
//
//Output
//
//Ghi ra hợp của hai tập A và B theo thứ tự tăng dần.
//
//Ví dụ:
//
//
//Input
//
//        Output
//
//5 6
//
//
//        1 2 3 4 5
//
//
//        3 4 5 6 7 8
//
//
//
//        1 2 3 4 5 6 7 8
//


import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class J02006 {
    static void nhap(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        nhap(a, sc);
        nhap(b, sc);

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> hop = new ArrayList<>();

        int i = 0, j = 0;

        while (i < n && j < m) {
            int x;

            if (a[i] < b[j]) {
                x = a[i++];
            } else if (a[i] > b[j]) {
                x = b[j++];
            } else {
                x = a[i];
                i++;
                j++;
            }

            if (hop.isEmpty() || hop.get(hop.size() - 1) != x) {
                hop.add(x);
            }
        }

        while (i < n) {
            int x = a[i++];
            if (hop.isEmpty() || hop.get(hop.size() - 1) != x) {
                hop.add(x);
            }
        }

        while (j < m) {
            int x = b[j++];
            if (hop.isEmpty() || hop.get(hop.size() - 1) != x) {
                hop.add(x);
            }
        }

        for (int x : hop) {
            System.out.print(x + " ");
        }
    }
}