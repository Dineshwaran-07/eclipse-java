package StringsLearning;

public class StringsSample {

	public static void main(String[] args) 
	
	{

	String s1 = "Dinu";
	String s2 = "Dinu";
	String s3 = new String ("Dinu");
	

	if (s1.contentEquals(s3));
		
	System.out.println("The address is :" + s1.hashCode());
	System.out.println("The address is :" + s2.hashCode());
	System.out.println("The address is :" + s3.hashCode());
	}
}