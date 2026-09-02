//Dãy số A[] gồm N phần tử là các số nguyên và đã được sắp xếp tăng dần. Các phần tử của dãy A[] có thể giống nhau. Sau đó ta thực hiện quay vòng phải, mỗi lần lấy một số ở cuối dãy đưa lên đầu dãy.
//
//Cho trạng thái dãy số của A[] sau khi đã thực hiện quay vòng K lần. Hãy tìm K.
//
//        Input:
//
//Dòng đầu tiên đưa vào số lượng bộ test T.
//Những dòng kế tiếp đưa vào các bộ test. Mỗi bộ test gồm 2 dòng: dòng thứ nhất đưa vào số N; dòng tiếp theo đưa vào N số của mảng A[]các số được viết cách nhau một vài khoảng trống.
//T, N, A[i] thỏa mãn ràng buộc: 1≤T≤100;  1≤ N≤107; 0≤ A[i]≤1018.
//Output:
//
//Đưa ra số lần quay vòng K của mỗi test theo từng dòng.
//Ví dụ:
//
//Input	Output
//2
//        5
//        5 1 2 3 4
//        5
//        1 2 3 4 5
//        1
//        0
//

import java.util.Scanner;
import java.util.Arrays;

public class J02035 {
    static int Count_right(long[] a, int n){
        long[] sorted = a.clone();
        Arrays.sort(sorted);

        long[] tmp = a.clone();
        int count = 0;

        while(!Arrays.equals(tmp, sorted)){
            long first = tmp[0];

            for(int i = 0; i < n - 1; i++){
                tmp[i] = tmp[i + 1];
            }

            tmp[n - 1] = first;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
           int n = sc.nextInt();
           long[] a = new long[n];
           for(int i = 0; i < n; i++){
               a[i] = sc.nextLong();
           }

           System.out.println(Count_right(a, n));
       }
    }
}
