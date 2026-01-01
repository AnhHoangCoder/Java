package Home_work_String;

public class Bai_2{
    public static void main(String[] argc){
        String strl = "English = 78 Science = 83 Math = 68 History = 65";

        String[] mang = strl.split("[= ]+");
        int sum = 0;
        int count = 0;
        for(int i = 0 ; i < mang.length ; i++){
            if(!Character.isDigit(mang[i].charAt(0))){
                continue;
            }
            count++;
            int num = Integer.parseInt(mang[i]);
            sum += num;
        }

        System.out.println("Tổng các số trong chuỗi trên: " + sum);
        System.out.println("Trung bình cộng: " + (double)(sum / count));
    }
}