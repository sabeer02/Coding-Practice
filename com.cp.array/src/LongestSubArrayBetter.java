import java.util.*;

public class LongestSubArrayBetter {
    public static int longestSubarrayWithSumK(int []a, long k) {

        HashMap<Long,Integer> hash = new HashMap<>();
        long sum = 0;
        int max_len = 0;

        for (int i = 0; i < a.length; i++) {
            sum+=a[i];

            if(sum==k){
                max_len=Math.max(max_len,i+1);
            }

            long rem = sum - k;

            if(hash.containsKey(rem)){
                int len=i-hash.get(rem);
                max_len=Math.max(len,max_len);
            }

            if (!hash.containsKey(sum)){
                hash.put(sum,i);
            }
        }

        return max_len;

    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,1,9};
        long sub_total = 10;
        int res = longestSubarrayWithSumK(arr,sub_total);
        System.out.println(res);
    }
}
