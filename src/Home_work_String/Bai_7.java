package Home_work_String;

import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args){
        //Chuẩn hóa chuỗi theo quy tắc :
        // 1. Không có khoảng trống dư thừa
        // 2. Các ký tự khác nhau bởi 1 khoảng trắng
        // 3. Ký tự đầu tiên của mỗi từ phải viết hoa

        //Ví dụ : input: "     mÂy đz   đẹp   TRAI vkl"
        //output: "Mây Đz Đẹp Trai Vkl"

        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhật vào chuỗi cần chuẩn hóa : ");

        String str = sc.nextLine();

        System.out.println(chuanHoa(str));
        sc.close();
    }

    public static String chuanHoa(String s){
        s = s.trim();
        String[] words = s.split("\\s+");
        for(int i = 0 ; i < words.length ; i++){
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0 , 1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" " , words);
    }
}
