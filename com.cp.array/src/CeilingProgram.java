public class CeilingProgram {

    public static void main(String [] args){
        int [] arr = {1,3,4,6,8};
        int search = 2;
        int res = ceiling(arr,search);
        System.out.println("Ceiling: "+ res);
        res = floor(arr,search);
        System.out.println("Floor: "+ res);
    }

    private static int ceiling(int[] arr, int search) {
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==search){
                return mid;
            }
            else if (arr[mid]<search) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return start;
    }

    private static int floor(int[] arr, int search) {
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==search){
                return mid;
            }
            else if (arr[mid]<search) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return end;
    }
}
