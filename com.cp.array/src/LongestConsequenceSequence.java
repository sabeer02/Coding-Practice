import java.util.HashSet;

public class LongestConsequenceSequence {
    static public int longestConsecutive(int[] nums) {

        int longestCount=0;
        HashSet<Integer> uniqueValues = new HashSet<>();

        for (int x:nums) {
            uniqueValues.add(x);
        }
        for (int i = 0; i < nums.length; i++) {
            int leastCount=1;
            int j=nums[i];
            if (!uniqueValues.contains(j-1)){
                while (uniqueValues.contains(j+1)){
                    leastCount++;
                    j++;
                }
            }
            longestCount=Math.max(longestCount,leastCount);
        }
        return longestCount;

    }
    public static void main(String[] args) {
        int[] x =new int[]{0,3,7,2,5,8,4,6,0,1};
        int result = longestConsecutive(x);
        System.out.println(result);

    }
}
