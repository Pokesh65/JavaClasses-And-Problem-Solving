package HackerRank.ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

	public static void BSearch(Integer Arr[],int target){
		
		int left=0;
		int right=Arr.length-1;
		int middle=(left+right)/2;
		
		while(left<right){
			
			if(Arr[left]==target){
				
				System.out.println(left);
				break;
				
			}else if(Arr[right]==target){
				
				System.out.println(right);
				break;
				
			}else if(Arr[middle]==target){
				
				System.out.println(middle);
				break;
				
			}else if(Arr[middle]<target){
				left=middle;
				middle=(left+right)/2;
				
			}else if(Arr[middle]>target){
				right=middle;
				middle=(left+right)/2;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer Arr1[] = { 8, 10, 8, 36, 5, 17, 3, 83, 1, 4 };
		List<Integer> Ar=new ArrayList<Integer>(Arrays.asList(Arr1));
		Collections.sort(Ar);
		
		 Integer[] array = Ar.toArray(new Integer[0]);
		
		System.out.println(Ar.toString());
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value :");
		int tr = scan.nextInt();
		BSearch(array, tr);

	}

}
