import java.util.*;

public class TwoSum {
    static public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(sum.containsKey(nums[i])){
                return new int[]{sum.get(nums[i]),i};
            }
            sum.put(Math.abs(target-nums[i]),i);
        }
        return nums;
        /*
        * 3,2,4
        * 3->0
        * 4->1
        * if(nums[i] == key)
        * return new int[]{sum.get(nums[i]),i}
        * */
    }
    public static void main(String[] args) {
        int[] nums=new int[]{3,2,4};
        int[] result = twoSum(nums,6);
        for (int i:
             result) {
            System.out.println(i);
        }

    }
}
