package HackerRank.ProblemSolving;

public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {1,3,4,6,9,10};
		int l=0,r=1;
		int target=6;
		
		while(r<a.length) {
			if(a[r]==target) {
				System.out.println(r);
				break;
			}
			else if(a[l]==target) {
				System.out.println(l);
				break;
			}
			else if(a[l]<target && a[r]>target) {
				System.out.println(r);
				break;
			}
			l++;
			r++;
		
		}
	}

}
