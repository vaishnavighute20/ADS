package searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingMain {
	//can work on sorted as well as non sorted array
    public static int linearSearch(int [] arr, int key) {
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==key)
    			return i;
    	}
		return -1;
    }
    // works only for sorted array
    public static int binarySearch(int[]arr,int key) {
    	int left=0 ,right=arr.length -1,mid;
    	while(left<=right) {

    	mid=(left+right)/2;
    	if (key==arr[mid])
    		return mid;
    	if (key<arr[mid])

    		right=mid-1;
    	else
    	left=mid+1;
    }
    return -1;	
    }
    
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int [] arr= {88,33,66,99,44,77,22,55,11};
		Arrays.sort(arr);
		System.out.println("enter key to search");
		int key=sc.nextInt();
		int index=linearSearch(arr, key);
		if(index !=-1)
			System.out.println("key found at :"+ index);
		else 
			System.out.println("key not found");
		
		 index=binarySearch(arr, key);
		if(index !=-1)
			System.out.println("key found at index:"+ index);
		else 
			System.out.println("key not found");
		
	}
}
