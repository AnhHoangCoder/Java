//Cho một số nguyên dương lớn có nhiều hơn 20 chữ số nhưng không quá 1000 chữ số. Một số nguyên dương được coi là “số ưu thế chẵn” nếu số chữ số của nó là chẵn và số chữ số chẵn nhiều hơn số chữ số lẻ.
//
//Một số nguyên dương được coi là “số ưu thế lẻ” nếu số chữ số của nó là lẻ và số chữ số lẻ nhiều hơn số chữ số chẵn.
//
//Hãy kiểm tra xem số đó có phải là số ưu thế (chẵn hoặc lẻ) hay không. Chú ý: trường hợp số lượng chữ số chẵn và số lượng chữ số lẻ bằng nhau thì không được coi là số ưu thế.
//
//Dữ liệu vào
//
//Dòng đầu ghi số bộ test, không quá 10
//Mỗi bộ test là một dãy ký tự có độ dài không quá 1000, không có khoảng trống
//Kết quả
//
//Nếu dữ liệu vào không phải là một số nguyên hợp lệ (có ký tự không phải số hoặc bắt đầu bằng chữ số 0) thì in ra INVALID
//Nếu dữ liệu vào thỏa mãn là số ưu thế thì in ra YES, nếu không in ra NO
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
//        01234aa32432432432534545b987978
//
//
//1234567890123456789000
//
//
//        999999999999999999999999999999
//
//
//
//INVALID
//
//
//        YES
//
//
//NO

import java.util.*;
import java.io.*;

public class J03024 {
    static BufferedReader br;

    static boolean checkNum(String s){
        for(Character c : s.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    static boolean dayUuThe(String s){
        int chan = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            int tmp = s.charAt(i) - '0';
            if(tmp % 2 == 0) chan++;
        }
        int le = n - chan;
//        if(chan == le){
//            return false;
//        }
        return ((chan > le) && (n % 2 == 0)) || ((le > chan) && (n % 2 == 1));
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            String s = br.readLine().trim();
            if(checkNum(s)){
               sb.append(dayUuThe(s) ? "YES" : "NO").append("\n");
            }
            else{
                sb.append("INVALID\n");
            }
        }
        System.out.print(sb);
    }
}