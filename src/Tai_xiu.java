import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Tai_xiu{
    public static void main(String[] args){
        System.out.println("Chào mừng đến với tài xỉu , nơi đây giúp bạn xả stress!");
        System.out.print("Hãy nhập tên của bạn : ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = chuan_hoa(name);
        while(true) {
            int sum = 0;
            ArrayList<Integer> lst = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                Random rand = new Random();
                int num = rand.nextInt(1, 7);
                lst.add(num);
                sum += num;

                System.out.println("Số chấm xuất hiện ở lần thứ " + i + " là : " + num);
            }

            boolean check = true;
            for (int i = 1; i < lst.size(); i++) {
                if (lst.get(i) != lst.get(0)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Non lắm e , ra tam hoa " + lst.get(0) + " rồi :))");
            } else {
                if (sum > 10) {
                    System.out.println("Chúc mừng ku " + name + " đã ra TÀI nhé , chưa Tày đâu ;))");
                } else {
                    System.out.println("Chúc mừng ku " + name + " đã ra XỈU nhé ;))");
                }
            }

            System.out.println("Có muốn chơi nữa không?");
            System.out.println("Yes/No");

            String tmp = sc.nextLine();
            if (tmp.equals("No") || tmp.equals("no")) {
                break;
            }
        }
    }
    public static String chuan_hoa(String name){
        name = name.trim().toLowerCase();
        String[] words = name.split("\\s+");

        StringBuilder res = new StringBuilder();
        for(String w : words){
            res.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
}