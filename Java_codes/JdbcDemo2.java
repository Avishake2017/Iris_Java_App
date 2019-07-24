import java.sql.*;
class JdbcDemo2{
	public static void main(String[] args){
		
		try{
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			Statement st = conn.createStatement();
			int i = st.executeUpdate("insert into Departments values(2880,'FD_BK',200,1700)");
			if(i!=0){
			System.out.println(i+"record affected");
			}
				}
			catch(Exception e){
				e.printStackTrace();
		}
}
}