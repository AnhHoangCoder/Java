//Cho số nguyên dương N không quá 106. Bắt đầu từ số N, bạn thực hiện nhân đôi (N*2), nhân ba (N*3) và tiếp tục như vậy cho đến khi tất cả các chữ số thập phân từ 0 đến 9 đều đã xuất hiện đâu đó trong các giá trị kết quả.
//
//Hãy tìm số K nhỏ nhất sao cho khi gặp giá trị K thì tất cả các chữ số từ 0 đến 9 đều đã xuất hiện. Nếu không thể tìm được số K thì in ra Impossible
//
//Dữ liệu vào:
//
//Dòng đầu ghi số bộ test T (không quá 100)
//Mỗi test ghi duy nhất số nguyên N (1 ≤ N ≤ 106)
//Kết quả:  Ghi ra trên một dòng số K tìm được. Hoặc Impossible
//
//Ví dụ:
//
//
//Input
//
//        Output
//
//5
//
//
//        0
//
//
//        1
//
//
//        2
//
//
//        11
//
//
//        1692
//
//
//
//	      Impossible
//
//
//        10
//
//
//        90
//
//
//        110
//
//
//        5076

import java.util.Scanner;

public class J01020 {
    public static boolean full(boolean[] arr){
        for(int i = 0; i < 10; i++){
            if(!arr[i]) return false;
        }
        return true;
    }

    public static void test(long n){
        if(n == 0){
            System.out.println("Impossible");
            return;
        }

        boolean[] arr = new boolean[10];
        for(int i = 1; ; i++){
            long x = n * i;
            long temp = x;
            while(temp > 0){
                int digit = (int)(temp % 10);
                arr[digit] = true;
                temp /= 10;
            }

            if(full(arr)){
                System.out.println(x);
                return;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            test(n);
        }
    }
}
