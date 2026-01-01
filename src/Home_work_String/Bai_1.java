package Home_work_String;

import java.util.Scanner;

public class Bai_1{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        System.out.print("Mời cụ nhập chuỗi : ");
        String s = sc.nextLine();

        str.append(s);

        char[] mang = str.toString().toCharArray();

        int count_thuong = 0 , count_hoa = 0 , count_num = 0 , count_space = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(Character.isDigit(mang[i])){
                count_num++;
            }
            else if(Character.isUpperCase(mang[i])){
                count_hoa++;
            }
            else if(Character.isLowerCase(mang[i])){
                count_thuong++;
            }
            else if(Character.isWhitespace(mang[i])){
                count_space++;
            }
        }
        System.out.println("Số lượng ký tự thường là : " + count_thuong);
        System.out.println("Số lượng ký tự in hoa là : " + count_hoa);
        System.out.println("Số lượng ký tự số là : " + count_num);
        System.out.println("Số lượng khoảng trống là : " + count_space);
    }
}