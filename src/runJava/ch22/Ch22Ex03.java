package runJava.ch22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ch22Ex03 {
	
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user= "hr";
		String pwd = "hr";
		
		
		Connection con= null;
		PreparedStatement pstmt= null;
		
		
		String sql;
		
		
		int n_age;
		String s_code, s_name, s_id, s_pwd, s_age;
		
		BufferedReader br;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pwd);
			
			sql ="delete from tbl_members where id=?";
			
			pstmt = con.prepareStatement(sql);
			
			
			System.out.println("회원 삭제를 위한 아이디를 입력해주세요.");
			
			System.out.print("아이디 >>>");
			
			s_id = br.readLine();
			
			
			
			pstmt.setString(1, s_id);
			
			int rs= pstmt.executeUpdate();
			if(rs==1){
				System.out.println(s_id + "회원이 삭제되었습니다.");
				
				
			} else {System.out.println("회원 삭제가 실패했습니다.");}
			
			
			
			
			
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
	
		
		
		
		
		
	}
	

}
