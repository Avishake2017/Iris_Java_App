import java.util.*;

class HashsetMain{
	public static void main(String[] args){
	
		HashSet<String> h = new HashSet<String>();
	
		h.add("A");
		h.add("F");
		h.add("C");
		h.add("D");
		h.add("E");
		
	Iterator itr = h.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());
	
		
	System.out.println(h.contains("A"));

	TreeSet<String> hToT = new TreeSet<String>(h); 
	
	while(itr.hasNext())
	System.out.println(itr.next());
	
	Iterator its= hToT.descendingIterator();
	while(its.hasNext())
	System.out.println(its.next());
	}
}