package HackerRank.ProblemSolving;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int one[][]= {{2,4},{4,6}};
		int two[][]= {{9,5},{6,1}};
		int res[][]=new int[2][2];
		
//		|2	4| |9	5| =|42	14|
//		|4	6| |6	1| =|72	26|
		
		for (int i = 0; i < one.length; i++) {
			
			for (int j = 0; j < two.length; j++) {
				
				for (int k = 0; k < res.length; k++) {
					
					res[i][j]+= one[i][k] * two[k][j];
					
				}
			}
			
		}
		

		for(int i=0;i<res.length;i++){
			for(int j=0;j<res.length;j++){
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
		
System.out.println("/n...transpose matrix...");

//	int res[][]= {{42,14},{72,26}};

		for(int i=0;i<res.length;i++){
			for(int j=i+1;j<res.length;j++){
				int temp=res[i][j];
				res[i][j]=res[j][i];
				res[j][i]=temp;
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
//		for(int[]I:res){
//			for(int j:I){
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
		

	}

}
