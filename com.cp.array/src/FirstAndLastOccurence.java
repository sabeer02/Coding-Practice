import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,5,6,7,8,9};
        int search = 5;
        int first = findPos(nums,search,true);
        int last = findPos(nums,search,false);
        System.out.println(first + "th index" + " and " + last + "th index");
    }
    public static int findPos(int [] nums, int target, boolean isFirst){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else if (nums[mid]>target){
                end=mid-1;
            }else {
                ans=mid;
                if(isFirst){
                    end=mid-1;
                }else {
                    start=mid+1;
                }

            }
        }
        return ans;
    }
}
