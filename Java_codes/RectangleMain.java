import java.util.InputMismatchException;
import java.util.Scanner;
class Rectangle{
	double length,breadth;
	double area;
	double perimeter;
	Rectangle(double length,double breadth){
	this.length = length;
	this.breadth = breadth;
		}
	void area(double length,double breadth){
		area = length*breadth;
		System.out.println("area:"+area);
	}
	void perimeter(double length,double breadth){
		
		perimeter = 2*(length + breadth);
		System.out.println("perimeter");
	}
	
	
}
class RectangleMain{
	public static void main(String[] args){
		double length=0,breadth=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length");
		try{
		length = s.nextDouble();
		}
		catch(InputMismatchException e){
			System.out.println("Something went Wrong"+"   "+"Enter valid Length");		
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height");
		try{
		breadth = sc.nextDouble();
		}
		catch(InputMismatchException e){
			System.out.println("Something went Wrong"+" "+ "Enter valid height");		
		}
		Rectangle R = new Rectangle(length,breadth);
		R.area(length,breadth);
		R.perimeter(length,breadth);
}		
		
}