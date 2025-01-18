package HackerRank.ProblemSolving;

public class StringLargestandSamllest {

	 static String getSmallestAndLargest(String s, int k) {
	    String smallest = s.substring(0,k);
	    String largest = s.substring(0,k);
	    String dummyString = "";

	    for (int i=0; i<=s.length()-k; i++){
	        dummyString = s.substring(i, i+k);
	        if(dummyString.compareTo(largest)>0){
	            largest = dummyString;
	        }            
	        if(dummyString.compareTo(smallest)<0){
	            smallest = dummyString;
	        }            
	    }
	    return smallest+"\n"+largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss=getSmallestAndLargest("welcometojava",3);
		System.out.println(ss);
	}

}
