public class DuplicatedRotated {
    public static boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = -1;
        while(start <= end) {
            mid = start + (end-start)/2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < nums[end] || nums[mid] < nums[start]) {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (nums[mid] > nums[start] || nums[mid] > nums[end]) {
                if (target < nums[mid] && target <= nums[end]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                start++;
                end--;
            }
        }

        return false;
    }
    public static int findPeakWithDuplicates(int [] nums,int length){
        int start=0;
        int end = length;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1])return mid;
            else if (mid > start &&nums[mid-1]>nums[mid])return mid-1;
            else if (nums[mid]==nums[start] && nums[mid]==nums[end]) {
                if(start < end && nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if (end > start && nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            } else if (nums[start]<nums[mid] || (nums[mid]==nums[start] && nums[end]<nums[mid])) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static boolean bs(int [] arr, int target, int start, int end){
        while(start<=end){
            int mid = (start + (end-start)/2);
            if(arr[mid] == target) return true;
            else if(arr[mid]>target)end=mid-1;
            else if(arr[mid]<target)start=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2,2,3};
        int search = 3;
        boolean res = search(arr,search);
        System.out.println(res);
    }
}
