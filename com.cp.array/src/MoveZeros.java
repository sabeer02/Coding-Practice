import java.util.Arrays;

public class MoveZeros {
    public static int[] moveZeroes(int[] nums) {

        int left =0;

        for(int right=1;right<nums.length;right++){
            if(nums[right] != 0 && nums[left] == 0){
                    nums[left]=nums[right];
                    nums[right]=0;

            }
            if(nums[left]!=0){
                left++;
            }

        }

        /*int lastElement = nums.length-1;

        for (int i=0;i<lastElement;i++) {
            System.out.println(lastElement);
            if(nums[i] == 0){
                nums[i] = nums[lastElement];
                nums[lastElement]=0;
                lastElement--;
            }

        }*/

        /*int left = 0;
        int right=1;

        while (left<right&&right< nums.length){
            if(nums[right] == 0){
                right++;
            } else{
                    if (nums[left] == 0) {
                        nums[left]=nums[right];
                        nums[right]=0;
                    }
                right++;
                left++;
            }

        }*/

        /*int snowBallSize = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                snowBallSize++;
            }
            else if (snowBallSize > 0) {
                int t = nums[i];
                nums[i]=0;
                nums[i-snowBallSize]=t;
            }
        }*/

        return nums;
    }
    public static void main(String[] args) {
        int[] moveZero = new int[]{1,0,0,1};
        int[] result = moveZeroes(moveZero);
        System.out.println(Arrays.toString(result));
    }
}
