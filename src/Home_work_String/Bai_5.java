package Home_work_String;

public class Bai_5{
    public static void main(String[] args){
        String a = "tôi chăm học tôi chịu khó tôi đẹp zai";
        String b = "tôi";
        String[] arr = a.split(" ");

        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals(b)){
                count++;
            }
        }

        System.out.println(count);
    }
}