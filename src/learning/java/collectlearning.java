
	
package learning.java;


	


	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	import org.testng.annotations.Test;
	/*
	 * 
	 * Array list is a resizeble array which can be found in the java package
	 * 
	 * List(I) > ArrayList(C)
	 * 
	 * ArrayList<String> subjects = new ArrayList<String>();
	 *  * AraryLis<Integer> marks = new ArrayList<Integer>();

	 * int[] car = new array[5];
	 */
	
	public class collectlearning { 
		@Test
		public void arraylistlearning() {
			
			//Array List Creation
			
			ArrayList<Integer> marks = new ArrayList<Integer>();
			
			
			//Data addition to the array
			
			marks.add(57);
			marks.add(100);
			marks.add(89);
			
			System.out.println(marks);
			
			
			//CRUD > Create Read UPDATE Delete
			
			//Read the data 
			
			marks.get(1);
			System.out.println(marks.size());
			
			//Removal of items n the ArrayList
			
			marks.remove(1);
			
			System.out.println(marks);
			
			// To remove all the items from the ArrayList
			
			//marks.clear();
			
			System.out.println(marks.size());
			
			
			// For loop for iteration
			
			for(int i =0;i<marks.size()-1;i++) {
				
				
				System.out.println(marks.get(i));
				
				
				
			}
			
			// For Each loop
			
			
			for(Integer val : marks) {
				
				System.out.println(val);
				
				
			}
			

		}
	

}
