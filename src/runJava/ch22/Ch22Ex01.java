package runJava.ch22;

import java.lang.Character.UnicodeBlock;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//////************ JDBC******************
//********** 데이터베이스 내용 가져오기*************
// ************exequteQuery

public class Ch22Ex01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user= "hr";
		String pwd = "hr";
		
		Connection con= null;
		Statement stmt= null;
		
		String sql;
		ResultSet rs= null;
		
		
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pwd);
			stmt = con.createStatement();
			
			sql="select * from tbl_customers";
			
			
			System.out.printf("번호 \t이름\t\t 아이디 \t\t패스워드\t 나이 \n");
			System.out.printf("-------------------------------------------------------\n");
			rs= stmt.executeQuery(sql); //***********중요*********************///
			
			
			while(rs.next()){
				String s_code= rs.getString("code");
				String s_name =rs.getString("name");
				String s_id =rs.getString("id");
				String s_pwd =rs.getString("pwd");
				int n_age = rs.getInt("age");
				
				System.out.printf("%s\t %s\t %s\t %s\t %s\t", s_code,s_name,s_id,s_pwd,n_age);
				System.out.println("");
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
