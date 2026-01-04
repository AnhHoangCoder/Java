package Home_work;

//sắp xếp nổi bọt
public class Bai_1 {
    public static void main(String[] args){
        int nums[] = {99 , -10 , 100123 , 18 , -978 , 5623 , 463 , -9 , 287 , 49};

        System.out.print("Original array is: ");
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        //bubble sort
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = nums.length - 1 ; j > i ; j--){
                if(nums[j-1] > nums[j]){
                    int tmp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        System.out.print("Sorted array is: ");
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
