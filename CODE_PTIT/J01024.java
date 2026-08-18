//Một số được gọi là “tam phân” nếu chỉ có các chữ số 0,1,2. Nhập vào một số nguyên dương không quá 9 chữ số, hãy kiểm tra xem đó có phải số tam phân hay không. Dòng đầu là số bộ test, mỗi dòng tiếp theo ghi một số cần kiểm tra. Nếu đúng in ra YES, nếu sai in ra NO.
//
//        Ví dụ
//
//
//Input
//
//        Output
//
//3
//
//
//        1214
//
//
//        10210221
//
//
//        22222222
//
//
//
//NO
//
//
//        YES
//
//
//YES

import java.util.Scanner;

public class J01024 {
    static boolean check(String s){
        for(char c : s.toCharArray()){
            if(c != '0' && c != '1' && c != '2'){
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
