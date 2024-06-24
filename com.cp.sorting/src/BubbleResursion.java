import java.util.*;

public class BubbleRecursion{

	public static int [] bubbleRecursion(int [] nums, int first_ptr, int second_ptr){
		if(first_ptr==nums.length)return nums;
		if(second_ptr>nums.length)return bubbleRecursion(nums,first_ptr++,first_ptr+2);
		
		if(nums[first_ptr]>nums[second_ptr]){
			int temp = nums[first_ptr];
			nums[first_ptr]=nums[second_ptr];
			nums[second_ptr]=temp;
		}
		return bubbleRecursion(nums,first_ptr,second_ptr++);
	}
	
	public static void main(String [] args){
		int [] arr = {6,9,1,2,0,4,7};
		arr = bubbleRecursion(arr,0,1);
		System.out.println(Arrays.toString(arr));

	}

}
