// URL: https://algospot.com/judge/problem/read/DRAWRECT

package Algorithm;

import java.util.Scanner;
import java.math.*;

public class Drawrect {

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in); // Reading from System.in
		
		int[] xpos = new int[4];
		int[] ypos = new int[4];
		
		for(int i=0;i<3;i++)
		{
			xpos[i] = reader.nextInt();
			ypos[i] = reader.nextInt();
		}
		
		if(xpos[0] == xpos[1])
		{
			xpos[3] = xpos[2];
			ypos[3] = Math.abs(ypos[0] - ypos[1]) + ypos[2];
		}else if(xpos[0] == xpos[2]){
			xpos[3] = xpos[1];
			ypos[3] = Math.abs(ypos[2] - ypos[0]) + ypos[1];
		}
		System.out.println(xpos[3] + " " + ypos[3]);
	}
}
