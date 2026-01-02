package Home_work_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Bai_4{
    public static void main(String[] args){
        ArrayList<Integer> lst = new ArrayList<>(List.of(1,9,3,14,5,27,8));
        ArrayList<Integer> lst2 = new ArrayList<>(lst);
        Collections.sort(lst2);
        int num_max_2 = lst2.get(lst2.size() - 2);
        int num_min_2 = lst2.get(1);

        int idx_max = lst.indexOf(num_max_2);
        int idx_min = lst.indexOf(num_min_2);

        System.out.println("Số lớn thứ 2: " + num_max_2);
        System.out.println("Số nhỏ thứ 2: " + num_min_2);
        System.out.println("Vị trí index của số lớn thứ 2: " + idx_max);
        System.out.println("Vị trí index của số nhỏ thứ 2: " + idx_min);
    }
}