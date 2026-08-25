//Cho dãy số A[] chỉ bao gồm các số nguyên dương. Người ta thu gọn dần dãy số bằng cách loại bỏ các cặp phần tử kề nhau mà có tổng là chẵn. Sau khi cặp phần tử đó bị loại ra thì dãy số được dồn lại. Cứ tiếp tục như vậy cho đến khi không còn cặp phần tử nào kề nhau có tổng chẵn nữa.
//
//Hãy tính xem cuối cùng dãy A[] còn bao nhiêu phần tử.
//
//Input
//
//Dòng đâu ghi số N là số phần tử của dãy (1 ≤ N ≤ 105 tức là dãy A có thể có đến 10 nghìn phần tử).
//
//Dòng tiếp theo ghi N số của dãy A (1 ≤ A[i] ≤ 100).
//
//Output
//
//Ghi ra trên một dòng số phần tử còn lại trong dãy A[].
//
//Ví dụ
//
//
//Input
//
//        Output
//
//5
//
//
//        2 3 4 5 6
//
//
//
//        5
//
//
//
//
//Input
//
//
//
//        Output
//
//
//
//10
//
//
//        1 5 5 8 6 4 3 5 9 3
//
//
//
//        2

import java.util.Scanner;

public class J02017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int[] stack = new int[n];
        int top = -1;
        for(int i = 0; i < n; i++){
            if(top >= 0 && ((stack[top] + a[i]) % 2 == 0)){
                top--;
            }
            else{
                stack[++top] = a[i];
            }
        }
        System.out.println(top + 1);
    }
}
