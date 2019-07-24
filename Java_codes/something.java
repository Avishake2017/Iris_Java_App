abstract class Animal{
	protected int legs;

	protected Animal(int legs){
		this.legs = legs;
		walk(legs);
	}
	
	abstract void eat();

	public void walk(int legs){
		System.out.println("Animal walks : "+legs+" no of legs");
		}
}

class Spider extends Animal {
	
	Spider(){
	super(8);	
	}
	
	void eat(){
		System.out.println("cat eats fishes");
	}
}

Interface Pet{
	String getName();
	void setName(String name);
	void play();
	}

class Cat extends Animal implements Pet{
	private String nameofPet;
	Cat(String nameofPet){
		super(4);
		this.nameofPet = nameofPet;  //fluffy
		
	}
	public Cat(){
		this(" ");
	
	}
	 public void setName(String name){
		nameofPet = name;
		}
	public void getName(){
	    return nameofPet;
	}
	void play(){
	System.out.println(");
	}
	void {
	}
	}
	
class Fish extends Animal{
	Fish(){
	super(0);
	}
	void eat(){
		System.out.println("fish eat small insects")
	}
	void walk(){
		System.out.println("Fish cant walk");
		}
	
	}
class TestAnimals{
	public static void main(String[] args){
	
	Fish d= new Fish();
	d.walk();
	Cat c = new Cat("Fluffy");
	Animal a = new Fish();
	Animal e = new Spider();
	Pet p =new Cat();
	}
}