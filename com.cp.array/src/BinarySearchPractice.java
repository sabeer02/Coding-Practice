import java.util.*;

public class BinarySearchPractice {

	public static int bs(int [] arr, int target){
		int len=arr.length-1;
		if(arr[len]<target)return -1;
		int start=0;
		int end=len;
		while(start<=end){
			int mid = (start + (end-start)/2);
			if(arr[mid] == target) return mid;
			else if(arr[mid]>target)end=mid-1;
			else if(arr[mid]<target)start=mid+1;
		}
		return -1;
	}

	public static void main(String [] args){
		int [] arr = {1,2,3,4,5,6,7};
		int search = 7;
		int res = bs(arr,search);
		System.out.println(res);
	}

}



