import java.util.*;
class Employee implements Comparable<Employee>{
	int emp_id;
	String name;
	Employee(int emp_id,String name){
		this.emp_id = emp_id;
		this.name = name;
	}
	public String toString(){
		return name +" " + emp_id;
		}	

	public int compareTo(Employee e){
		String name1 = e.name;
		return e.name.compareTo(name1);
		
		}

}
/*class CompareEmployee implements Comparator<Employee>{
		
		public int compare(Employee e1,Employee e2){
			return e1.name.compareTo(e2.name);
			}

}*/

class LinkedListDemo {
	public static void main(String[] args){
		CompareEmployee C = new CompareEmployee();
		LinkedList<Employee>LL = new LinkedList<Employee>();
			LL.add(new Employee(1,"Avishake"));
			LL.add(new Employee(2,"Ram"));
			LL.add(new Employee(3,"Shyam"));
			LL.add(new Employee(4,"Tom"));
			LL.add(new Employee(5,"Jerry"));
	// using iterator
	
			Iterator itr = LL.iterator();
			System.out.println("---------------------------------");
				while(itr.hasNext())
         			System.out.println(itr.next());
		
				
		
			Collections.sort(LL,C);
			System.out.println("---------------------------------");
			for(Employee e3:LL)
			System.out.println(e3);
			System.out.println("---------------------------------");
	}
}
	