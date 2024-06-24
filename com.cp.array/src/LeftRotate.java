import java.util.Arrays;

public class LeftRotate {
    public static int [] leftRotate(int [] nums, int len,int count){
        int rotate_pivot=len-count;

        reverseArray(nums,0,rotate_pivot-1);
        reverseArray(nums,rotate_pivot,len-1);
        reverseArray(nums,0,len-1);
        return nums;

    }
    public static void reverseArray(int [] nums, int start, int end){
        while (start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int len = arr.length;
        int [] res = leftRotate(arr,len,4);
        System.out.println(Arrays.toString(res));
    }
}
