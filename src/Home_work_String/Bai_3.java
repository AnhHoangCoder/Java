package Home_work_String;

import java.util.Scanner;

public class Bai_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 0;
        boolean check = false;
        System.out.println("Nhập sai quá 5 lần thì sẽ khóa đăng nhập , thoát chương trình");
        while(true){
            System.out.print("Hãy nhập mật khẩu của bạn : ");
            String s = sc.nextLine();
            char[] mang = s.toCharArray();

            if(mang.length < 6){
                System.out.println("Sai mật khẩu , vui lòng thử lại!");
                count++;
                continue;
            }
            int count_num = 0 , count_word = 0;
            for(int i = 0 ; i < mang.length ; i++){
                if(Character.isDigit(mang[i])){
                    count_num++;
                }
                else if(Character.isLetter(mang[i])){
                    count_word++;
                }
            }
            if(!(count_num >= 1 && count_word >= 1)){
                count++;
                System.out.println("Sai mật khẩu , vui lòng thử lại!");
            }
            else{
                check = true;
                System.out.println("Đăng nhập thành công!");
            }
            System.out.println("Bạn đã nhập sai " + count + " lần");
            if(count > 5 || check == true){
                break;
            }
        }
    }
}