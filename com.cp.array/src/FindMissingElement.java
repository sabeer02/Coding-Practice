public class FindMissingElement {
    //(n*(n-1))/2
    public static int findMissingElement(int [] nums){
        int n = nums.length+1;
        int sum = (n*(n+1))/2;
        for (int num:nums) {
            sum-=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        int res = findMissingElement(arr);
        System.out.println(res);
    }
}
