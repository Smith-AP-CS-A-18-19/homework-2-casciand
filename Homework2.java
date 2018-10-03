// casciand
/*
 * Andrew Cascio
 */

import java.awt.Rectangle;

public class Homework2 {

	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */
	 	private String name;
		private String one;
		private String three;

		public Homework2(String n) {
			/* This should assign the value that
			 * the parameter (n) has to your instance
			 * variable
			 */
				name = new String("Hello, World!");
}

	/* Write the method upperase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */

public String uppercase() {
		one = name.toUpperCase();
		return one;
}


	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */

public String strip(String str) {
		String two = new String("Good Morning, Dave!");
		String three = two.replaceAll(" ,!", "");
		return three;
		/* replace needs to be called once for each type
		 * of punctuation. Unfortunately, we cannot pass
		 * a list of characters to remove. How you have
		 * written it, the it will search for the String
		 * " ,!" and remove it. Also, these replace
		 * operations should happen on the string str
		 */
}

	/* Fix the errors in the method problem4
	 */

	 public Rectangle problems() {
		 Rectangle r1 = new Rectangle(5, 10, 15, 20);
		 double width = r1.getWidth();
		 Rectangle r2 = new Rectangle(5, 10, 15, 20);
		 r2.translate(15, 25);
		 Rectangle r3 = new Rectangle(5, 10, 15, 20);
		 r3.translate(15, 25);
		 return r3;
}

	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */

	public double getPerimeter(Rectangle rect) {
			Rectangle recta = new Rectangle(5, 10, 20, 30);
			double w = recta.getWidth();
			double h = recta.getHeight();
			double p = (2 * w) + (2 * h);
			return p;
			/* The math is correct here, but once again
			 * we want to do the calculations on the
			 * Rectangle that is passed in, not a new
			 * one that we create
			 */
	}

}
