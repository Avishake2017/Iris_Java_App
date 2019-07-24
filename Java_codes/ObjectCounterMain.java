class ObjectCounter{
	static int counter = 0;
	
	ObjectCounter(){
	   ++counter;
	}
	static int getObjectCount(){
		return counter;
		}
}
class ObjectCounterMain{
	public static void main(String[] args){
			int c=0;
			ObjectCounter obj = new ObjectCounter();
			c=obj.getObjectCount();
			ObjectCounter obj1 = new ObjectCounter();
			c=obj1.getObjectCount();
			System.out.println("Total objects used" + c);
	}
}