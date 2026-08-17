//Cho số nguyên dương N có không quá 18 chữ số. Hãy đếm xem số chữ số 4 cộng với số chữ số 7 trong N có phải bằng 4 hay bằng 7 hay không.
//
//Input
//
//Chỉ có số N
//
//Output
//
//Ghi ra YES hoặc NO tùy thuộc kết quả kiểm tra
//
//Ví dụ
//
//Input
//
//        Output
//
//40047
//
//
//NO
//
//
//7747774
//
//
//YES
//
//
//1000000000000000000
//
//
//NO

import java.util.Scanner;

public class J01016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        int num4 = 0, num7 = 0;
        for (char c : str1.toCharArray()){
            if(c == '4'){
                num4++;
            }
            else if(c == '7'){
                num7++;
            }
        }
        int ans = num4 + num7;
        if(ans == 4 || ans == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
