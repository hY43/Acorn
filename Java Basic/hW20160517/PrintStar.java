package hW20160517;

public class PrintStar {
	int starCnt;
	
	PrintStar(int starCnt)
	{
		this.starCnt = starCnt;
	}
	
	public void print(){
		for(int i=0;i<starCnt;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
