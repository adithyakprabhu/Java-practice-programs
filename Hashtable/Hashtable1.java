// Java program to demonstrate
// adding elements to Hashtable

import java.io.*;
import java.util.*;

class AddElementsToHashtable2 {
	public static void main(String args[])
	{
		// No need to mention the
		// Generic type twice
		Hashtable<Double, Character> ht1 = new Hashtable<>(4);

		// Initialization of a Hashtable
		// using Generics
		Hashtable<Double, Character> ht2
			= new Hashtable<Double, Character>(2);

		// Inserting the Elements
		// using put() method
		ht1.put(1.43, 'A');
		ht1.put(2.89, 'B');
		ht1.put(3.65, 'C');

		ht2.put(4.34, 'D');
		ht2.put(5.23, 'E');
		ht2.put(6.90, 'F');


		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
	}
}
