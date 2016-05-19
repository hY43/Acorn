package StarTest;

public class StarTest6 {

	int input;

	StarTest6(int input) {
		this.input = input;
	}

	public void printStar() {
		int arrLen = input * 2 + 1;
		int left = input;
		int right = input;
		for (int i = 0; i < arrLen; i++) {
			for (int j = 0; j < arrLen; j++) {
				if (left < j && right > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

			if (i < input) {
				left--;
				right++;
			} else {
				left++;
				right--;
			}

		}

	}
}
