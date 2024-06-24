class Solution{
	public static int search(int [] nums, int target){
	int start =0;
		int end = nums.length-1;
		boolean asc = nums[start]<nums[end];
		while(start<=end){
			int mid = start + ((end - start))/2;
			if(nums[mid]==target)return mid;
			if(asc){
		          if(nums[mid]<target)start=mid+1;
		          else end=mid-1; 
			}
			else{
			  if(nums[mid]<target)end=mid-1;
			  else start=mid+1;
			}
		}
		return -1;
	}
	public static void main (String [] args ){
             int [] nums = {10,9,8,7,6,5,4,3,2,1};
	     int target = 6;
	     int index = search(nums,target);
	     System.out.println(index);
	}
}
