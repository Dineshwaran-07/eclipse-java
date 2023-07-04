package learning.java;

import org.testng.annotations.Test;

public class CheckEvenorOddnumbers {
	
@Test
public  void evenoddcheck() {
		int n = 10;
		
		if (n%2==0) {
			
			System.out.println("Even Number");
		}
		
		else { 
			System.out.println("Odd Number");
		}
		
	}

}
