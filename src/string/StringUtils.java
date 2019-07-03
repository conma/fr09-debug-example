package string;

public class StringUtils {
	public static String reverse(String input) {
		char[] charArray = input.toCharArray();
		int strLength = charArray.length;
		String output = "";
		for (int i = strLength - 1; i > 0; i--) {
			output += charArray[i];
		}
		return output;
	}

}
