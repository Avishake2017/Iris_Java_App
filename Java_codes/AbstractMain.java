import java.util.*;
abstract class Instrument{
	abstract void play();
	}

class Piano extends Instrument{
	void play(){
	System.out.println("Tan Tan Tan Tan");
	}
}

class Flute extends Instrument{
	void play(){
	System.out.println("toot toot toot toot");
	}	
}

class Guitar extends Instrument{
	void play(){
	System.out.println("tin tin tin");
	}
}

class AbstractMain{
	public static void main(String[] args){
	
	Instrument Ins[]=new Instrument[10];
	Random rand = new Random();

	int rand1 = rand.nextInt(10);
	int rand2 = rand.nextInt(10);
	int rand3 = rand.nextInt(10);
	
	Ins[rand1] = new Piano();
	Ins[rand2] = new Guitar();
	Ins[rand3] = new Flute();
	
	//System.out.println(rand1 + " " + rand2+ " "+ rand3);
	
	Ins[rand1].play();
	Ins[rand2].play();
	Ins[rand3].play();
	}
}
	