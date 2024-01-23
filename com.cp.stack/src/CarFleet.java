import java.util.*;

public class CarFleet {

    static public int carFleet(int target, int[] position, int[] speed) {

        Stack<Double> stck = new Stack<>();

        HashMap<Integer,Integer> storeIndex = new HashMap<>();
        for (int i=0;i< position.length;i++) {
            storeIndex.put(position[i],i);
        }

        Arrays.sort(position);


        for (int i = position.length-1; i >=0 ; i--) {
            double time = (double) (target - position[i]) /speed[storeIndex.get(position[i])];
            if (!stck.isEmpty() && stck.peek()<time){
                stck.push(time);
            } else if (stck.isEmpty()) {
                stck.push(time);
            }
        }
        return stck.size();
    }

    public static void main(String[] args) {
        int target =10;
        int[] position = {6,8};
        int[] speed = {3,2};

        int res = carFleet(target,position,speed);

        System.out.println(res);
    }
}
