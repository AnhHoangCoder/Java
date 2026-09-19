//Một câu trong văn bản được hiểu là dãy ký tự (có cả khoảng trống) cho đến khi gặp dấu ngắt câu hoặc xuống dòng (tức là đôi khi người ta quên viết dấu ngắt câu nhưng cứ xuống dòng là sang một câu mới). Các dấu ngắt câu trong bài toán này bao gồm: dấu chấm (.), dấu chấm cảm (!), dấu chấm hỏi (?).
//
//Hãy viết chương trình chuẩn hóa các câu trong dữ liệu vào với các yêu cầu sau:
//
//Ký tự đầu mỗi câu viết hoa, các ký tự khác viết thường.
//Các từ cách nhau đúng một khoảng trống.
//Tự động điền thêm dấu chấm (.) nếu xuống dòng mà chưa có dấu ngắt câu.
//Dấu ngắt câu phải viết sát ký tự cuối cùng của câu (không tính khoảng trống)
//Input
//
//Một văn bản không quá 100 dòng.
//
//        Output
//
//Ghi ra các câu đã chuẩn hóa, mỗi câu 1 dòng.
//
//        Ví dụ
//
//
//Input
//
//Chuong trinh Dao Tao CLC nganh CNTT duoc Thiet     Ke theo chuan quoc te.
//
//
//co 03 chuyen nganh la: Cong  nghe phan mem, Tri tue nhan tao va An toan thong tin
//
//
//muc tieu cua chuong trinh la trang bi cho sinh vien cac ky nang nghe nghiep
//
//
//moi    CAC BAN danG ky     thaM giA !
//
//
//
//
//Output
//
//
//
//Chuong trinh dao tao clc nganh cntt duoc thiet ke theo chuan quoc te.
//
//
//Co 03 chuyen nganh la: cong  nghe phan mem, tri tue nhan tao va an toan thong tin.
//
//
//Muc tieu cua chuong trinh la trang bi cho sinh vien cac ky nang nghe nghiep.
//
//
//Moi cac ban dang ky tham gia!

import java.util.*;
import java.io.*;

public class J03029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringBuilder out = new StringBuilder();

        String line;
        while((line = br.readLine()) != null){
            for(int i = 0; i < line.length(); i++){
                char c = line.charAt(i);
                sb.append(c);
                if(c == '.' || c == '?' || c == '!'){
                    emit(sb, out);
                    sb.setLength(0);
                }
            }
            if(!sb.toString().trim().isEmpty()){
                emit(sb, out);
            }
            sb.setLength(0);
        }
        System.out.print(out);
    }

    static void emit(StringBuilder sb, StringBuilder out){
        String s = sb.toString().trim();
        if(s.isEmpty()) return;

        char last = s.charAt(s.length() - 1);
        String core;
        char punct;

        if (last == '.' || last == '!' || last == '?'){
            core = s.substring(0, s.length() - 1);
            punct = last;
        }
        else{
            core = s;
            punct = '.';
        }

        core = core.replaceAll("\\s+", " ").trim();
        core = core.toLowerCase();

        if(!core.isEmpty()){
            core = Character.toUpperCase(core.charAt(0)) + core.substring(1);
        }

        out.append(core).append(punct).append("\n");
    }
}