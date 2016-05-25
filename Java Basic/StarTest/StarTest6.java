package StarTest;

public class StarTest6 {
	/* Member Variable */
	int starCnt; // ����ڷκ��� �Է�
	
	/* Constructor */
	StarTest6()
	{
		this.starCnt = starCnt;
	}
	
	/* Member Method */
	public void star()
	{
		int left = starCnt;
		int right = starCnt;
		int totalLen = starCnt*2+1; // ��ü ��� Line ��
		for(int i=0;i<totalLen;i++)
		{
			for(int j=0;j<totalLen;j++)
			{
				if(j > left && j < right)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
			if(i<starCnt)
			{
				left--;
				right++;
			}
			else
			{
				left++;
				right--;
			}
		}
	}
}
