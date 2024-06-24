import java.util.*;

public class FindUnionArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        List<Integer> res = new ArrayList<>();

        int ptr_1=0;
        int ptr_2=0;

        while (ptr_1 < arr1.length && ptr_2 < arr2.length){
            if(arr1[ptr_1] <= arr2[ptr_2]){
                if(res.isEmpty() || res.get(res.size()-1) != arr1[ptr_1]){
                    res.add(arr1[ptr_1]);
                }
                ptr_1++;
            } else {
                if(res.isEmpty() || res.get(res.size()-1) != arr2[ptr_2]){
                    res.add(arr2[ptr_2]);
                }
                ptr_2++;
            }
        }
        while (ptr_1 < arr1.length){
            res.add(arr1[ptr_1]);
            ptr_1++;
        }
        while (ptr_2 < arr2.length){
            res.add(arr2[ptr_2]);
            ptr_2++;
        }
        Object[] union = Arrays.stream(res.toArray()).toArray();
        System.out.print("{");
        for (int i = 0; i < union.length-1 ; i++) {
            System.out.print(union[i] + ",");
        }
        System.out.print(union[union.length-1]);
        System.out.print("}");
        System.out.println();
        System.out.println("{1,2,3,4,5,6,7,8,9,10,11,12}");
    }
}
