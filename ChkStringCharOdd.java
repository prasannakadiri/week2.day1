package week2.day1;

public class ChkStringCharOdd {
	public static void main(String[] args) {
		String str1="changeme";
		
		char[] charArray = str1.toCharArray();
		for (int i=0;i<charArray.length;i++)
		{
			if (i%2!=0&&i!=0) // odd index 
			{
				char uppercase=Character.toUpperCase(charArray[i]);//converting into uppercase
				System.out.println(uppercase);
			}
			else //even index 
			{
				System.out.println(charArray[i]);//print as it is 
			}
		}
		
	}
	

}
