package java0630;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

/*

SELECT *  -- (3)
FROM members  -- (1)
WHERE member_id >= 900 -- (2)
AND gender = 'M'
AND first_name LIKE '%m%'
ORDER BY member_id DESC;  -- (4)

*/
public class Ex4 {

	public static void main(String[] args) {
		// DB접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "1234";
		
		// JDBC
		Connection con = null; // 접속
		PreparedStatement pstmt = null; // sql문장객체 타입
		// PreparedStatement는 값이 올 자리를 ?로 마킹하고 값을 채워서 실행하는 방식으르 제공함
		ResultSet rs = null; // select문 실행결과를 담고있는 결과집합 타입
		
		// 검색에 사용할 데이터(사용자가 입력하는 데이터로 가정함)
		int searchId = 900;
		String searchGender = "M";
		String searchFname = "m";
		
		try {
			// 1단계. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계. DB연결
			con = DriverManager.getConnection(url, user, passwd);
			
			// 3단계. sql 생성
			String sql = "";
			sql  = "SELECT * ";
			sql += " FROM members ";
			sql += " WHERE member_id >= ? ";
			sql += " AND gender = ? ";
			sql += " AND first_name LIKE ? ";
			sql += " ORDER BY member_id DESC ";
			
			// sql문장객체 준비
			pstmt = con.prepareStatement(sql);
			
			// pstmt의 ?자리에 데이터 설정. ?가 없는 문장이면 데이터 설정작업은 필요없음.
			pstmt.setInt(1, searchId);
			pstmt.setString(2, searchGender);
			pstmt.setString(3, "%" + searchFname + "%");
			
			// 4단계. sql문 실행
			//        sql select문이 DB서버에 전송 후 결과를 ResultSet 타입으로 받음
			//        executeQuery()는 select문 수행할때 호출함
			rs = pstmt.executeQuery();
			
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
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	} // main

}





