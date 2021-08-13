package Array;

public class stringClass {

	public static void main(String[] args) {
		
		//charAt
		String str = "ABCDE";
		char ch = str.charAt(3);
		System.out.println(ch);
		
		//substring
		String str2 = "012345";
		String tmp = str2.substring(1,4);
		System.out.println(tmp);
		
		//toCharArray
		char[] chArr = {'A', 'B', 'C'};
		String str3 = new String(chArr);
		char[] tmp2 = str3.toCharArray();
		System.out.println(tmp2);

	}

}
