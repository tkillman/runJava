package runJava.ch22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ch22Ex02 {
	
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user= "hr";
		String pwd = "hr";
		Connection con= null;
		PreparedStatement pstmt= null;
		String sql;
		ResultSet rs= null;
		
		int n_age;
		String s_code, s_name, s_id, s_pwd, s_age;
		
		BufferedReader br;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pwd);
			
			sql ="insert into tbl_members values(?,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			
			
			System.out.println("회원 가입을 위한 정보를 입력해주세요.");
			System.out.print("번호 >>>>");
			s_code= br.readLine();
			System.out.print("이름 >>>");
			s_name = br.readLine();
			System.out.print("아이디 >>>");
			s_id = br.readLine();
			System.out.print("패스워드 >>>");
			s_pwd = br.readLine();
			System.out.print("나이 >>>");
			s_age = br.readLine();
			n_age=Integer.parseInt(s_age);
			
			pstmt.setString(1, s_code);
			pstmt.setString(2, s_name);
			pstmt.setString(3, s_id);
			pstmt.setString(4, s_pwd);
			pstmt.setInt(5, n_age);
			
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
	}

}
