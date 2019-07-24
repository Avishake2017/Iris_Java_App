import java.sql.*;

class JdbcDemo{
	public static void main(String[] args){
		
		try{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
			Statement st = conn.createStatement();
		
		ResultSet rs = st.executeQuery("select * from Departments");
		
		while(rs.next()){
			int id = rs.getInt(1);
			String name = rs.getString(2);
		
			System.out.println(id+" "+name);
			}
		
			conn.close();
		}
		catch(Exception e){
		e.printStackTrace();
		}
	}
}