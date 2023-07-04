

	package learning.java;




	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	import org.testng.annotations.Test;

	public class arraylist {
		
	@Test

	public void listexample () {

	 List<String> colours = new ArrayList<String>();
	 
	  colours.add("Green");
	  colours.add("Blue");
	  colours.add("Violet");
	  colours.add("Green");
	  colours.add("Blue");
	  colours.add("Red");
	  colours.add("White");
		
		System.out.println(colours);

		
	}
	//List OutPut : [Green, Blue, Violet, Green, Blue, Red, White]
	//SET Out Put : [Green, Blue, Violet, Red, White]
	@Test
	public void hashsetlearn() {
	Set<String> colours  = new HashSet<String>();
		
		colours.add("Green");
		colours.add("Blue");
		colours.add("Violet");
		colours.add("Green");
		colours.add("Blue");
		colours.add("Red");
		colours.add("White");
		
		System.out.println(colours);
	}
	 

	}
