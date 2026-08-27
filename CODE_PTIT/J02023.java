//Cho hai số nguyên dương N và S. Hãy lựa chọn các chữ số phù hợp để tạo ra số nhỏ nhất và số lớn nhất có N chữ số sao cho tổng chữ số đúng bằng S.
//
//Input
//
//Chỉ có một dòng ghi hai số N và S. (0 < N <= 100; 0 <= S <= 900)
//
//Output
//
//Ghi ra hai số nhỏ nhất và lớn nhất tìm được, cách nhau một khoảng trống.
//
//Nếu không thể tìm được thì ghi ra “-1 -1”
//
//Ví dụ
//
//Input
//
//        Output
//
//3 20
//
//
//        299 992
//
//
//        2 900
//
//
//        -1 -1
//
//
//        3 0
//
//
//        -1 -1

import java.util.Scanner;

public class J02023 {
    static int n;
    static int[] a;
    static StringBuilder sb = new StringBuilder();
    static boolean check;

    static void num_max(int pos, int s){
        if(pos == n){
            if(s == 0){
                for(int i = 0; i < n; i++){
                    sb.append(a[i]);
                }
                sb.append("\n");
            }
            return;
        }

        if(s > 9){
            a[pos] = 9;
            num_max(pos+1, s - 9);
        }
        else{
            a[pos] = s;
            num_max(pos+1, 0);
        }
    }

    static void num_min(int pos, int s){
        if(check) return;

        if(pos == n){
            if(s == 0){
                for(int i = 0; i < n; i++){
                    sb.append(a[i]);
                }
                sb.append(" ");
                check = true;
            }
            return;
        }

        int start = (pos == 0 && n > 1) ? 1 : 0;
        for(int i = start; i <= 9; i++){
            int remain = s - i;
            int slotsright = n - pos - 1;
            if(remain < 0) continue;
            if(remain > 9 * slotsright){
                continue;
            }
            a[pos] = i;
            num_min(pos + 1, remain);
            if(check) return;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int s = sc.nextInt();

        a = new int[n];

        check = false;
        num_min(0, s);

        num_max(0, s);

        if(!check){
            System.out.println("-1 -1");
            return;
        }
        System.out.println(sb);
    }
}
