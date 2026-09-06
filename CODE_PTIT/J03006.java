//Một số được coi là đẹp nếu đó là số thuận nghịch và chỉ toàn các chữ số chẵn. Viết chương trình đọc vào các số nguyên dương có không quá 500 chữ số và kiếm tra xem số đó có đẹp hay không.
//
//Dữ liệu vào:
//
//Dòng đầu tiên ghi số bộ test.
//
//Mỗi bộ test viết trên một dòng số nguyên dương n không quá 500 chữ số.
//
//Kết quả:
//
//Mỗi bộ test viết ra trên một dòng chữ YES nếu đó là số đẹp, chữ NO nếu ngược lại
//
//Ví dụ
//
//
//Input
//
//        Output
//
//4
//
//
//        123456787654321
//
//
//        86442824468
//
//
//        8006000444422220000222244440006008
//
//
//        235365789787654324567856578654356786556
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
//
//
//        NO

import java.util.*;
import java.io.*;

public class J03006 {
    static BufferedReader br;

    static boolean num_beautiful(String s){
        char[] a = s.toCharArray();
        int n = a.length;
        for(int i = 0; i < n; i++){
            if((a[i] - '0') % 2 == 1){
                return false;
            }
        }

        for(int i = 0; i < n / 2; i++){
            if(a[i] != a[n - i - 1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            String s = br.readLine().trim();
            sb.append((num_beautiful(s)) ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}