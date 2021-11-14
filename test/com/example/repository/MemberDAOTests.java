package com.example.repository;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.example.domain.MemberVO;

// 테스트케이스 클래스
public class MemberDAOTests {
	
	// 픽스처(fixture)
	private MemberDAO memberDAO;
	
	// 샘플데이터 준비(fixture)
	private MemberVO memberVO1, memberVO2;
	
	@Before
	public void setUp() {
		memberDAO = MemberDAO.getInstance();
		
		memberVO1 = new MemberVO("aaa", "1234", "홍길동", "aaa@a.com", "Y", new Timestamp(System.currentTimeMillis()));
		memberVO2 = new MemberVO("bbb", "1234", "성춘향", "bbb@b.com", "N", new Timestamp(System.currentTimeMillis()));
	}
	
	@Test
	public void testConnection() {
		// DB접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "myuser";
		String passwd = "1234";
		
		try {
			// 1단계. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2단계. DB연결
			Connection con = DriverManager.getConnection(url, user, passwd);
			
			assertNotNull(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // testConnection
	
	@Test
	public void testDeleteAll() {
		memberDAO.deleteAll();
		
		int count = memberDAO.getCountAll();
		
		assertEquals(0, count);
	}
	
	
	@Test
	public void testInsert() {
		memberDAO.deleteAll();
		
		memberDAO.insert(memberVO1);
		assertEquals(1, memberDAO.getCountAll());
		
		memberDAO.insert(memberVO2);
		assertEquals(2, memberDAO.getCountAll());
		
		MemberVO dbMemberVO = memberDAO.getMemberById(memberVO2.getId());
		assertEquals(memberVO2.getName(), dbMemberVO.getName());
	} // testInsert
	
	@Test
	public void testGetMemberById() {
		memberDAO.deleteAll();
		
		memberDAO.insert(memberVO1);
		assertEquals(1, memberDAO.getCountAll());
		
		MemberVO dbMemberVO = memberDAO.getMemberById(memberVO1.getId());
		assertEquals(memberVO1.getName(), dbMemberVO.getName());
	} // testInsert
	
	
	public void testDeleteById() {
		memberDAO.deleteAll();
		
		memberDAO.insert(memberVO1);
		memberDAO.insert(memberVO2);
		assertEquals(2, memberDAO.getCountAll());
		
		memberDAO.deleteById(memberVO2.getId());
		assertEquals(1, memberDAO.getCountAll());
	}
	
	
	@Test
	public void testUpdateById() {
		memberDAO.deleteAll();
		
		memberDAO.insert(memberVO1);
		
		MemberVO updateMember = new MemberVO("aaa", "5678", "이몽룡", "aaa11@a11.com", "N", new Timestamp(System.currentTimeMillis()));
		
		memberDAO.updateById(updateMember);
		
		MemberVO dbMember = memberDAO.getMemberById(updateMember.getId());
		
		assertEquals(updateMember.getName(), dbMember.getName());
		assertEquals(updateMember.getEmail(), dbMember.getEmail());
	} // testUpdateById
	
	@Test
	public void testGetMembers() {
		memberDAO.deleteAll();
		
		List<MemberVO> list = memberDAO.getMembers();
		assertEquals(0, list.size());
		
		Random random = new Random();
		for (int i=0; i<10; i++) {
			// MemberVO 샘플 데이터 준비
			MemberVO member = new MemberVO();
			member.setId("user" + i);
			member.setPasswd("1234");
			member.setName("홍길동" + i);
			member.setEmail("aaa@a"+ i + ".com");
			member.setRecvEmail( (random.nextBoolean()) ? "Y"  : "N" );
			member.setRegDate(new Timestamp(System.currentTimeMillis()));
			
			// insert 메소드 테스트하기
			memberDAO.insert(member);
		} // for
		
		list = memberDAO.getMembers();
		assertEquals(10, list.size());
		
	} // testGetMembers
	
	
	
	
}




