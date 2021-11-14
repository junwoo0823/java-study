package java0630;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class Ex2 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "1234";
		
		Connection con = null; // 접속
		Statement stmt = null; // sql문장객체 타입
		ResultSet rs = null; // select문 실행결과를 담고있는 결과집합 타입
		
		try {
			// 1단계. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계. DB연결
			con = DriverManager.getConnection(url, user, passwd);
			
			// 3단계. sql 생성
			String sql = "SELECT * FROM members ORDER BY member_id DESC";
			
			// sql문장객체 준비
			stmt = con.createStatement();
			
			// 4단계. sql문 실행
			//        sql select문이 DB서버에 전송 후 결과를 ResultSet 타입으로 받음
			rs = stmt.executeQuery(sql);
			
			// 5단계. rs 데이터를 꺼내서 사용
			while (rs.next()) {
				// rs 내부에 있는 커서가 가리키는 행을 기준으로
				// 각 열단위로 데이터를 가져옴
				int memberId = rs.getInt("member_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String gender = rs.getString("gender");
				Timestamp dob = rs.getTimestamp("dob");
				String email = rs.getString("email");
				
				System.out.println(memberId + ", " + firstName + ", " + lastName + ", " 
									+ gender + ", " + dob.toString() + ", " + email);
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// JDBC 자원 닫기 (사용의 역순으로 닫음)
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	} // main

}





