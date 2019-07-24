import java.util.*;
class RandFact{
	boolean flag = false;

	int rand;

	synchronized void generate(){
		if(flag == true){
			try{
				wait();
				}catch(Exception e){
					e.printStackTrace();
							}
		}
			
			Random rObj = new Random();
			this.rand = rObj.nextInt(7);
			
			System.out.println("Random Number : "+rand);
			flag = true;
			notify();
	
		}
	
	synchronized void calcFactorial(){
		if(flag == false){
			try{
				wait();
			}catch(Exception e){
				e.printStackTrace();
				}
		}
		if(rand==0 || rand==1)
			System.out.println("Factorial of n is : "+" "+"1");
		
		else{
			
		int fact = 1;
			for(int i=1;i<=rand;i++){
				fact=fact*i;
				}
			
			System.out.println(fact);
	}
	flag = false;
			notify();
}
}
class RandomThread extends Thread{
	RandFact rt;
	RandomThread(RandFact r){
		rt = r;
		}
	public void run(){
		for(int i=0;i<10;i++)
			rt.generate();
		}

	}
		
class FactThread extends Thread{
	RandFact ft;
	FactThread(RandFact f){
		ft = f;
		}
	public void run(){
		for(int i=0;i<10;i++)
			ft.calcFactorial();
		}

	}

class RandomFactorial{
	public static void main(String[] args){
		RandFact obj = new RandFact();
	
		RandomThread t1 = new RandomThread(obj);
		FactThread t2 = new FactThread(obj);

		t1.start();
		t2.start();
	}
}		