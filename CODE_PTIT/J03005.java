//Theo quy tắc viết tên tiếng Anh, họ tên sẽ thường được viết lại theo dạng chuẩn trong đó phần họ được viết sau cùng, phân tách với phần tên đệm và tên bởi dấu phẩy. Các chữ cái của phần họ đều viết hoa.
//
//Cho trước các xâu họ tên (có thể không chuẩn). Hãy đưa về dạng chuẩn tương ứng.
//
//Dữ liệu vào:
//
//Dòng 1 ghi số N là xâu họ tên trong danh sách
//N dòng tiếp theo ghi lần lượt các xâu họ tên (không quá 50 ký tự)
//Kết quả: Ghi ra các xâu chuẩn.
//
//Ví dụ:
//
//
//Input
//
//        Output
//
//4
//
//
//nGUYEn    quaNG   vInH
//
//
//tRan   thi THU    huOnG
//
//
//nGO   quoC  VINH
//
//
//lE            tuAn    aNH
//
//
//
//        Quang Vinh, NGUYEN
//
//
//        Thi Thu Huong, TRAN
//
//
//        Quoc Vinh, NGO
//
//
//        Tuan Anh, LE

import java.io.*;

public class J03005 {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            String s = br.readLine().trim();
            String[] a = s.toLowerCase().split("\\s+");

            a[0] = a[0].toUpperCase();
            for(int i = 1; i < a.length; i++){
                a[i] = Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1);
            }

            for(int i = 1; i < a.length; i++){
                sb.append(a[i]);
                if(i < a.length - 1){
                    sb.append(" ");
                }
            }
            sb.append(", ").append(a[0]).append("\n");
        }
        System.out.print(sb);
    }
}