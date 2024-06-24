public class MajorityElementNByTwo {
    static int majorityElement(int[] nums){
        int len = nums.length;
        int major = 0;
        int ele = 0;
        for (int i = 0; i < len; i++) {
            if(major==0){
                major=1;
                ele = nums[i];
            } else if (nums[i]==ele) {
                major++;
            }else {
                major--;
            }
        }
        int count=0;
        if(major!=0){
            for (int i = 0; i < len; i++) {
                if(nums[i]==ele){
                    count++;
                }
                if(count>((len)/2)){
                    return ele;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4};
        int ans = majorityElement(nums);
        System.out.println("The majority element is: " + ans);
    }
}
