import java.util.*;
public class AppearsOnce {
    public static void main(String[] args) {
        int [] arr = {4,1,2,1,2};
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int ele:arr){
            if(hash.containsKey(ele)){
                hash.put(ele,hash.get(ele)+1);
            }else{
                int count=1;
                hash.put(ele,count);
            }
        }
        for (Map.Entry<Integer, Integer> point: hash.entrySet()){
            if(point.getValue()==1){
                System.out.println(point.getKey());
                break;
            }
        }
    }
}
