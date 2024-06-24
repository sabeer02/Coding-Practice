import java.util.Arrays;

public class MergeSortPractice {
    public static int[] mergeSort(int[] nums) {
        if (nums.length == 1) return nums;
        int mid = nums.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(left, right);
    }
    public static int[] merge(int[] left, int[] right) {
        int left_ptr = 0;
        int right_ptr = 0;
        int[] res = new int[left.length + right.length];
        int res_ptr = 0;
        while (left_ptr < left.length && right_ptr < right.length) {
            if (left[left_ptr] < right[right_ptr]) {
                res[res_ptr++] = left[left_ptr++];
            } else if (left[left_ptr] > right[right_ptr]) {
                res[res_ptr++] = right[right_ptr++];
            } else {
                res[res_ptr++] = right[right_ptr++];
                res[res_ptr++] = left[left_ptr++];
            }
        }
        while (left_ptr < left.length) {
            res[res_ptr++] = left[left_ptr++];
        }
        while (right_ptr < right.length) {
            res[res_ptr++] = right[right_ptr++];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 5, 6, 4, 8, 2};
        int[] res = mergeSort(arr);
        System.out.println(Arrays.toString(res));
    }
}
