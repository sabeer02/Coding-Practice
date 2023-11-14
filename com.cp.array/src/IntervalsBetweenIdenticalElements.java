import java.util.Arrays;

public class IntervalsBetweenIdenticalElements {
    static public long[] getDistances(int[] arr) {
        long[] result = new long[arr.length];
        int i=0;
        while (i< arr.length){
            for (int j = 0; j < arr.length; j++) {
                if(i!=j && arr[i] == arr[j]){
                    result[i]+=Math.abs(i-j);
                }
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,3,1,2,3,3};
        //Output: [4,2,7,2,4,4,5]
        long[] noOfIdenticalTwins = getDistances(arr);
        System.out.println(Arrays.toString(noOfIdenticalTwins));
    }
}
