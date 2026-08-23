//Cho dãy số A có n phần tử chỉ bao gồm các số nguyên dương (không quá 105). Hãy đếm xem mỗi số xuất hiện bao nhiêu lần.
//
//Dữ liệu vào: Dòng đầu tiên ghi số bộ test. Với mỗi bộ test: dòng đầu ghi số n (không quá 100); dòng tiếp theo ghi n số của dãy.
//
//Kết quả: Với mỗi bộ test ghi ra thứ tự bộ test, sau đó lần lượt là các số nguyên tố trong dãy theo thứ tự xuất hiện trong dãy và số lần xuất hiện của nó.
//
//
//
//
//Input
//
//        Output
//
//1
//
//
//        10
//
//
//        1 7 2 8 3 3 2 1 3 2
//
//
//
//Test 1:
//
//
//        1 xuat hien 2 lan
//
//
//7 xuat hien 1 lan
//
//
//2 xuat hien 3 lan
//
//
//8 xuat hien 1 lan
//
//
//3 xuat hien 3 lan

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class J02007 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++) a[i] = sc.nextInt();

            LinkedHashMap<Integer, Integer> count = new LinkedHashMap<>();
            for(int x : a){
                count.put(x, count.getOrDefault(x, 0) + 1);
            }

            System.out.println("Test " + tc + ":");
            for(Map.Entry<Integer, Integer> e : count.entrySet()){
                System.out.println(e.getKey() + " xuat hien " + e.getValue() + " lan");
            }
        }
    }
}
