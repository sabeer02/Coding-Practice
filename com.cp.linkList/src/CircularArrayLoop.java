public class CircularArrayLoop {
    public static boolean circularArrayLoop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]+=i;
            if(nums[i]<0){
                nums[i]+= nums.length;
            }else{
                nums[i]%=nums.length;
            }
        }
        int slow_ptr=0;
        int fast_ptr=0;
        do{
            slow_ptr=nums[((slow_ptr)%(nums.length))];
            fast_ptr=nums[nums[((fast_ptr)%(nums.length))]];
        }while(nums[slow_ptr]!=nums[fast_ptr]);

        fast_ptr=0;
        while(slow_ptr!=fast_ptr){
            slow_ptr=nums[((slow_ptr)%(nums.length))];
            fast_ptr=nums[nums[((fast_ptr)%(nums.length))]];
        }
        return slow_ptr==fast_ptr;
    }
    public static void main(String[] args) {
        int [] arr = {1,-1,5,1,4};
        System.out.println(circularArrayLoop(arr));
    }
}
