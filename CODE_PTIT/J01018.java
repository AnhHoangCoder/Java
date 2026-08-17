//Cho số nguyên dương N. Hãy kiểm tra xem N có thỏa mãn đồng thời hai tính chất sau đây hay không?
//
//Tổng chữ số của N chia hết cho 10
//Các chữ số cạnh nhau đều khác nhau đúng 2 đơn vị
//Input
//
//Dòng đầu ghi số bộ test. Mỗi bộ test ghi trên một dòng số nguyên dương N. N có ít nhất 3 chữ số nhưng không quá 18 chữ số.
//
//Output
//
//Ghi ra YES hoặc NO tùy thuộc kết quả kiểm tra
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
//        1353
//
//
//        246864
//
//
//        123435
//
//
//
//NO
//
//
//        YES
//
//
//NO

import java.util.Scanner;

public class J01018 {
    public static boolean check1(String s){
        for(int i = 0; i < s.length() - 1; i++){
            if(Math.abs((s.charAt(i) - '0') - (s.charAt(i + 1) - '0')) != 2){
                return false;
            }
        }
        return true;
    }

    public static boolean check2(String s){
        int sum = 0;
        for(char c : s.toCharArray()){
            sum += (c - '0');
        }
        return sum % 10 == 0;
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-->0){
            String s = sc.nextLine();
            if(check1(s) && check2(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
