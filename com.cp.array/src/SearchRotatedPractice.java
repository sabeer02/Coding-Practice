public class SearchRotatedPractice {
    public static int search(int[] nums, int target) {
        int length = nums.length-1;
        int peak = findPeak(nums,length);
        System.out.println(peak);
        if(peak==-1){
            return bs(nums,target,0,length);
        }
        if(target<nums[0])return bs(nums,target,peak+1,length);
        return bs(nums,target,0,peak);
    }
    public static int findPeak(int [] nums,int length){
        int start=0;
        int end = length;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1])return mid;
            else if (mid > start &&nums[mid-1]>nums[mid])return mid-1;
            else if(nums[mid]<=nums[0])end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    public static int bs(int [] arr, int target, int start, int end){
        while(start<=end){
            int mid = (start + (end-start)/2);
            if(arr[mid] == target) return mid;
            else if(arr[mid]>target)end=mid-1;
            else if(arr[mid]<target)start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {3,1};
        int search = 3;
        int res = search(arr,search);
        System.out.println(res);
    }
}
