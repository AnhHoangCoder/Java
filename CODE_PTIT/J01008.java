//Hãy phân tích một số nguyên dương thành tích các thừa số nguyên tố.
//
//Dữ liệu vào: Dòng đầu tiên ghi số bộ test. Mỗi bộ test viết trên một dòng số nguyên dương n không quá 9 chữ số.
//
//Kết quả: Mỗi bộ test viết ra thứ tự bộ test, sau đó lần lượt là các số nguyên tố khác nhau có trong tích, với mỗi số viết thêm số lượng số đó. Xem ví dụ để hiểu rõ hơn về cách viết kết quả.
//
//Ví dụ
//
//
//Input
//
//        Output
//
//3
//
//
//        60
//
//
//        128
//
//
//        10000
//
//
//
//Test 1: 2(2) 3(1) 5(1)
//
//
//Test 2: 2(7)
//
//
//Test 3: 2(4) 5(4)

import java.util.Scanner;

public class J01008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();

            System.out.print("Test " + i + ": ");

            for(int j = 2; j * j <= n; j++){
                if(n % j == 0){
                    int cnt = 0;
                    while(n % j == 0){
                        cnt++;
                        n /= j;
                    }
                    System.out.print(j + "(" + cnt + ") ");
                }
            }
            if(n > 1){
                System.out.print(n + "(1)");
            }
            System.out.println();
        }
    }
}
