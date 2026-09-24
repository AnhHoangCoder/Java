//Viết chương trình khai báo lớp Rectange với các thuộc tính và phương thức như sau:
//
//Rectange
//
//- width: double
//
//Chiều rộng hình chữ nhật
//
//- height: double
//
//Chiều dài hình chữ nhật
//
//- color: String
//
//Màu hình chữ nhật
//
//+ Rectange()
//
//Tạo HCN có c.dài = 1, c.rộng = 1
//
//        + Rectange(width: double,
//
//
//                   height: double, color: String)
//
//Tạo HCN có c.dài, c.rộng xác định qua tham số
//
//+ getWidth() :double
//
//Trả về chiều rộng
//
//+ setWidth(width:double): void
//
//Thiết lập chiều rộng mới
//
//+ getHeight(): double
//
//Trả về chiều dài
//
//+ setHeight(height:double): void
//
//Thiết lập chiều dài mới
//
//+ getColor(): String
//
//Trả về màu của HCN
//
//+ setColor(color): void
//
//Thiết lập màu mới cho HCN
//
//+ findArea(): double
//
//Tính và trả về diện tích HCN
//
//+ findPerimeter(): double
//
//Tính và trả về chu vi HCN
//
//Viết chương trình nhập vào giá trị độ dài hai cạnh của hình chữ nhật và màu sắc. In ra thông tin về chu vi, diện tích và màu sắc (đã đưa về dạng chuẩn trong đó ký tự đầu viết hoa, các ký tự sau viết thường) của hình chữ nhật đó.
//
//Input
//
//Gồm 2 số nguyên là độ dài 2 cạnh hình chữ nhật và một xâu ký tự (không có khoảng trống) mô tả màu sắc.
//
//Output
//
//Nếu hình chữ nhật là hợp lệ (các cạnh đều nguyên dương) thì in ra 3 thông tin: chu vi, diện tích, màu sắc, mỗi thông tin cách nhau một khoảng trống.
//
//Nếu dữ liệu không hợp lệ in ra INVALID
//
//Ví dụ
//
//Input
//
//        Output
//
//10 2 RED
//
//
//24 20 Red

import java.util.*;
import java.io.*;

public class J04002 {
    public static class Rectange{
        private double width, height;
        private String color;
        public Rectange(){
            width = 1;
            height = 1;
        }
        public Rectange(int width, int height, String color){
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public double getWidth(){
            return width;
        }

        public void setWidth(double width){
           this.width = width;
        }

        public double getHeight(){
            return height;
        }

        public void setHeight(double height){
            this.height = height;
        }

        public String getColor(){
            return color;
        }

        public void setColor(String color){
            color = color.toLowerCase();
            this.color = color.substring(0, 1).toUpperCase() + color.substring(1);
        }

        public double findArea(){
            return this.width * this.height;
        }

        public double findPerimeter(){
            return (this.width + this.height) * 2;
        }
    }

    static BufferedReader br;
    static StringTokenizer tok;

    static String getToken() throws IOException{
        while(tok == null || !tok.hasMoreTokens()){
            String line = br.readLine();
            if(line == null) return "";
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int a = Integer.parseInt(getToken());
            int b = Integer.parseInt(getToken());
            String C = getToken();

            if(a <= 0 || b <= 0 || C.isEmpty()) throw new Exception();
            StringBuilder sb = new StringBuilder();
            Rectange A = new Rectange(a, b, C);
            A.setColor(C);

            sb.append((int)A.findPerimeter()).append(" ");
            sb.append((int)A.findArea()).append(" ");
            sb.append(A.getColor()).append("\n");
            System.out.print(sb);
        } catch (Exception e){
            System.out.println("INVALID");
        }
    }
}