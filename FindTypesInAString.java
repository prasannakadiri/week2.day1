package week2.day1;

public class FindTypesInAString {

	public static void main(String[] args) {

		// input String
		String Strtest = "$$ welcome to 2nd class of Automation $$ ";

		// Count of each element

		int lettercount = 0, spacecount = 0, numcount = 0, specialCharcount = 0;

		/*
		 * Convert the string to char array Find each character type and make the count
		 * + print the count
		 */
		char[] charArray1 = Strtest.toCharArray();

		for (int i = 0; i < charArray1.length; i++) {
			if (Character.isLetter(charArray1[i]))
				lettercount++;
			else if (Character.isDigit(charArray1[i]))
				numcount++;
			else if (Character.isSpaceChar(charArray1[i]))
				spacecount++;
			else 
				specialCharcount++;
		}
		//print the count here
		
		System.out.println("No of letters: "+lettercount);
		System.out.println("No of spaces: "+spacecount);
		System.out.println("No of Digits: "+numcount);
		System.out.println("No of Special Charectors: "+ specialCharcount);
	}
}
