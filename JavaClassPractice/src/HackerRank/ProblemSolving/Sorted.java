package HackerRank.ProblemSolving;

import java.util.Arrays;

public class Sorted {

	public void BubbleSorted(int []Arr1) {

		int AL = Arr1.length;
		
		//Bubble Sort Where You compare the value and swap them 
		
		System.out.println("Before Bubble Sorting :\n"+Arrays.toString(Arr1));

		for (int i = 0; i < AL ; i++) {

			

//			for (int j = 0; j < Arr1.length-1; j++) {
			for	(int j=0;j<Arr1.length-i-1;j++) {  //it will fetch the value Quickly

				if (Arr1[j] > Arr1[j+1]) { 
					int temp = Arr1[j];
					Arr1[j] = Arr1[j+1];
					Arr1[j+1] = temp;

				}
				
			}
			System.out.println("Sorting:"+Arrays.toString(Arr1));
			
			
		
		}
		
		System.out.println("After Bubble Sorting :\n"+Arrays.toString(Arr1));
		
	}
	
	public void SelectionSorted(int Arr1[]){
		
		int size=Arr1.length;
		
		System.out.println("Before Selection Sort : "+Arrays.toString(Arr1));
		
		
		for(int i=0;i<size;i++){
			
			int minindex=i;
			
			
			for(int j=i+1;j<size;j++){
				
				if(Arr1[minindex]>Arr1[j]){
					
					minindex=j; 
						
				}
				
			}
			int temp=Arr1[minindex];
			Arr1[minindex]=Arr1[i];
			Arr1[i]=temp;
			
			System.out.println();
			for(int m:Arr1){
				System.out.print(m+" ");
			}
			
		}	
		
	}
	
	
	public void InsertionSort(int Arr1[]){
		
		System.out.println("\n\nBefore Insertion Sort :"+Arrays.toString(Arr1));
		
		for(int i=1;i<Arr1.length;i++){
			
			int key=Arr1[i];
			int j=i-1;
			
			while(j>=0 && Arr1[j]>key){
				Arr1[j+1]=Arr1[j];
				j--;
				
			}
			
			Arr1[j+1]=key;
			for(int m:Arr1){
				System.out.print(m+" ");
			}
			System.out.println();
			
		}
		for(int m:Arr1){
			System.out.print(m+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sorted Sl = new Sorted();
		
		int Av[]= {10,2,3,4,53,23,50,54,23,32,44};
		
		int Av1[]= {10,8,2,4,9,5,7,1};
		
		Sl.BubbleSorted(Av);
		System.out.println();
		
		Sl.SelectionSorted(Av1);
		
		int AI[]={47,29,17,37,48,2,0};
		
		Sl.InsertionSort(AI);
	}

}
