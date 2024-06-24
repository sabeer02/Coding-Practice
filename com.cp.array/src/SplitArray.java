public class SplitArray {
    /*public static int splitArray(int[] nums, int k) {
        //summation and max
        int high = 0;
        int low= Integer.MIN_VALUE;
        for (int num: nums) {
            high+=num;
            low=Math.max(low,num);
        }
        while (low<=high){
            int mid = low + (high-low)/2;
            if(split(nums,mid,k))high=mid-1;
            else low=mid+1;
        }
        return high;
    }
    public static boolean split(int [] nums,int mid, int target){
        int count=1;
        int total = 0;
        for (int num:nums) {
            total+=num;
            if(total>mid){
                total=num;
                count++;
                if(count<target)return false;
            }
        }
        return true;
    }*/

    public static int splitArray(int[] nums, int m) {
        int low = 0; int high = 0;
        for (int num : nums) {
            low = Math.max(num, low);
            high += num;
        }
        if (m == 1) return high;
        while (low <= high) {
            int mid = (low + high)/ 2;
            if (valid(nums, mid, m)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static boolean valid(int[] nums, int mid, int max_count) {
        int count = 1;
        int total = 0;
        for(int num : nums) {
            total += num;
            if (total > mid) {
                total = num;
                count++;
                if (count > max_count) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int [] arr={4,5,0,-2,-3,1};
        int split = 5;
        int res = splitArray(arr,split);
        System.out.println(res);
    }
}
