class DemoThread1 implements Runnable{
	DemoThread1(){
	Thread t = new Thread(this);
	t.start();
	
	}
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println("running child thread in loop:"+i+" "+Thread.currentThread().getName());
		try{
		Thread.sleep(2000);
		}catch(Exception e){
		System.out.println(e);
		}
		}
			
	}
}
class ThreadMain2{
	public static void main(String[] args){
		
		DemoThread1 t1 = new DemoThread1();
		DemoThread1 t2 = new DemoThread1();
		DemoThread1 t3 = new DemoThread1();
		
		
	}
}