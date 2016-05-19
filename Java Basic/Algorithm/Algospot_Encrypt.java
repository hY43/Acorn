package Algorithm;

import java.util.Scanner;

public class Algospot_Encrypt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i <= t; i++) {
			String str = sc.nextLine();
			char[] target = str.toCharArray();
			for(int j=0;j<str.length();j++)
				if(j%2==0)
					System.out.print(target[j]);
			for(int j=0;j<str.length();j++)
				if(j%2!=0)
					System.out.print(target[j]);
		}
		
	}
}
