/*table user
	user_id int primary key
	email varchar2 unique
	password varchar2
	first name varchar2
	last name varchar2
create sequence named user_sequence starting from 1

java program
class DemoCode
	psvm
		enter the operation you want to perform
		1. sign in
		2. sign up
		if sign up
			then take all details
			and insert into database
		else
			take email and password 
 if matches then print welcome user name
	if not print invalid credentials
*/
import java.io.*;
import java.sql.*;
class DemoCode{
	public static void main(String[] args){
		try{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the operation you want to perform:");
		System.out.println("Press 1 to Sign up");
		System.out.println("Press 2 to Sign in");
		System.out.println("Press 3 to Update Info");
		System.out.println("Press 4 to Delete your account");
		int n = Integer.parseInt(br.readLine());
			if(n==1){
			System.out.println("Enter your email");	
			String email = br.readLine();
			

			System.out.println("Enter password");
			String password = br.readLine();
			
			
			System.out.println("Enter First_name");	
			String First_name = br.readLine();
			
			
			System.out.println("Enter Last_name");	
			String Last_name = br.readLine();
			
			PreparedStatement ps = conn.prepareStatement("insert into user_info values(seq1.nextval,?,?,?,?)");
			ps.setString(1,email);
			ps.setString(2,password);
			ps.setString(3,First_name);
			ps.setString(4,Last_name);
		
			int i = ps.executeUpdate();
			}
			
			else if(n==2){
			System.out.println("Enter your email");
			String email1 = br.readLine();
			System.out.println("Enter your password");
			String password1 = br.readLine();
			
			PreparedStatement ps1 = conn.prepareStatement("select * from user_info where email =?");
			ps1.setString(1,email1);
			
			
			ResultSet rst1 = ps1.executeQuery();
			while(rst1.next()){
			if(rst1.getString(2).equals(email1)){
				System.out.println("Valid email");
					}
			else
				System.out.println("Invalid email");
				}

			PreparedStatement ps2 = conn.prepareStatement("select * from user_info where password =?");
			ps2.setString(1,password1);
			ResultSet rst2 = ps2.executeQuery();

			while(rst2.next()){
			if(rst2.getString(1).equals(password1)){
				System.out.println("Valid password");
					}
				
			System.out.println("Welcome ");
					}
			
			}

			else if(n==3){
				System.out.println("What do you want to delete");
				System.out.println("Press 1 to update email");
				System.out.println("press 2 to update password");
				System.out.println("Press 3 to update First_name");
				System.out.println("Press 4 to update Last_name");
				
				int choice = Integer.parseInt(br.readLine());
				
				if(choice ==1){
					System.out.println("Enter new email:");
					String em = br.readLine();
					
					PreparedStatement ps4 = conn.prepareStatement("update user_info set email = ?");
					ps4.setString(1,em);
					int i = ps4.executeUpdate();
					}
				else if(choice ==2){
					System.out.println("Enter new password:");
					String p = br.readLine();
					
					PreparedStatement ps4 = conn.prepareStatement("update user_info set password = ?");
					ps4.setString(1,p);
					int i = ps4.executeUpdate();
					}
				else if(choice ==3){
					System.out.println("Enter new first_name:");
					String fname = br.readLine();
					
					PreparedStatement ps4 = conn.prepareStatement("update user_info set firstname = ?");
					ps4.setString(1,fname);
					int i = ps4.executeUpdate();
					}
				else if(choice ==4){
					System.out.println("Enter new last_name:");
					String lname = br.readLine();
					
					PreparedStatement ps4 = conn.prepareStatement("update user_info set lastname = ?");
					ps4.setString(1,lname);
					int i = ps4.executeUpdate();
					}
				}
			else if(n==4){
				System.out.println("Are you sure you want to delete your account");
				System.out.println("yes");
				System.out.println("no");
				String choice = br.readLine();
				if(choice.equals("yes")){
					
					System.out.println("Enter your user_id");
					int a=Integer.parseInt(br.readLine());
					PreparedStatement ps3 = conn.prepareStatement("delete from user_info where user_id = ?");
					ps3.setInt(1,a);
					System.out.println("Account deleted");
					int j = ps3.executeUpdate();
					
				}
			
				}
		}
				catch(Exception e){
					e.printStackTrace();
					}
				
			
	}
}

	