public class IdenticalTwins {
    static int getIdenticalTwinsCount (int[] arr) {
        int i=0;
        int count = 0;

        while (i<arr.length-1){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 2, 1};
        int noOfIdenticalTwins = getIdenticalTwinsCount(arr);
        System.out.println(noOfIdenticalTwins);
    }
}
