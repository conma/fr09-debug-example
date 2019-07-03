package main;

import number.NumberUtils;
import string.StringUtils;

public class Main {
	public static void main(String[] args) {
		// Tính và in ra 2 mũ (vị trí thứ 2 của số 0 trong dãy nhị phân của n)
		// Nếu không tìm được vị trí của số 0 thứ 2 trong dãy nhị phân, in ra -1
		int x = 380;
		String binary = NumberUtils.toBinary(x);
		int y = findSecondZeroPosition(binary);
		System.out.println(customPow(2, y));
	}

	private static int customPow(int x, int y) {
		if (y == -1)
			return -1;
		else
			return NumberUtils.pow(x, y);
	}

	private static int findSecondZeroPosition(String input) {
		int breakNumber = 2;
		int len = input.length();
		String reverse = StringUtils.reverse(input);
		for (int i = 0; i < len - 1; i++) {
			if (reverse.charAt(i) == '0')
				breakNumber--;
			if (breakNumber == 0)
				return i;
		}
		return -1;
	}
}
