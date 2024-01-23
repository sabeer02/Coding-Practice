public class RemoveDuplicates {
    static public int removeDuplicates(int[] nums) {
        int x=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[x]!=nums[i]){
                x++;
                nums[x]=nums[i];
            }
        }
        return x+1;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{0,0,1,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
}
