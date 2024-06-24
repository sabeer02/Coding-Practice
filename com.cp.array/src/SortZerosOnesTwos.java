import java.util.*;
public class SortZerosOnesTwos {

    static void sortZerosOnesTwos(int[] nums){
        int Zero=0;
        int One=0;
        int Two=nums.length-1;

        while (One<=Two){
            if(nums[One]==0){
                int temp = nums[One];
                nums[One] = nums[Zero];
                nums[Zero]=temp;
                Zero++;
                One++;
            } else if (nums[One]==1) {
                One++;
            }else {
                int temp = nums[One];
                nums[One] = nums[Two];
                nums[Two]=temp;
                Two--;
            }
        }
    }


    public static void main(String[] args) {
        int [] nums = {2,0,1,2,1};
        sortZerosOnesTwos(nums);
        System.out.println(Arrays.toString(nums));
    }
}
