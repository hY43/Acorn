package d20160520;

// Frame Class�� ����ϴµ� �ʿ��� API import
import java.awt.Frame;

//�ڹپ��� ���� ���Ǵ� Ŭ������ java.lang package�� �ִµ� java.lang package�� ���ԵǴ� class�� apiimport�� ������ �� �ִ�.

public class MyWin extends Frame{
// Window â�� ����� ���� Frame Class�� ��� �޾� ����ϴ� MyWin Class.
	
	/* Constructor */
	public MyWin()
	{
		super("���� ���� ������"); // �θ� ������ ȣ��.
		// Window â ���̵��� ����
		super.setVisible(true); // Frame�� �θ� Ŭ������ Window Class�� �ִ� setVisible Method�� ȣ���Ͽ� Window â�� ���� ���̵��� ����.
		// â ũ�� ����
		// �ʺ� 400 ���� 300
		super.setSize(400,300);
		// â�� ��ġ�� x 300 y 300���� �̵� ���Ѽ� ���
		super.setLocation(300,300);
		// Ÿ��Ʋ �ֱ�
		//super.setTitle("�Ϸ��� ���� ����?");
	}
	
}
