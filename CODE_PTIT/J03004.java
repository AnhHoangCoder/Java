//Một xâu họ tên được coi là viết chuẩn nếu chữ cái đầu tiên mỗi từ được viết hoa, các chữ
//cái khác viết thường. Các từ cách nhau đúng một dấu cách và không có khoảng trống
//thừa ở đầu và cuối xâu. Hãy viết chương trình đưa các xâu họ tên về dạng chuẩn.
//Dữ liệu vào: Dòng 1 ghi số bộ test. Mỗi bộ test ghi trên một dòng xâu ký tự họ tên, không quá
//80 ký tự.
//Kết quả: Với mỗi bộ test ghi ra xâu ký tự họ tên đã chuẩn hóa.
//Ví dụ:
//
//Input
//
//        Output
//
//3
//nGuYEN    vAN    naM
//tRan           TRUNG hiEU
//vO le         hOA bINh
//
//
//Nguyen Van Nam
//Tran Trung Hieu
//Vo Le Hoa Binh

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J03004 {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder res = new StringBuilder();

        while(t-->0){
            String s = br.readLine().trim();
            String[] a = s.toLowerCase().split("\\s+");

            for(int i = 0; i < a.length; i++){
                a[i] = Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1);
            }

            for(int i = 0; i < a.length; i++){
                res.append(a[i]);
                if(i < a.length - 1){
                    res.append(" ");
                }
            }
            res.append("\n");
        }
        System.out.print(res);
    }
}