import java.util.*;

class RangeFrequency{
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
		//for finding the highest
		int highestKey = 0;
		int highestValue = 0;
		for(Map.Entry<Integer,Integer> ent: hash.entrySet()){
			if(ent.getValue() > highestValue){
				highestKey = ent.getKey();
				highestValue = ent.getValue();
			}
		}
		//for finding the lowest
		int lowestKey=Integer.MAX_VALUE;
		int lowestValue=Integer.MAX_VALUE;
		for(Map.Entry<Integer,Integer> ent: hash.entrySet()){
			if(ent.getValue() < lowestValue){
				lowestKey = ent.getKey();
				lowestValue = ent.getValue();
			}
		}
		System.out.println(highestKey+" "+lowestKey);
	}
}