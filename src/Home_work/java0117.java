package Home_work;

import java.util.Scanner;

public class java0117 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int sum = Sum(n);
            while(sum > 9){ //lặp lại thao tác
                sum = Sum(sum);
            }
            System.out.println(sum);
        }
    }
    public static int Sum(int n){ //tính tổng các chữ số
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}
