//Viết chương trình kiểm tra số nguyên dương N có thỏa mãn tính chất: tất cả các chữ số cạnh nhau chỉ sai khác nhau đúng một đơn vị hay không. Ví dụ: số 123212 là số thỏa mãn, số 34578 không thỏa mãn.
//
//        Input
//
//Dòng đầu ghi số số test (không quá 20). Mỗi test là 1 số nguyên dương N có ít nhất 2 chữ số, nhưng không quá 18 chữ số.
//
//Output
//
//Ghi ra YES hoặc NO
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
//        123212
//
//
//        5654345676
//
//
//        10233211123
//
//
//
//YES
//
//
//        YES
//
//
//NO

import java.util.Scanner;

public class J01017 {
    public static boolean check(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
