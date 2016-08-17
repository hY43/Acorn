package kr.co.test.app.dao;

import java.util.ArrayList;

import kr.co.test.app.vo.DeptVO;

public class MySqlDAO implements CommonDAO{

	@Override
	public void connection() {
		System.out.println("MySQL db에 연결됨.");
	}

	@Override
	public void insert(DeptVO vo) {
		System.out.println("dept 테이블 데이터 추가");
	}

	@Override
	public void update(DeptVO vo) {
		System.out.println("dept 테이블 데이터 변경");
	}

	@Override
	public void delete(int no) {
		System.out.println("dept 테이블 데이터 삭제");
	}

	@Override
	public DeptVO selectOne(int no) {
		System.out.println("dept 테이블 데이터 한건 조회");
		return null;
	}

	@Override
	public ArrayList<DeptVO> selectAll() {
		System.out.println("dept 테이블 데이터 전체 조회");
		return null;
	}

	@Override
	public void close() {
		System.out.println("자원 반납");
	}

}
