import java.util.*;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int [] dup = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            dup[i]=heights[i];
        }
        Arrays.sort(dup);
        int output=0;
        for(int i=0;i<=heights.length-1;i++){
            if(dup[i]!=heights[i]){
                output++;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,4,2,1,3};
        int res = heightChecker(nums);
        System.out.println(res);
    }
}
