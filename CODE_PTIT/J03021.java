//Một thời không quá xa, điện thoại di động với chỉ các tính năng nghe, gọi, nhắn tin vẫn còn chiếm đại đa số thiết bị cầm tay tại Việt Nam. Khi nhắn tin, người nhắn sẽ bấm các phím số một đến bốn lần liên tiếp tương ứng với ký tự đi kèm ghi trên đó.
//
//Cụ thể: các số và chữ cái tương ứng gồm:
//
//        2: ABC, 3: DEF, 4: GHI, 5: JKL
//
//6: MNO, 7: PQRS, 8: TUV, 9: WXYZ
//
//Cho trước dãy ký tự mô tả tin nhắn (không tính các ký tự khác ngoài danh sách nêu trên). Hãy kiểm tra xem dãy số được nhấn ứng với dãy ký tự đó có phải số thuận nghịch hay không (chỉ xét tương ứng giữa số và ký tự, không tính số đó được nhấn bao nhiêu lần, ví dụ tất cả A,B,C,a,b,c đều chỉ là một chữ số 2).
//
//Input
//
//Dòng đầu tiên là số bộ test, không quá 1000.
//
//Mỗi test là dãy ký tự mô tả tin nhắn.
//
//Output
//
//Ghi ra kết quả kiểm tra, YES nếu dãy số là thuận nghịch, NO nếu ngược lại.
//
//        Ví dụ
//
//
//Input
//
//        Output
//
//2
//
//
//BOHIMA
//
//
//        IamACoder
//
//
//
//YES
//
//
//        NO

import java.io.*;
import java.util.*;

public class J03021 {
    static BufferedReader br;
    static StringTokenizer tok;

    static String next() throws IOException {
        while(tok == null || !tok.hasMoreTokens()){
            tok = new StringTokenizer(br.readLine());
        }
        return tok.nextToken();
    }

    static boolean isPalindrome(String s){
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(next());
        String res = "22233344455566677778889999";
        StringBuilder sb = new StringBuilder();

        while(t-- > 0){
            String s = next().trim().toUpperCase();
            char[] arr = s.toCharArray();

            StringBuilder ans = new StringBuilder();
            for(int i = 0; i < arr.length; i++){
                arr[i] -= 'A';
                ans.append(res.charAt(arr[i]));
            }
            sb.append((isPalindrome(ans.toString()) ? "YES" : "NO")).append("\n");
        }
        System.out.print(sb);
    }
}