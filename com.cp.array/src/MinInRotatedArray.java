public class MinInRotatedArray {
    public static int findMin(int[] nums) {
        int start=0;
        int end= nums.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1])return mid;
            else if (mid > start &&nums[mid-1]>nums[mid])return mid-1;
            else if(nums[mid]<=nums[0])end=mid-1;
            else start=mid+1;
        }
        return nums[(start+1)%(nums.length)];
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int min = findMin(arr);
        System.out.println(min);
    }
}
