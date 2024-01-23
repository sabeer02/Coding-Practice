import java.util.Arrays;

public class MoveZeroesOptimized {
    static public void moveZeroes(int[] nums) {
        //check if the nums array is empty or length =1
        if(nums.length<2){
            return;
        }
        //declare nonZeroIndex=0
        int nonZeroIndex=0;
        //iterate to add all non zero values to the array,
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[nonZeroIndex++]=nums[i];
            }
        }
        //pad the array with 0 until the length
        while (nonZeroIndex< nums.length){
            nums[nonZeroIndex++]=0;
        }
        //that's it
    }
    public static void main(String[] args) {
        int[] moveZero = new int[]{0,1,0,3,12};
        moveZeroes(moveZero);
        System.out.println(Arrays.toString(moveZero));
    }

}
