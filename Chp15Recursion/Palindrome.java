
public class Palindrome {
	
	public static boolean checkPalindrome(String str) {
		/*
		 * Return true if str is a palindrome.
		 */
		if (str.length() <= 1) {
			return true;
		} else {
			boolean firstEqualsLast = 
				(str.charAt(0) == str.charAt(str.length() - 1));
//			System.out.println(str);
//			System.out.println(str.length());
			boolean middlePart = checkPalindrome(str.substring(1, str.length()-1));
			return firstEqualsLast && middlePart;
		}
	}

	public static void main(String[] args) {
		String str1 = "hannah";
		System.out.println(checkPalindrome(str1));
		String str2 = "abcde";
		System.out.println(checkPalindrome(str2));

	}

}
