package d20160510;


// break: ���� ����� �ݺ����� Ż����.
// continue: �̹��� ����.
// break Label: Label�� ���� �ݺ����� Ż��.
// continue Label: Label ���� ���� �ݺ������� �̹��� ����.
public class StatementEx13 {
	public static void main(String[] args) {
		outer: // Label: �ٱ��� �ݺ����� �̸��� ����.
		for (int j = 1; j <= 3; j++) {
			for (int i = 1; i <= 4; i++) {
				//if(i==j) break; // i�� ���� �ݺ��� Ż��.
				//if(i==j) continue; // i�� ���� �ݺ��� �̹��� ������ ���� ī��Ʈ ����.
				//if(i==j) continue outer; // j�� ���� �ݺ����� Ż���ؼ� outer Label ��ġ�� �̵�.
				if(i==j) break outer;
				System.out.println("i: " + i + " j: " + j);
			}
		}
		
		System.out.println("---------------------------------------------------");
		
		for(int j=1;j<=4;j++)
		{
			for(int i=1;i<=4;i++)
			{
				System.out.print("*"); // * ���� ���.
				if(i>=j) break; // �Ѱ��� j�� i�� 1~4���� ��ȭ�ϸ� *���ڸ� ��µ� i>=j��� ������ �ξ� �� Line���� �Ѱ��� *���ڰ� �þ���� �Ѵ�.
			}
			System.out.println();
		}
	}
}
