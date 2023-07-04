package StringsLearning;

public class StringtoStringBuffer {
	
	public static void main(String[] args) {
		
		String str = "Hello";
		StringBuffer strbuff = new StringBuffer("Java" + str);
		System.out.println("str is : " +str);
		System.out.println("strbuff is :" + strbuff);
	}

}
