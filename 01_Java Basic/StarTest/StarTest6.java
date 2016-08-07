package StarTest;

public class StarTest6 {
	/* Member Variable */
	int starCnt; // 사용자로부터 입력
	
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
		int totalLen = starCnt*2+1; // 전체 출력 Line 수
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
