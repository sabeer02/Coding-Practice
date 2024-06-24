public class SplitArrayReview {
    public static int splitArray(int[] nums, int k) {
        int max_value=0;
        int summation=0;
        for(int num:nums){
            max_value=Math.max(max_value,num);
            summation+=num;
        }
        if(k==1)return summation;
        while(max_value<=summation){
            int mid=max_value+(summation-max_value)/2;
            if(splitMax(nums,k,mid))summation=mid-1;
            else max_value=mid+1;
        }
        return max_value;
    }
    public static boolean splitMax(int [] nums, int given_count, int target) {
        int count = 1;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if(sum>target){
                count++;
                sum = num;
                if (count > given_count) return false;
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
