import java.util.Date;
import java.time.LocalTime;
class MyThreadMain {
	public static void main(String[] args){
		Thread t1 = Thread.currentThread();
		t1.setName("MyThread");
		System.out.println(t1.getName());
		
		Date date = new Date();
		System.out.println(date);

		LocalTime tm = LocalTime.now();
		int hr = tm.getHour();
		int min = tm.getMinute();
		int sec = tm.getSecond();
		System.out.printf("%d:%d:%d",hr,min,sec);
	
		try{
			t1.sleep(10000);
		}
		catch(Exception e){
			System.out.println(e);
			}
		LocalTime tm1 = LocalTime.now();
		int hr1 = tm1.getHour();
		int min1 = tm1.getMinute();
		int sec1 = tm1.getSecond();
		System.out.println("\n");
		System.out.printf("%d:%d:%d",hr1,min1,sec1);
			
	}
}