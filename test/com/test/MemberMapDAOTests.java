package com.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import com.example.domain.MemberVO;

public class MemberMapDAOTests {

	// 픽스처
	private MemberMapDAO dao;

	private MemberVO member1, member2;

	@Before
	public void setUp() {
		dao = new MemberMapDAO();
		dao.deleteAll();

		member1 = new MemberVO("aaa", "1234", "홍길동", "aaa@a.com", "Y", new Timestamp(System.currentTimeMillis()));
		member2 = new MemberVO("bbb", "1234", "성춘향", "bbb@b.com", "N", new Timestamp(System.currentTimeMillis()));
	}

	@Test
	public void testDeleteAll() {
		dao.deleteAll();
		assertEquals(0, dao.getCountAll());
	}

	@Test
	public void testGetMembers() throws Exception {
		Object[] memberArr = { member1, member2 };

		dao.insert(member1);
		dao.insert(member2);

		Collection<MemberVO> collection = dao.getMembers();
		Object[] memberArr2 = collection.toArray();

		assertArrayEquals(memberArr, memberArr2);
	}

	@Test
	public void testGetMemberById() throws Exception {
		dao.insert(member1);

		MemberVO member = dao.getMemberById(member1.getId()); // 목적

		assertEquals(member1.toString(), member.toString());
	}

	@Test
	public void testInsert() throws Exception {
		dao.insert(member1); // 목적

		MemberVO member = dao.getMemberById(member1.getId());

		assertEquals(member1.toString(), member.toString());
	}

	@Test
	public void testUpdateById() throws Exception {
		dao.insert(member1);

		MemberVO member = new MemberVO("aaa", "1365", "고길동", "aoa@o.com", "N",
				new Timestamp(System.currentTimeMillis()));
		dao.updateById(member);

		MemberVO updateMember = dao.getMemberById(member.getId());

		assertEquals(member.toString(), updateMember.toString());
	}

	@Test(expected = Exception.class)
	public void testUpdateByIdException() throws Exception {
		dao.insert(member1);

		MemberVO member = new MemberVO("xyz", "1365", "고길동", "aoa@o.com", "N",
				new Timestamp(System.currentTimeMillis()));
		dao.updateById(member);
	}

	@Test
	public void testDeleteById() throws Exception {
		dao.insert(member1);
		dao.insert(member2);
		assertEquals(2, dao.getCountAll());

		dao.deleteById(member1.getId());
		assertEquals(1, dao.getCountAll());

		dao.deleteById(member2.getId());
		assertEquals(0, dao.getCountAll());
	}

}
