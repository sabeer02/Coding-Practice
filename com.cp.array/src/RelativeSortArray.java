import java.util.*;
public class RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr1){
            if(map.containsKey(num)){
                map.put(num,(map.get(num)+1));
            }else {
                map.put(num,1);
            }
        }
        /*for(Map.Entry<Integer,Integer> mymap:map.entrySet()){
            System.out.println(mymap.getKey() + " " + mymap.getValue());
        }*/
        int arr1_ptr=0;
        List<Integer> list = new ArrayList<>();
        for (int num:arr2){
            if(map.containsKey(num) && (map.get(num) > 1)){
                for (int i = 0; i < map.get(num); i++) {
                    arr1[arr1_ptr++]=num;
                }
            }else {
                list.add(num);
            }
        }
        list.stream().sorted();
        System.out.println(list);
        /*for (int i = arr1_ptr; i < arr1.length ; i++) {
            arr1[i]=;
        }*/
        return arr1;
    }
    public static void main(String[] args) {
        int [] arr1 = {28,6,22,8,44,17};
        int [] arr2 = {22,28,8,6};
        arr1 = relativeSortArray(arr1,arr2);
        for(int num:arr1){
            System.out.print(num + ",");
        }
        //2,2,2,1,4,3,3,9,6,7,19
        //2,2,2,1,4,3,3,9,6,2,19
    }
}
