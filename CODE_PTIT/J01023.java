//Cho một biểu thức trong phạm vi hai chữ số với các phép toán cộng trừ nhân chia. Các toán hạng và kết quả đảm bảo là số nguyên dương có hai chữ số, nếu có phép chia thì phải thỏa mãn tính chia hết.
//
//Người ta có thể ẩn đi một số chữ số hoặc phép toán bằng cách điền dấu chấm hỏi (?). Nhiệm vụ của bạn là khôi phục các dấu chấm hỏi và in ra phép toán chính xác ban đầu. Nếu không thể có kết quả đúng thì ghi ra WRONG PROBLEM!
//
//Dữ liệu vào
//
//Dòng đầu ghi số bộ test T (1 ≤ T ≤ 100).
//
//T dòng tiếp theo, mỗi dòng là một biểu thức có thể có các dấu ?.
//
//Dữ liệu vào đảm bảo chỉ có duy nhất một kết quả đúng hoặc không thể có kết quả đúng.
//
//Kết quả
//
//Với mỗi bộ test, ghi ra biểu thức đúng tìm được. Hoặc WRONG PROBLEM!
//
//Ví dụ
//
//
//Input
//
//        Output
//
//2
//        ?0 ? 12 = 28
//        40 / ?3 = ??
//
//
//
//
//
//
//        40 - 12 = 28
//
//
//WRONG PROBLEM!

import java.util.Scanner;

public class J01023 {
    //Kiểm tra xem số đang xét có hợp lệ ko
    static boolean match(int number, String pattern){
        String s = String.valueOf(number);

        if(s.length() != pattern.length()) return false;
        for(int i = 0; i < s.length(); i++){
            if(pattern.charAt(i) != '?' && pattern.charAt(i) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
    //Kiểm tra xem là dấu j
    static boolean matchOperator(char op, String pattern){
        return pattern.equals("?") || pattern.charAt(0) == op;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();

            String[] a = s.split(" ");

            String left = a[0];
            String right = a[2];
            String opPattern = a[1];
            String equal = a[3];
            String result = a[4];

            boolean found = false;
            for(int A = 10; A <= 99 && !found; A++){
                if(!match(A, left)){
                    continue;
                }

                for(int B = 10; B <= 99 && !found; B++){
                    if(!match(B, right)){
                        continue;
                    }

                    for(char op : new char[]{'+', '-', '*', '/'}){
                        if(!matchOperator(op, opPattern)){
                            continue;
                        }

                        int C;
                        if(op == '+'){
                            C = A + B;
                        }
                        else if(op == '-'){
                            C = A - B;
                        }
                        else if(op == '*'){
                            C = A * B;
                        }
                        else{
                            if(A % B != 0){
                                continue;
                            }

                            C = A / B;
                        }

                        if(C < 10 || C > 99){
                            continue;
                        }

                        if(!match(C, result)){
                            continue;
                        }

                        System.out.println(A + " " + op + " " + B + " " + equal + " " + C);
                        found = true;
                        break;
                    }
                }
            }
            if(!found){
                System.out.println("WRONG PROBLEM!");
            }
        }
    }
}
