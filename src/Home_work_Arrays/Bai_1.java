package Home_work_Arrays;

import java.util.Arrays;

public class Bai_1{
    public static void main(String[] args){

        int[] mang1 = {21 , 10 , 3 , 9 , 5};
        //sắp xếp mảng nguyên
        Arrays.sort(mang1);
        //xuất mảng sau sx
        System.out.println("Mnagr sau sắp xếp là : ");
        System.out.println(Arrays.toString(mang1));

        int[] mang2 = {8 , 9 , 12 , 48 , 1 , 2 , 3};
        for(int i = 0 , j = mang2.length - 1 ; i < j ; i++ , j--){
            int tmp = mang2[i];
            mang2[i] = mang2[j];
            mang2[j] = tmp;
        }
        System.out.println("Mảng sau đảo chiều sẽ là : ");
        System.out.println(Arrays.toString(mang2));
    }
}
