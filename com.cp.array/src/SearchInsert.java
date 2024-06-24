public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        if(nums[end]<target){
            return end+1;
        }
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target)start=mid+1;
            else if(nums[mid]>target)end=mid;
        }
        return start;
    }

    public static void main(String [] args){
        int [] arr = {1,2,4,5,7};
        int res=searchInsert(arr,7);
        System.out.println(res);
    }
}
