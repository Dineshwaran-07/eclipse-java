package Assigment;

public class PrintAllPrimeNumber {

	public static void main(String[] args) {
	int n = 100, P;

	    System.out.println("The Prime Numbers between 1 to 100 is : ");

	for (int i = 2; i <= n; i++) {
	P = 0;

	for (int j = 2; j <= i / 2; j++) {


	if (i % j == 0) {
	P++;
	break;
	}
	}
	if (P == 0)
	System.out.println(i);
	}

	}
}

