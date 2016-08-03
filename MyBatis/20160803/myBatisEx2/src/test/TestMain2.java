package test;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.EmpVO;

public class TestMain2 {
	public static void main(String[] args) throws IOException {
		// 1. MyBatis 설정 xml 파일 읽기(공장 설계도)
		
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(r);
		SqlSession ss = ssf.openSession(true);
		
		List<EmpVO> list = ss.selectList("empAll");
		for(EmpVO vo : list){
			System.out.println("==========================");
			System.out.println("사원번호: " + vo.getEmpno());
			System.out.println("사원이름: " + vo.getEname());
			System.out.println("부서번호: " + vo.getDeptno());
		}
		
/*		System.out.println("==========================================");
		Scanner sc = new Scanner(System.in);
		System.out.println("사원번호를 입력하세요: ");
		int empno = sc.nextInt();
		EmpVO vo = ss.selectOne("empOne", empno);
		
		System.out.println("사원번호: " + vo.getEmpno());
		System.out.println("사원이름: " + vo.getEname());
		System.out.println("부서번호: " + vo.getDeptno());
*/		
/*		System.out.println("==========================================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사원번호를 입력하세요: ");
		BigDecimal empno = sc.nextBigDecimal();
		System.out.println("사원이름을 입력하세요: ");
		String ename = sc.next();
		System.out.println("사원직책을 입력하세요: ");
		String job = sc.next();
		EmpVO vo = new EmpVO(empno, ename, job);
		ss.insert("insertOne", vo);*/
		
		System.out.println("==========================================");
		
		System.out.println("사원번호를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int empno = sc.nextInt();
		ss.delete("deleteOne", empno);
		
		ss.close();
	}
}
