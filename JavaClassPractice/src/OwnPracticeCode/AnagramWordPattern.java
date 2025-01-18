package OwnPracticeCode;

import java.util.HashMap;

public class AnagramWordPattern {
	
	static boolean AnagramWord(String one,String two){
		String arr[]=two.split(",");
		
		if(one.length()!=arr.length){
			return false;
		}
		
		HashMap<Character,String> HM=new HashMap<Character, String>();
		
		for(int i=0;i<arr.length;i++){
		char ch=one.charAt(i);
		boolean contkey=HM.containsKey(ch);
		boolean contvalue=HM.containsValue(arr[i]);
		
		if(contvalue && !contkey){
			return false;	
		} 
		if(contkey && !HM.get(ch).equals(arr[i])){
			return false;
		}else{
			HM.put(ch,arr[i]);
		}
		
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one="abba";
		String two="cat,dog,dog,cat";
		AnagramWord(one,two);
		System.out.println(AnagramWord(one,two));
	}

}
