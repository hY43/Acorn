package d20160525;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class PrintLotto_HashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int[] arr = new int[6];

		while (hs.size() < 6) {
			hs.add((int) (Math.random() * 45 + 1));
		}

		Iterator<Integer> it = hs.iterator();

		int i = 0;
		while (it.hasNext()) {
			arr[i] = it.next();
			i++;
		}
		
		Arrays.sort(arr);
		
		for(int j=0;j<arr.length;j++)
			System.out.print(arr[j] + " ");
	}
}
