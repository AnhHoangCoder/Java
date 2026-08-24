//Tại sân bay, mọi người đang làm thủ tục để check in. Có tất cả N vị khách. Vị khách thứ i tới làm thủ tục tại thời điểm T[i] và cần D[i] thời gian để check-in xong.
//
//Các bạn hãy xác định xem thời điểm nào tất cả các vị khách làm xong thủ tục để lên máy bay?
//
//Input
//
//Dòng đầu tiên là số nguyên dương N (N ≤ 100).
//
//N dòng tiếp theo, mỗi dòng gồm 2 số nguyên cho biết thời điểm đến của vị khách thứ i và thời gian vị khách này làm xong thủ tục check in. Các giá trị này không vượt quá 106.
//
//Output
//
//In ra đáp án tìm được.
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
//        2 1
//
//
//        8 3
//
//
//        5 7
//
//
//
//        15
//
//
//
//
//
//
//
//
//Giải thích test:
//
//Vị khách đầu tiên tới lúc t = 2 và mất 1 đơn vị thời gian để check in. Vị khách thứ 2 tới lúc t = 5, và làm xong thủ tục tại thời điểm t = 12. Vị khách thứ 3 tới lúc t = 8, nhưng phải chờ tới thời điểm t = 12 để check in, hoàn thành tại thời điểm t = 15.

import java.util.Scanner;
import java.util.Arrays;

public class J02009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] guest = new int[n][2];

        for(int i = 0; i < n; i++){
            guest[i][0] = sc.nextInt();
            guest[i][1] = sc.nextInt();
        }

        Arrays.sort(guest, (a, b) -> a[0] - b[0]);
        long cur = 0;
        for(int i = 0; i < n; i++){
            long start = Math.max(cur, guest[i][0]);
            cur = start + guest[i][1];
        }

        System.out.println(cur);
    }
}
