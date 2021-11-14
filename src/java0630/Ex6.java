package java0630;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import domain.MembersVO;

/*

UPDATE members
SET first_name = ?, last_name = ?, gender = ?, dob = ?, email = ?
WHERE member_id = ?;

*/
public class Ex6 {

	public static void main(String[] args) {
		// DB접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "1234";
		
		// JDBC
		Connection con = null; // 접속
		PreparedStatement pstmt = null; // sql문장객체 타입
		// PreparedStatement는 값이 올 자리를 ?로 마킹하고 값을 채워서 실행하는 방식으르 제공함
		
		// 수정(update)에 사용할 데이터(사용자가 입력하는 데이터로 가정함)
		MembersVO membersVO = new MembersVO();
		membersVO.setMemberId(1001);
		membersVO.setFistName("춘향");
		membersVO.setLastName("성");
		membersVO.setGender("F");
		membersVO.setDob(new Timestamp(System.currentTimeMillis()));
		membersVO.setEmail("sungchunhyang@daum.net");
		
		try {
			// 1단계. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2단계. DB연결
			con = DriverManager.getConnection(url, user, passwd);
			
			// 3단계. sql 생성
			String sql = "";
			sql  = "UPDATE members ";
			sql += "SET first_name = ?, last_name = ?, gender = ?, dob = ?, email = ? ";
			sql += "WHERE member_id = ? ";
			
			// sql문장객체 준비
			pstmt = con.prepareStatement(sql);
			
			// pstmt의 ?자리에 데이터 설정. ?가 없는 문장이면 데이터 설정작업은 필요없음.
			pstmt.setString(1, membersVO.getFistName());
			pstmt.setString(2, membersVO.getLastName());
			pstmt.setString(3, membersVO.getGender());
			pstmt.setTimestamp(4, membersVO.getDob());
			pstmt.setString(5, membersVO.getEmail());
			pstmt.setInt(6, membersVO.getMemberId());
			
			// 4단계. sql문 실행. executeUpdate()는 insert, update, delete문 수행시 호출함
			int count = pstmt.executeUpdate(); // 변경된 행의 개수를 리턴해줌
			System.out.println("count : " + count);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// JDBC 자원 닫기 (사용의 역순으로 닫음)
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	} // main

}





