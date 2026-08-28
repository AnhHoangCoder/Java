//Cho một mảng a gồm n phần tử và 1 số k, bạn phải thực hiện đúng k phép biến đổi, với mỗi phép biến đổi, bạn phải chọn 1 số a[i] và thay thế nó bằng số -a[i].
//
//Hãy tìm cách thực hiện k phép biến đổi sao cho tổng các phần tử của mảng a sau khi biến đổi là lớn nhất.
//
//        Input
//
//Dòng đầu tiên là số n (1 ≤ n ≤ 105) và k (0 ≤ k ≤ 105)
//
//Dòng tiếp theo gồm n số a[1], a[2], ... a[n] ( -105 ≤ a[i] ≤ 105)
//
//Output:
//
//        1 dòng duy nhất là tổng lớn nhất của các phần tử của mảng a sau khi thực hiện phép biến đổi.
//
//Ví dụ :
//
//
//Input
//
//        Output
//
//3 1
//
//
//        4 6 2
//
//
//
//        8
//
//
//
//
//
//Giải thích :
//
//Ta sử dụng phép biến đổi với phần tử a[3] = 2.
//
//Khi đó mảng trở thành [4, 6, -2] , tổng = 8

import java.util.Arrays;
import java.util.Scanner;

public class J02033 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        StringBuilder sb = new StringBuilder(n);

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int i = 0;
        while(i < n && k > 0 && a[i] < 0){
            a[i] = -a[i];
            k--;
            i++;
        }

        long sum = 0;
        for(int x : a) sum += x;

        if(k % 2 == 1){
            int minAbs = Integer.MAX_VALUE;
            for(int x : a){
                minAbs = Math.min(minAbs, Math.abs(x));
            }

            sum -= 2L * minAbs;
        }
        sb.append(sum).append("\n");
        System.out.print(sb);
    }
}
