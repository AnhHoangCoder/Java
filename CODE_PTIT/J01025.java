//Cho 2 hình chữ nhật trên mặt phẳng Oxy. Cần tìm hình vuông có kích thước nhỏ nhất sao cho phủ kín được 2 hình chữ nhật đã cho.
//
//        Input:
//
//        2 dòng, mỗi dòng gồm 4 số nguyên lần lượt mô tả điểm trái dưới và phải trên của hình chữ nhật. Các tọa độ có giá trị tuyệt đối không vượt quá 1000.
//
//Output:
//
//In ra diện tích của hình vuông tìm được.
//
//
//
//Ví dụ:
//
//
//Input
//
//        Output
//
//6 6 8 8
//
//
//        1 8 4 9
//
//
//
//
//
//
//        49

import java.util.Scanner;

public class J01025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int minX = Math.min(x1, x3);
        int maxX = Math.max(x2, x4);

        int minY = Math.min(y1, y3);
        int maxY = Math.max(y2, y4);

        int width = maxX - minX;
        int height = maxY - minY;

        int side = Math.max(width, height);
        System.out.println(side * side);
    }
}
