import java.util.Arrays;

public class MoveZeroesBro {
    public static int [] moveZeroes(int [] nums){
        int left=0;
        int right=0;
        while (right<nums.length && left<nums.length){
            if(nums[right]!=0 && nums[left]!=0){
                right++;
                left++;
            }
            if(left<nums.length && nums[left]==0){
                while (right<nums.length){
                    if(nums[right]!=0)break;
                    right++;
                }
                if(right>=nums.length)return nums;
                swap(nums,left,right);
                left++;
                right++;
            }

        }
        return nums;
    }
    public static void swap(int[] nums, int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public static void main(String[] args) {
        int [] arr = {1,0,2,3};
        int [] res= moveZeroes(arr);
        System.out.println(Arrays.toString(res));
    }
}
