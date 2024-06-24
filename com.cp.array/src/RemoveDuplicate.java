import java.util.*;

public class RemoveDuplicate {
    public static int removeDuplicate(int [] nums){
        int main_ptr=0;
        for(int i=1;i<nums.length;i++){
            if(nums[main_ptr]!=nums[i]){
                main_ptr++;
                nums[main_ptr]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return main_ptr+1;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,5,5,6,8};
        int res = removeDuplicate(arr);
        System.out.println(res);
    }
}
