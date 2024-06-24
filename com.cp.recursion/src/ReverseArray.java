public class ReverseArray {
    static int[] reverse(int [] arr, int s, int e){
        if(e>s){
            int temp = arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            return reverse(arr,++s,--e);
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] test = {1,2,3,4};
        test=reverse(test,0, test.length-1);
        for (int ele:
             test) {
            System.out.print(ele+",");
        }
    }
}
