import java.util.HashMap;

public class Array_2 {

//    static int removeDuplicates(int[] nums) {
//        int count =0;
//        if (nums.length == 0) {
//            return count;
//        }
//
//        HashMap<Integer, Integer> alex = new HashMap<>();
//
//
//        for (int i = 0; i < nums.length; i++) {
//            if (alex.get(nums[i]) < 2) {
//
//                System.out.println(nums[i]);
//                alex.put(nums[i], 1);
//            }
//        }
//
//        for (int n:
//             ) {
//
//        }
//
//
//
//        return count;
//    }

        public static int removeDuplicates(int[] nums) {
            int i = 0;
            for (int n : nums)
                if (i < 2 || n > nums[i-2])
                    nums[i++] = n;
            return i;

    }
    public static void main(String[] args) {
        int[] array_2 = new int[]{0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(array_2));
    }
}
