public class ArraySorted {
    public static boolean isSorted(int [] nums){
        int left=0;
        int right=1;
        while (right< nums.length && left<right){
            if(nums[right]<nums[left])return false;
            left++;
            right++;
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6};
        System.out.println(isSorted(arr));
    }
}
