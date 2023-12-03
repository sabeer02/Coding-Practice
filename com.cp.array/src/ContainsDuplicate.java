import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    static public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1])return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,1};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
}
