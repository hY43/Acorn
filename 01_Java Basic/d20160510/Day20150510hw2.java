package d20160510;
import java.util.Scanner;

// ����2 . ����, ���� , ���� ������ �Է� �޾� ������ ����� ����ϼ��� 
// Day20150510hw2 Class Start.
public class Day20150510hw2 {
	// Main Method Start.
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); // ����ڷκ��� ���� �Է� �ޱ� ���� �͹̳� ����.
		System.out.print("���� ����: ");
		int kor = sc.nextInt(); // ���� �Է� �޾� kor ������ ����(���� ����)
		System.out.print("���� ����: ");
		int eng = sc.nextInt(); // ���� �Է� �޾� eng ������ ����(���� ����)
		System.out.print("���� ����: ");
		int math = sc.nextInt(); // ���� �Է� �޾� math ������ ����(���� ����)
		
		int total = kor + eng + math; // �������� ���� �հ踦 ���� ��, int Type ���� total�� ����.
		float avg = total/3; // total�� ���� ���� 3���� ���� ����� ���ϴµ�, ����� �Ҽ����� �����ϹǷ� float Type�� ���� avg�� �����Ͽ� �����Ѵ�.
		
		System.out.println("----------"); // ��� ���.
		System.out.println("����: " + total);
		System.out.println("���: " + avg);
	}
	// Main Method End.
}
//Day20150510hw2 Class End.