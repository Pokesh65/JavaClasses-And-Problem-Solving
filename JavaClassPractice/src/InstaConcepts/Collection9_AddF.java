package InstaConcepts;

import java.util.LinkedList;

public class Collection9_AddF {

		//new methods that not in ArrayList
		//add, addFirst, addLast
		//remove, removeFirst, removeLast
		//peek, peekFirst, peekLast
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> l=new LinkedList<Integer>();
				
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.addLast(40);
		l.addFirst(5);
		System.out.println(l);
		l.add(3,60);
//		l.remove();
//		l.removeFirst();
//		l.removeLast();
		System.out.println(l);
		l.set(3, 25);
		System.out.println(l);
		
		//Both get and peek method are same 
		
		System.out.println(l.get(2));
		System.out.println(l.peek());
		System.out.println(l.getFirst());
		System.out.println(l.peekFirst());
		System.out.println(l.getLast());
		System.out.println(l.peekLast());
		
//		l.clear();
//		System.out.println(l);
		
		System.out.println(l.contains(25));
		l.add(25);
		System.out.println(l);
		
		
		
		
		
		
	}

}