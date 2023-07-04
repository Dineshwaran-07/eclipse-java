
	package learning.java;



	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.TreeMap;

	import org.testng.annotations.Test;

	public class maplearning {
		
		/*
		 * Map > Interface 
		 * available in the package java.util
		 * Map interface is not under Collections
		 * 
		 * Map contains ( Key , Pair)
		 * 
		 * 
		 * city Zip code
		 * 
		 * zipcode is key y\and city is the value
		 * 
		 * 
		 * HashMap , Tree Map , LinkedHashMap
		 * 
		 * 
		 * Syntax is ;
		 * 
		 * Map<Integer,String> citymapping = new HashMap<Integer,String>
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		@Test
		public void hashMapLearning() {
			
			//Creation 
			
			Map<Integer,String> sub = new HashMap<Integer,String>();
			
			// Storing Data
			
			sub.put(01, "Maths");
			sub.put(02, "Science");
			sub.put(02, "Social");
			sub.put(04, "Maths");
			sub.put(05, "English");
			sub.put(06, null);
			
		System.out.println(sub.get(1));
			
		}	
		
	@Test

	public void treemap() {
		
		Map<Integer,String> cd = new TreeMap <Integer,String>();
		
		
		cd.put(01, "Maths");
		cd.put(02, "Science");
		cd.put(02, "Social");
		cd.put(04, "Maths");
		cd.put(05, "English");
		cd.put(06, null);
	System.out.println(cd);	
	System.out.println(cd.get(01));
	System.out.println(cd.containsKey(2));
	System.out.println(cd.containsValue("Maths"));
	}	
		
	@Test
	public void linkmapexample() {
		
		Map<Integer,String> cd = new LinkedHashMap <Integer,String>();
		
		
		cd.put(01, "Maths");
		cd.put(02, "Science");
		cd.put(02, "Social");
		cd.put(04, "Maths");
		cd.put(05, "English");
		cd.put(06, null);
		
	System.out.println(cd);
		
		}

	}

