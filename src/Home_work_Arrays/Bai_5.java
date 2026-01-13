package Home_work_Arrays;

import java.util.Scanner;
import java.util.HashMap;

public class Bai_5 {
    public static void main(String[] args) {
        HashMap<String , String> dic = new HashMap<>();

        for(int i = 1 ; i <= 10 ; i++){
            dic.put("user" + i , "123456");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập username đăng nhập: ");
        String username = input.nextLine();

        System.out.print("Nhập password: ");
        String password = input.nextLine();

        if(dic.containsKey(username)){
            if(dic.get(username).equals(password)){
                System.out.println("Đăng nhập thành công");
            }
            else{
                System.out.println("Sai password rồi ku");
            }
        }
        else{
            System.out.println("User không tồn tại");
        }
        input.close();
    }
}
