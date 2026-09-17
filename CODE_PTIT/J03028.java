//Cho một xâu ký tự. Quá trình mã hóa DRM sẽ trải qua ba bước Chia (Divide), Xoay (Rotate) và Trộn (Merge). Ví dụ với xâu: EWPGAJRB  quá trình này sẽ diễn ra như sau:
//
//Devide: Xâu ban đầu được chia thành 2 nửa: “EWPG” và “AJRB”.
//Rotate: Với mỗi nửa, tính toán giá trị xoay của nó bằng cách tính tổng giá trị các ký tự. (A = 0; B = 1; … Z = 25).  Giá trị xoay của “EWPG” là 4 + 22 + 15 + 6 = 47. Tiến hành xoay xâu  “EWPG”  đi 47 ký tự (tính cả bước chuyển từ Z về A nếu cần) ta sẽ được xâu: “ZRKB”. Tương tự, “AJRB” được chuyển thành “BKSC”
//Merge: Trong bước này, mỗi ký tự trong xâu thứ nhất sẽ được xoay theo giá trị của ký tự ở vị trí tương ứng trong xâu thứ 2. Trong ví dụ trên, chữ Z trong xâu thứ nhất sẽ xoay theo giá trị B, tức là 1 vị trí. Do đó sẽ chuyển thành chữ A. Tiếp tục thực hiện với các ký tự tiếp theo ta sẽ có kết quả là “ABCD”.
//Cho một xâu ký tự chỉ bao gồm các chữ cái in hoa với số lượng ký tự là chẵn, bạn hãy tìm xâu mã hóa DRM tương ứng.
//
//Input
//
//Dòng đầu ghi số bộ test T (T≤30).
//
//Mỗi bộ test ghi trên một dòng xâu ký tự cần mã hóa, chỉ gồm các chữ cái in hoa, độ dài là chẵn và không quá 15000 ký tự.
//
//Output
//
//Với mỗi test in ra trên một dòng kết quả mã hóa DRM tương ứng.
//
//        Ví dụ
//
//
//Input	Output
//3
//
//
//EWPGAJRB
//
//
//        BB
//
//
//TPQJDRJWSQXGRRIPXFMINTELHBJA
//
//
//
//        ABCD
//
//
//E
//
//
//        FIRSTDATAFILEV

import java.util.*;
import java.io.*;

public class J03028 {
    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException {
        while(tok == null || !tok.hasMoreTokens()){
            String line = br.readLine();
            if(line == null) return "";
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    static int Sum(String s){
        int sum = 0;
        for(Character c : s.toCharArray()){
            sum += (c - 'A');
        }
        return sum;
    }

    static String Rotate(String s){
        int n = Sum(s);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int tmp = ((c - 'A') + n ) % 26;
            char ans =  (char)(tmp + 'A');
            sb.append(ans);
        }
        return sb.toString();
    }

    static String Merge(String s1, String s2){
        int n = s1.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            int num1 = c1 - 'A';
            int num2 = c2 - 'A';

            int tmp = (num1 + num2) % 26;
            char ans = (char)(tmp + 'A');
            sb.append(ans);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(getToken());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            String s = getToken();
            int mid = s.length() / 2;

            String s1 = s.substring(0, mid);
            String s2 = s.substring(mid);

            sb.append(Merge(Rotate(s1), Rotate(s2))).append("\n");
        }
        System.out.print(sb);
    }
}