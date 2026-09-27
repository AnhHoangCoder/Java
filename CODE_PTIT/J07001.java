//Cho file văn bản DATA.in
//
//Hãy đọc toàn bộ nội dung của file và in ra màn hình theo đúng định dạng ban đầu.
//
//Ví dụ:
//
//
//DATA.in
//
//        Output
//
//Lap trinh huong doi tuong
//
//
//voi Java
//
//
//
//Lap trinh huong doi tuong
//
//
//voi Java

import java.io.*;
import java.util.*;

public class J07001 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(new File("DATA.in"))){
            StringBuilder sb = new StringBuilder();
            boolean f = true;

            while(sc.hasNextLine()){
                if(!f) sb.append("\n");
                sb.append(sc.nextLine());
                f = false;
            }
            System.out.print(sb);
        } catch(FileNotFoundException e){
            System.out.println("Ko tim thay file: " + e.getMessage());
        }
    }
}