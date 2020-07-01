package runJava.ch22;

import java.lang.Character.UnicodeBlock;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//////************ JDBC******************
//********** �����ͺ��̽� ���� ��������*************
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
			
			
			System.out.printf("��ȣ \t�̸�\t\t ���̵� \t\t�н�����\t ���� \n");
			System.out.printf("-------------------------------------------------------\n");
			rs= stmt.executeQuery(sql); //***********�߿�*********************///
			
			
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
