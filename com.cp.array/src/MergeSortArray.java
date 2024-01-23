public class MergeSortArray {
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length+nums2.length];

        //add using two pointers not arrays.sort
        int i=0,j=0,k=0;
        while (k<mergedArray.length){

                if(nums1[i++]<= nums2[j++] && i<nums1.length){
                    mergedArray[k]=nums1[i];
                }else if(nums1[i]>nums2[j++] && j<nums2.length){
                    mergedArray[k++]=nums2[j++];
                }
            k++;
        }

        for (int s:
             mergedArray) {
            System.out.print(s+" ");
        }

        System.out.println();
        return 0;
    }
    public static void main(String[] args) {
        int[] x =new int[]{1,3};
        int[] y =new int[]{2};
        System.out.println(findMedianSortedArrays(x,y));
    }
}
