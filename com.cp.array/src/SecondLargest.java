public class SecondLargest {
    public static int secondLargest(int [] nums){
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];

        int second_max=0;
        int first_max=0;

        for(int num:nums){
            if(num>first_max){
                second_max=first_max;
                first_max=num;
            }
        }
        return second_max;
    }
    public static void main(String[] args) {
        int [] arr = {3,4,6,2,10};
        int res = secondLargest(arr);
        System.out.println(res);
    }
}
