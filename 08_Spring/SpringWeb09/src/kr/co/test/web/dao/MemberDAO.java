package kr.co.test.web.dao;

import java.sql.Connection;

import kr.co.test.web.dto.MemberDTO;

public class MemberDAO {
	String driver = "";
	String url = "";
	
	Connection conn;
	
	public MemberDAO(){}
	
	public boolean selectOne(MemberDTO dto){
		/*DB에 해당 계정이 있는지 확인*/
		return false;
	}
	public void insertOne(MemberDTO dto){
		System.out.println("멤버 추가함");
	}
}
