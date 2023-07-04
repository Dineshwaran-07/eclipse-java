
	
	package learning.java;

	import java.util.Scanner;

	import org.testng.annotations.Test;

	public class scannerlearning {
		
	@Test

		public void test() {
			
			int a;
		
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		a = sc.nextInt();
		System.out.println("Enter the second number :");
		
		b = sc.nextInt();
		 if(a>b) {
			 System.out.println(a + "the number is greatest");
		 }
		 else {
			 System.out.println(b + "the number is bigger");
		 }
		}

	

}
