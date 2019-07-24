//create a user defined exception class names as out of range exception 
//create a class student which is having instance variable name , mark 1 ,mark2,mark3 
//create one parameterised const and a method which prints the average marks of student as 85 or the calculated average
// now write a main class which takes name and marks from the cmd arg and call the average marks method 
//handle all the exceptions
//----------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
import java.util.InputMismatchException;
class OutOfRangeException extends Exception{
	public String toString(){
	return "Enter a valid range";
	}
}

class Student{
	String name;
	int mark1,mark2,mark3;
	double average;
	
	double average(int mark1,int mark2,int mark3){
		return (mark1+mark2+mark3)/3.0;
		}

	
	Student(String name,int mark1,int mark2,int mark3)throws OutOfRangeException{
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.average = average(mark1,mark2,mark3);
		
		if(this.mark1>100 || this.mark1<0 || this.mark2>100 || this.mark2<0 || this.mark3>100 || this.mark3<0)
			throw new OutOfRangeException(); 
	}
	
	
	void printDetails(){
		System.out.println(name);
		System.out.println(mark1);
		System.out.println(mark2);
		System.out.println(mark3);
		System.out.println(average);
		}
		
}
class StudentMain{
	public static void main(String[] args){
		String name;
		int mark1=0,mark2=0,mark3=0;	
		name  = args[0];
		Student s;
		try{
		
		mark1  = Integer.parseInt(args[1]);
		mark2  = Integer.parseInt(args[2]);	
		mark3 = Integer.parseInt(args[3]);
		s =new Student(name,mark1,mark2,mark3);
		s.printDetails();
		}
		catch(NumberFormatException|OutOfRangeException e){
		if(e instanceof NumberFormatException)
			System.out.println("Enter valid marks");
		
		else
			System.out.println(e);
			}	
		
		
		}
}