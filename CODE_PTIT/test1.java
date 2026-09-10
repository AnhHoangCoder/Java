import java.util.Arrays;


public class test1 {
    public static void main(String[] args){
        int[] a = {1,6,18,37,64};
        int tmp = 19;
        int i = 0;
        while(i < 5 && a[i] <= tmp){
            i++;
        }
        int[] b = Arrays.copyOfRange(a,0,i);
        for(int x : b){
            System.out.print(x+" ");
        }
        System.out.print(tmp + " ");
        for(int j = i; j < 5; j++){
            System.out.print(a[j]+" ");
        }
    }
}
