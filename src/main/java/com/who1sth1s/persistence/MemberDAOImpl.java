package com.who1sth1s.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.who1sth1s.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.who1sth1s.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".getTime") ;
	}

	@Override
	public void insertMember(MemberVO memberVO) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".insertMember", memberVO);
	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectMember", userid);
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("userid",userid);
		paramMap.put("userpw", userpw);
		
		return sqlSession.selectOne(namespace + ".readWithPW", paramMap);
	}

}