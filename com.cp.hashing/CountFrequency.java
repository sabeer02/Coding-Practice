import java.util.*;

class CountFrequency{
	public static void main(String [] args){
		int [] arr = {10,5,10,15,10,5};
		HashMap<Integer,Integer> hash = new HashMap<>();
		for(int ele:arr){
			if(hash.containsKey(ele)){
				hash.put(ele,hash.get(ele)+1);
			}else{
				int count=1;
				hash.put(ele,count);
			}
			
		}
		for(Map.Entry<Integer,Integer> ent: hash.entrySet()){
			System.out.println(ent.getKey() + " Occurs " + ent.getValue() + " times in the array ");
		}
	}
}