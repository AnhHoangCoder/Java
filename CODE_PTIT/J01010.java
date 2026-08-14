//Với một vài số nguyên dương có 1 chữ số, khi cắt đôi số đó theo chiều ngang và lấy nửa phía trên thì ta vẫn có một số nguyên. Cụ thể:
//
//Số 0 cắt đôi vẫn ra số 0
//Số 1 cắt đôi vẫn ra số 1
//Số 8 cắt đôi ra số 0
//Số 9 cắt đôi ra số 0
//Các số khác cắt đôi sẽ không hợp lệ.
//Cho một số nguyên dương không quá 18 chữ số. Hãy in ra kết quả “cắt đôi” của số đó.
//
//Nếu không hợp lệ thì ghi ra INVALID. Chú ý: nếu cắt đôi ra một dãy toàn 0 thì cũng được coi là không hợp lệ. Kết quả cắt đôi thì không tính chữ số 0 ở đầu.
//
//Input
//
//Dòng đầu ghi số bộ test. Mỗi bộ test ghi một số nguyên dương không quá 18 chữ số.
//
//Output
//
//Ghi ra kết quả tính toán
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
//        1890
//
//
//        3681
//
//
//        8919
//
//
//
//        1000
//
//
//INVALID
//
//
//10

import java.util.Scanner;

public class J01010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String n = sc.next();

            StringBuilder ans = new StringBuilder();
            boolean valid = true;

            for(char c : n.toCharArray()){
                if(c == '0' || c == '1') {
                    ans.append(c);
                }
                else if(c == '8' || c == '9'){
                    ans.append('0');
                }
                else{
                    valid = false;
                    break;
                }
            }

            if(!valid){
                System.out.println("INVALID");
                continue;
            }

            int i = 0;
            while(i < ans.length() && ans.charAt(i) == '0'){
                i++;
            }
            if(i == ans.length()){
                System.out.println("INVALID");
            }
            else{
                System.out.println(ans.substring(i));
            }
        }
    }
}
