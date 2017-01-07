package com.who1sth1s.persistence;

import com.who1sth1s.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();
	
	public void insertMember(MemberVO memberVO);
	
	public MemberVO readMember(String userid) throws Exception;
	
	public MemberVO readWithPW(String userid, String userpw) throws Exception;
	
}