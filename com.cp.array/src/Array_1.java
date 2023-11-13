import java.util.Arrays;
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        int[] myArray = new int[20];

        Scanner scr = new Scanner(System.in);

        for (int i=0;i<myArray.length;i++){
            int ele = scr.nextInt();
            myArray[i]=ele;
        }

        Arrays.sort(myArray);

        System.out.println("Min element of the array is "+myArray[0]);
        System.out.println("Max element of the array is "+myArray[myArray.length-1]);

    }
}
