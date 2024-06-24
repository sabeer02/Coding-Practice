public class LongestSubArrayOptimal {
    public static int getLongestSubarray(int []nums, int k) {

        int left = 0;
        int right = 0;

        int n = nums.length;

        int max_len = 0;
        int sum = nums[0];

        while (right<n){
            while (left<=right && sum>k){
                sum-=nums[left];
                left++;
            }
            if(sum==k){
                max_len=Math.max(max_len,right-left+1);
            }
            right++;
            if(right<n){
                sum+=nums[right];
            }
        }
        
        return max_len;

    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,1,9};
        int sub_total = 10;
        int res = getLongestSubarray(arr,sub_total);
        System.out.println(res);
    }
}
