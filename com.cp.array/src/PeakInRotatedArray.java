public class PeakInRotatedArray {
    public static int findPeak(int [] nums){
        int start=0;
        int end= nums.length-1;
        if(nums[start]<nums[end])return end;
        while (start<end){
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])return mid;
            else if (mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            } else if (nums[start]<nums[mid]) {
                start=mid;
            }else {
                end=mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int [] nums = {3,1,2};
        int peak = findPeak(nums);
        System.out.println(nums[((peak+1)%(nums.length))]);
    }
}
