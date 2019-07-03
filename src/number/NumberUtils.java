package number;

import string.StringUtils;

public class NumberUtils {
	public static int pow(int x, int y) {
		// calculate x**y
		if (y == 0)
			return 1;
		int result = x;
		for (int i = 0; i < y; i++) {
			result *= x;
		}
		return result;
	}

	public static String toBinary(int n) {
		String binaryString = "";
		while (n > 0) {
			binaryString += n % 2;
			n /= 2;
		}
		return StringUtils.reverse(binaryString);
	}
}
