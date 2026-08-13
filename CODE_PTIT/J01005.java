//Cho một tam giác cân có độ dài đáy bằng 1 và chiều cao bằng H. Bạn cần chia tam giác này thành N phần có diện tích bằng nhau và song song với đáy.
//
//
//
//Hãy in ra N-1 số là khoảng cách từ lát cắt thứ i tới đỉnh của tam giác.
//
//Input:
//
//Dòng đầu tiên là số lượng bộ test T (T ≤ 100).
//
//Mỗi test gồm 2 số nguyên N và H (2 ≤ ≤ N ≤ 1000, 1 ≤ H ≤ 100 000).
//
//Output:
//
//Với mỗi test, in ra đáp án tìm được trên một dòng với 6 chữ số sau dấu phảy.
//
//
//        Input:
//
//Output
//
//2
//
//
//        3 2
//
//
//        2 100000
//
//
//
//        1.154701 1.632993
//
//
//        70710.678119
//

//S = 1/2 * H * 1
//Đặt x = khoảng cách từ đỉnh đến phần cắt thứ i, a = đáy nhỏ song song với đáy lớn Sbe = S / N = H / 2N
//tam giác đồng dạng x / H = a / 1
//Sbe = S / N = H / 2N
//Si = (i / N)S
//=> x = H * sqrt(i / N)


import java.util.Scanner;


public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int H = sc.nextInt();

            for(int i = 1; i < n; i++){
                Double x = H * Math.sqrt((double)i / n);
                System.out.printf("%.6f ", x);
            }
            System.out.println();
            t--;
        }
    }
}
