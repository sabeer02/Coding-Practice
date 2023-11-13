public class ReverseArray {

    public static int[] reverseArray(int[] nums){

        for(int i=0;i<(nums.length)/2;i++){
            for (int j =(((nums.length)/2)+1); j < nums.length ; j++) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array_2 = new int[]{5,4,12,7,15,9};
        array_2=reverseArray(array_2);

        for (int n:array_2) {
            System.out.println(n);
        }
    }
}
