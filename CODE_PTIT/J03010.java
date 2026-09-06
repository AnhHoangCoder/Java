//Địa chỉ email của các cán bộ, giảng viên PTIT được tạo ra bằng cách viết đầy đủ tên và ghép với các chữ cái đầu của họ và tên đệm. Nếu có nhiều người cùng email thì từ người thứ 2 sẽ thêm số thứ tự vào email đó.
//
//Cho trước các xâu họ tên (có thể không chuẩn). Hãy tạo ra các địa email tương ứng.
//
//Dữ liệu vào:
//
//Dòng 1 ghi số N là xâu họ tên trong danh sách
//N dòng tiếp theo ghi lần lượt các xâu họ tên (không quá 50 ký tự)
//Kết quả: Ghi ra các email được tạo ra.
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
//vinhnq@ptit.edu.vn
//
//
//huongttt@ptit.edu.vn
//
//
//vinhnq2@ptit.edu.vn
//
//
//anhlt@ptit.edu.vn

import java.io.*;
import java.util.*;

public class J03010 {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> count = new HashMap<>();

        while(t-->0){
            String[] a = br.readLine().trim().toLowerCase().split("\\s+");

            int n = a.length;
            StringBuilder ans = new StringBuilder();
            for(int i = 0; i < n - 1; i++){
                ans.append(a[i].charAt(0));
            }
            String base = a[n - 1] + ans;

            int c = count.getOrDefault(base, 0) + 1;
            count.put(base, c);

            String email = base + (c > 1 ? String.valueOf(c) : "") + "@ptit.edu.vn";
            sb.append(email).append("\n");
        }
        System.out.print(sb);
    }
}