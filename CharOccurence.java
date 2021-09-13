package week2.day1;

import java.util.Iterator;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =0;
		
		String str="Welcome To Chennai";
		
		char[] charr = str.toCharArray();
		for(int i=0;i<charr.length;i++)
		{
		
			if (charr[i]=='e')
			{
				count =count+1;
			}
			
		}
		System.out.println("Occurence of e"+" "+count);
	}

}
