import java.sql.*;
import java.io.*;

class JdbcDemo3{
	public static void main(String[] args){
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter the student id:");
			int id = Integer.parseInt(br.readLine());
			
			System.out.println("Enter the Student Name:");
			String name= br.readLine();
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			PreparedStatement ps = conn.prepareStatement("insert into Student values(?,?)");
			
			ps.setInt(1,id);
			ps.setString(2,name);
			
			int i = ps.executeUpdate();
		
			if(i!=0){
				System.out.println(i+ "   recors Affected");
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
