//Cho dãy số a[] có n phần tử và dãy số b[] có m phần tử là các số nguyên dương nhỏ hơn 1000. Gọi tập hợp A là tập các số khác nhau trong a[], tập hợp B là tập các số khác nhau trong b[].
//
//Hãy tìm tập giao của A và B.
//
//Input
//
//Dòng đầu ghi 2 số n và m (1 < n,m <100).
//
//Dòng thứ 2 ghi n số của a[].
//
//Dòng thứ 3 ghi m số của b[].
//
//Các số đều dương và nhỏ hơn 1000.
//
//Output
//
//Ghi tập giao của A và B trên một dòng theo thứ tự từ nhỏ đến lớn.
//
//        Ví dụ
//
//
//Input
//
//        Output
//
//5 6
//
//
//        1 2 3 4 5
//
//
//        3 4 5 6 7 8
//
//
//
//        3 4 5

import java.util.*;

public class J02005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> giao = new ArrayList<>();

        int i = 0, j = 0;
        while(i < n && j < m){
            if(a[i] < b[j]){
                i++;
            }
            else if(a[i] > b[j]){
                j++;
            }
            else{
                if(giao.isEmpty() || giao.get(giao.size() - 1) != a[i]){
                    giao.add(a[i]);
                }
                i++;
                j++;
            }
        }

        for(int x : giao){
            System.out.print(x + " ");
        }
    }
}
