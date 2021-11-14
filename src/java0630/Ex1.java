package java0630;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex1 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "1234";
		
		Connection con = null;
		
		try {
			// 1단계. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계. DB연결(DB주소, DB아이디, DB비밀번호)
			con = DriverManager.getConnection(url, user, passwd);
			System.out.println("연결 성공!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 예외발생 여부 상관없이 정리작업
			try {
				if (con != null) {
					// 입출력 작업 객체는 운영체제 자원을 사용하므로
					// 사용이 끝나면 close()로 자원을 운영체제에게 반납해줘야 함.
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} // main

}
