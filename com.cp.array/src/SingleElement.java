public class SingleElement {
    public static void main(String [] args) {
        int[] arr = {1,1,2,2,3,3,4,4,8};
        int res = singleNonDuplicate(arr);
        System.out.println(res);
    }
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length<1)return -1;

        int start=1;
        int end = nums.length-2;

        if(nums[0]!=nums[start])return nums[0];
        if(nums[end+1]!=nums[end])return nums[end+1];

        while (start<=end){
            int mid =start+(end-start)/2;
            if(nums[mid+1]!=nums[mid] && nums[mid-1]!=nums[mid])return nums[mid];
            else  {
                if(nums[mid+1]==nums[mid]){
                    if(mid%2==0){
                        start=mid+1;
                    }else {
                        end=mid-1;
                    }
                }else{
                    if(mid%2==0){
                        end=mid-1;
                    }else {
                        start=mid+1;
                    }
                }
            }
        }
        return -1;
    }

}
