package HackerRank.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Removing all Negative number At the End Of the Array Over Here

public class RemoveAllnegvaluetoEnd {
	
	public static void arraysortedbynegativ(int arr[],int n){
		int temArray[]=new int[n];
		
		int j=0;
		
		for(int i=0;i<n;i++){
			if(arr[i]>=0){
				temArray[j++]=arr[i];
			}
		}
		
		if(j==n||j==0){
			return;
		}
		for(int i=0;i<n;i++){
			if(arr[i]<0){
				temArray[j++]=arr[i];
			}
		}
		for(int i=0;i<temArray.length;i++){
//			arr[i]=temArray[i];
			System.out.print(temArray[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value[]={2,3,5,-6,-2,4,5,7,-8,4,-89,8};
		
		arraysortedbynegativ(value,value.length);
		System.out.println();
		
		List<Integer> positive=new ArrayList<Integer>();
		List<Integer> negative=new ArrayList<Integer>();
		
		for(Integer data:value){
			if(data>=0){
				positive.add(data);
			}else{
				negative.add(data);
			}
		}
		positive.addAll(negative);
		
		System.out.println(positive);
//		System.out.println("List : "+positive+""+negative);
	}

}
