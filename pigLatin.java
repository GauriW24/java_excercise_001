public class pigLatin {

	public static void main(String[] args) {
		String inStr = "Hello";
		
		char out = inStr.charAt(0);
		
		String outStr = inStr.substring(1);
		
		outStr = outStr + out +"ay";
		
		System.out.println("Input: " + inStr);
		System.out.println("Output: " + outStr);
	}

}
