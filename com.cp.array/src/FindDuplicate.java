public class FindDuplicate {
    public static int findDuplicate(int[] nums) {

        int start=0;
        int end= nums.length-1;
        int mid = -1;

        while (start<=end){
            mid = start + (end-start)/2;
            if(start<end && (nums[start]==nums[start+1] || nums[start]==nums[mid] || nums[start]==nums[end])){
                return nums[start];
            } else if (start<end && (nums[end]==nums[end-1] || nums[start]==nums[mid])) {
                return nums[end];
            } else {
                start++;
                end--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {3,4,4,5,1,2};
        int res = findDuplicate(arr);
        if(res!=-1){
            System.out.println(res);
        }

    }
}
