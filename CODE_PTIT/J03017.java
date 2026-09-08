//Cho xâu ký tự S chỉ bao gồm các ký tự ‘0’ và ‘1’. Nhiệm vụ của bạn là loại bỏ các xâu con “100” trong S và đưa ra độ dài lớn nhất xâu con bị loại bỏ. Ví dụ S =” 1011110000” ta nhận được kết quả là 6 vì ta cần loại bỏ xâu “110000” có độ dài 6.
//
//Input:
//
//Dòng đầu tiên đưa vào số lượng bộ test T.
//Những dòng kế tiếp đưa vào T bộ test. Mỗi bộ test là một xâu ký tự nhị phân S được viết trên một dòng.
//T, S thỏa mãn ràng buộc: 1≤ T ≤100; 1≤ Length(S)≤105.
//Output:
//
//Đưa ra kết quả mỗi test theo từng dòng.
//Ví dụ:
//
//
//
//Input:
//
//Output:
//
//        2
//        010010
//        1011110000
//
//
//        3
//        6

import java.util.*;
import java.io.*;

public class J03017 {
    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException {
        while(tok == null || !tok.hasMoreTokens()){
            tok = new StringTokenizer(br.readLine());
        }
        return tok.nextToken();
    }

    static int solve(String a){
        int n = a.length();
        char[] stkChar = new char[n];
        int[] stkGap = new int[n];
        int top = 0;
        int pendingGap = 0;
        int answer = 0;
        for(int i = 0; i < n; i++){
            char c =  a.charAt(i);
            stkChar[top] = c;
            stkGap[top] = pendingGap;
            top++;
            pendingGap = 0;

            while(top >= 3  && stkChar[top - 3] == '1'
                            && stkChar[top - 2] == '0'
                            && stkChar[top - 1] == '0'){
                int total = stkGap[top - 3] + stkGap[top - 2] + stkGap[top - 1] + 3;
                if(total > answer){
                    answer = total;
                }
                top -= 3;
                pendingGap = total;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(getToken());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            String s = getToken();

            sb.append(solve(s)).append("\n");
        }
        System.out.print(sb);
    }
}