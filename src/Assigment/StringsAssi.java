package Assigment;

public class StringsAssi {
	

	public static void main(String[] args) {
	String S1 = " Selenium Java ";
	String S2 = "Automationefl Java";
	String S3 = "AuToMaTiOn%*&";

	System.out.println(S2.length());// Total no of characters in the string

	System.out.println(S1.equals(S2));// Compare two strings

	System.out.println(S1.equalsIgnoreCase(S2));// This will compare two strings ignoring the case

	System.out.println(S1.startsWith(S2));// Checks whether a string starts with specified characters

	System.out.println(S1.indexOf(S2));// Returns the position of the first found occurrence of specified characters
	// in a string

	System.out.println(S1.charAt(5));// Returns the character at the specified index (position)

	System.out.println(S1.substring(3)); // Returns a new string which is the substring of a specified string

	System.out.println(S1.toUpperCase());//Converts a string to upper case letters
	System.out.println(S2.toUpperCase());
	System.out.println(S3.toUpperCase());


	System.out.println(S1.toLowerCase());//Converts a string to lower case letters
	System.out.println(S2.toLowerCase());
	System.out.println(S3.toLowerCase());

	System.out.println(S1.trim());//Removes whitespace from both ends of a string

	System.out.println(S1.concat(S2)); //Appends a string to the end of another string

	System.out.println(S2.toCharArray()); //Converts this string to a new character array

	System.out.println(S1.replace("e", "a")); //Searches a string for a specified value, and returns a new string where the specified values are replaced

	System.out.println(S3.split(S2));//Splits a string into an array of substrings

	}

	}


