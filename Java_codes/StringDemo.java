import java.util.Scanner;
	
class StringDemo{
	public static void main(String[] args){
		 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1 = s.nextLine();
		System.out.println(s1);
		double n = s1.length;
			n/=2.0;
		for(int i=0; i<n;i++){
			s1 = s1.toUpperCase();
			}
		System.out.println(s1);
	}
}