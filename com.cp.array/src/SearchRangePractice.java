import java.util.Arrays;

public class SearchRangePractice {
    public static int[] searchRange(int[] nums, int target) {

        int firstOccurence=lowerBound(nums,target);
        int lastOccurence=upperBound(nums,target);
        return new int[]{firstOccurence,lastOccurence};

    }

    public static int lowerBound(int [] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int index=-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (nums[mid]<target)start=mid+1;
            else end=mid-1;
            if (nums[mid]==target) index=mid;
        }
        return index;
    }

    public static int upperBound(int [] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int index=-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (nums[mid]<=target)start=mid+1;
            else end=mid-1;
            if (nums[mid]==target) index=mid;
        }
        return index;
    }
    public static void main(String[] args) {
        int [] arr={5,7,7,8,8,10};
        int target = 6;
        int[] res = searchRange(arr,target);
        System.out.println(Arrays.toString(res));
    }
}
