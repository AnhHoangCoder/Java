//Cho hai số nguyên dương a,b. Hãy đếm xem trong đoạn [a,b] có bao nhiêu số có tổng các ước số (không tính chính nó) lớn hơn giá trị của nó.
//
//Ví dụ: số 12 có tổng ước số là 1 + 2 + 3 + 4 + 6 = 16 > 12.
//
//Input
//
//Chỉ có hai số a và b (1 <= a <= b <= 106).
//
//Output
//
//Ghi ra số lượng các số thỏa mãn.
//
//Ví dụ
//
//Input
//
//        Output
//
//1 50
//
//
//        9

import java.util.Scanner;

public class J02019 {
    static long Count(int a, int b){
        int[] sumDiv = new int[b + 1];

        for(int i = 1; i <= b; i++){
            for(int j = 2 * i; j <= b; j += i){
                sumDiv[j] += i;
            }
        }

        long count = 0;
        for(int i = a; i <= b; i++){
            if(sumDiv[i] > i){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Count(a, b));
    }
}
