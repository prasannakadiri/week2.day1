package week2.day1;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {

		String str1 = "stops";
		String str2 = "posts";

		boolean chkequalflag = true;

		if (str1.length() == str2.length())

		{

			char[] array1 = str1.toCharArray();
			char[] array2=str2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			chkequalflag=Arrays.equals(array1, array2);
			
			System.out.println("The given strings are anagram");

		}
		else 
			System.out.println("Not anagram");
	}
}
