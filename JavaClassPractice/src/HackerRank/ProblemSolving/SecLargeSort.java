package HackerRank.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecLargeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr1[]= {2,4,6,8,5,5,69,23,12,39,45,100};
		
		int length=arr1.length-2;
		
		List<Integer> set1=new ArrayList<Integer>(Arrays.asList(arr1));
		
		Collections.sort(set1);
		
		System.out.println("The Second largest is :"+set1.get(length));
		
	}

}
