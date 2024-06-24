import static java.util.Collections.rotate;

import java.util.*;

public class RotatePractice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int rotate = 4;
        rotateArray(arr, rotate);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateArray(int[] nums, int rotate) {
        int n = nums.length;
        rotate %= n;
        int split = n - rotate -1;
        reverseArray(nums, 0, split);
        reverseArray(nums, split + 1, n - 1);
        reverseArray(nums, 0, n - 1);
    }

    private static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
