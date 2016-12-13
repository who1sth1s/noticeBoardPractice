package com.who1sth1s.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.who1sth1s.domain.MemberVO;
import com.who1sth1s.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO memberDAO;
	
	@Test
	public void testTime() throws Exception {
		
		System.out.println(memberDAO.getTime());
		
	}
	
	@Test
	public void testInsertMember() throws Exception {
		
		MemberVO memberVO = new MemberVO();
		memberVO.setUserid("user03");
		memberVO.setUserpw("user00");
		memberVO.setUsername("USER00");
		memberVO.setEmail("user00@aaa.com");

		memberDAO.insertMember(memberVO);
		
	}
	
	@Test
	public void testReadMember() throws Exception {
		memberDAO.readMember("user01");
	}
	
}