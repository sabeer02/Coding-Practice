import java.util.Arrays;

public class SolutionMedian {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            mergedArray[i] = nums1[i];
        }
        int j=0;
        for(int i=nums1.length;i<mergedArray.length;i++)
        {
            mergedArray[i]= nums2[j];
            j++;
        }

        Arrays.sort(mergedArray);

        double median;

        if((mergedArray.length%2) == 0)
        {
            median = (mergedArray[(mergedArray.length/2)-1] + mergedArray[((mergedArray.length/2)+1)-1])/2.000;
        }
        else
        {
            median = mergedArray[(mergedArray.length)/2];
        }
        return median;
    }

    public static void main(String[] args) {
        int nums1[] = new int[]{1,2};
        int nums2[] = new int[]{3,4};
        double result = findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }
}
