public class PeakInRoatedArryaWithDuplicates {
    public static void main(String[] args) {
        //3,3,3,4,5
        int [] nums = {3,4,5,3,3};
        int peak = findPeakwithDuplicates(nums);
        System.out.println(nums[peak]);
        System.out.println(nums.length-peak);
    }

    private static int findPeakwithDuplicates(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if (mid>start && nums[mid-1]>nums[mid]) {
                return mid-1;
            }
            //ignore duplicates
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                if(nums[start]>nums[start+1])return start;
                start++;
                if(nums[end-1]>nums[end])return end-1;
                end--;
            } else if (nums[mid]>nums[start] || (nums[mid]==nums[start] && nums[end]>nums[mid])) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
}
