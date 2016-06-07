package d20160607;

import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptVO> list = dao.selectAll();
		// 전 부서 출력
/*		for(DeptVO vo : list){
			System.out.println("---------------------");
			System.out.println("부서번호: " + vo.getDeptno());
			System.out.println("부서 명: " + vo.getDname());
			System.out.println("부서위치: " + vo.getLoc());
		}*/
		
		// 특정 부서 출력
/*		DeptVO vo = dao.selectOne(10);
		System.out.println("---------------------");
		System.out.println("부서번호: " + vo.getDeptno());
		System.out.println("부서 명: " + vo.getDname());
		System.out.println("부서위치: " + vo.getLoc());*/
		
		// 입력
/*		DeptVO vo = new DeptVO(99, "개발", "평창");
		dao.insertOne(vo);*/

		// 삭제
		//dao.deleteOne(3);
		
		// 변경
		/*DeptVO vo = new DeptVO(10,"회계", "LA");
		dao.updateOne(vo);*/

		// 자원 정리
		// dao.close();
	}
}
