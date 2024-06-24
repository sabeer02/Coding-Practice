public class KadaneAlgo {

    static long maxSubarraySum (int[] arr,int n){
        long sum = arr[0];
        long max_sum = 0;

        for (int i = 1; i < n; i++) {
            sum-=arr[i];
            if (max_sum < sum){
                max_sum=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4 };
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
