import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFirstAndLastposition {
    static public int[] searchRange(int[] nums, int target) {
        int indexStart = bnrsrchStart(nums,target);
        int indexEnd = bnrsrchEnd(nums,target);
        System.out.println(indexStart);
        System.out.println(indexEnd);
         return new int[]{-1,-1};

    }
    static public int bnrsrchStart(int[] nums,int target){

        int index = -1;
        int s=0;
        int end = nums.length-1;
        while (s<=end){
            int mid = s + (end-s)/2;
            if(target<=nums[mid]){
                end=mid-1;
            } else{
                s=mid+1;
            }
            if(target==nums[mid])index=mid;
        }
        return index;
    }

    static public int bnrsrchEnd(int[] nums,int target){

        int index = -1;
        int s=0;
        int end = nums.length-1;
        while (s<=end){
            int mid = s + (end-s)/2;
            if(target>=nums[mid]){
                s=mid+1;
            } else{
                end=mid-1;
            }
            if(target==nums[mid])index=mid;
        }
        return index;
    }


    public static void main(String[] args) {
        int[] x =new int[]{5,7,7,8,8,10};
        int[] result = searchRange(x, 8);
        for (int i:
             result) {
            System.out.println(i);
        }
    }
}
