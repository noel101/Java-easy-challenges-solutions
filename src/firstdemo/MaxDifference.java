package firstdemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class MaxDifference {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={4,40,6,5,89,86,10,20,3};
		int arr_size=arr.length;
		MaxDifference md =new MaxDifference();
		
		System.out.println("The answer is "+md.maxDifference(arr, arr_size)); 
		
		System.out.println("The answer is "+MaxDifference.maxDifference(arr, arr_size)); 
		
		
     
	}
	
	public static int maxDifference(int []arr, int arr_size){
		int difference=0;
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0; i<arr_size;i++){
			list.add(arr[i]);
		}
		
		Collections.sort(list);
		
		int last=list.size()-1;
		difference= list.get(last)-list.get(0);
		return difference;
	} 

}

