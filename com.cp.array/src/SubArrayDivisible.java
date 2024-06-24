/*
public class SubArrayDivisible {
    public static int splitArray(int[] nums, int m) {
        int low = 0; int high = 0;
        for (int num : nums) {
            low = Math.max(num, low);
            high += num;
        }
        if (m == 1) return high;
        int count=1;
        while (low <= high) {
            int mid = (low + high)/ 2;
            count=Math.
            if () {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static int valid(int[] nums, int m) {
        int count = 1;
        int total = 0;
        for(int num : nums) {
            total += num;
            if (total%m!=0) {
                total = num;
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int [] arr={4,5,0,-2,-3,1};
        int split = 5;
        int res = splitArray(arr,split);
        System.out.println(res);
    }
}
*/
