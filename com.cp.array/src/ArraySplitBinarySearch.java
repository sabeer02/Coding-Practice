public class ArraySplitBinarySearch {
    public static int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }
        if(k==1)return low;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(isValid(nums,k,mid)){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }
    public static boolean isValid(int [] nums, int max_count, int target){
        int count=1;
        int sum=0;
        for(int num:nums){
            sum+=num;
            if(sum>target){
                count++;
                sum=num;
                if(count>max_count)return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] nums = {7,2,5,10,8};
        int split = 2;
        int res = splitArray(nums,split);
        System.out.println(res);
    }
}
