package ArrayLearning;

public class ToCharArray {
	
	public static void main(String[] args) {
		 
		String s="Dineshwaran Elanchaliyan";
		char[] arrname=s.toCharArray();
		int max = 0;
		char maxchar;
		
		for (int i=1; i<arrname.length; i++)
				{
					maxchar=arrname[i];
					System.out.println(arrname[i]);
				}
	}

}
