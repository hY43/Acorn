package d20160607;

import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptVO> list = dao.selectAll();
		// �� �μ� ���
/*		for(DeptVO vo : list){
			System.out.println("---------------------");
			System.out.println("�μ���ȣ: " + vo.getDeptno());
			System.out.println("�μ� ��: " + vo.getDname());
			System.out.println("�μ���ġ: " + vo.getLoc());
		}*/
		
		// Ư�� �μ� ���
/*		DeptVO vo = dao.selectOne(10);
		System.out.println("---------------------");
		System.out.println("�μ���ȣ: " + vo.getDeptno());
		System.out.println("�μ� ��: " + vo.getDname());
		System.out.println("�μ���ġ: " + vo.getLoc());*/
		
		// �Է�
/*		DeptVO vo = new DeptVO(99, "����", "��â");
		dao.insertOne(vo);*/

		// ����
		//dao.deleteOne(3);
		
		// ����
		/*DeptVO vo = new DeptVO(10,"ȸ��", "LA");
		dao.updateOne(vo);*/

		// �ڿ� ����
		// dao.close();
	}
}
