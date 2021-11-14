package com.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.example.domain.MemberVO;

public class MemberMapDAO {

	// 키는 아이디, 값은 VO객체
	private Map<String, MemberVO> map = new HashMap<>();

	public void deleteAll() {
		map.clear();
	}

	public int getCountAll() {
		return map.size();
	}

	public Collection<MemberVO> getMembers() {
		return map.values();
	}

	public MemberVO getMemberById(String id) {
		return map.get(id);
	}

	public void insert(MemberVO memberVO) throws Exception {
		if (map.containsKey(memberVO.getId())) {
			throw new Exception("이미 존재하는 아이디입니다.");
		}
		map.put(memberVO.getId(), memberVO);
	}

	public void updateById(MemberVO memberVO) throws Exception {
		if (!map.containsKey(memberVO.getId())) {
			throw new Exception("수정할 아이디가 존재하지 않습니다.");
		}
		map.put(memberVO.getId(), memberVO);
	}

	public void deleteById(String id) {
		map.remove(id);
	}

}
