package week2.day1;

public class LearnString {
	
	/* Non primitive datattype
	Collection of more than 1 charector
	String is a class which has built in methods
	String property is immutable (can not change its original string)
	*/

	public static void main(String[] args) {
		
//create a object for  string
//Mthd 1 using literals (Direct assigning value to a string )
		
		String testString ="welcome to testleaf";
		
//mthd 2 using the new key  word
		
		String teststring1=new String();
		teststring1="Have a great day";
		
		String teststring2=new String("Happy Morning");
		
//Strlenght is String.length()
		// cntrl 2 L
		//cntrl 1
		
		int strlength= testString.length();
		System.out.println("Length is "+ strlength);
		
		
//Find a charector in a String
		//charAt()
		
		char ch1=testString.charAt(0);
		System.out.println("First charactor is " +" "+ ch1);
		
		
//First occurence of the charactor from a string
	
		int charindex=testString.indexOf('f');
		System.out.println("char f index"+" "+charindex);
		
		int lastCharindex=testString.lastIndexOf('f');
		System.out.println("Char f last index" + " "+ lastCharindex);
		
// string to char array conversion
		System.out.println("Strng:"+testString);
		char[] charray1=testString.toCharArray();
		for (int i=0;i<charray1.length;i++)
		{
			System.out.println("charray1["+i+"]:"+charray1[i]);
		}
		
		
//Char array to a string
		
		String Convertuppercase=testString.toUpperCase();
		System.out.println("uppercase:"+Convertuppercase);
		
		String str2 ="AAAAAA";
		String Convertlowercase=str2.toLowerCase();
		System.out.println("Lowercase"+" "+Convertlowercase);
 		
		
//Character conversion
		char lowercase2= Character.toLowerCase('H');
		System.out.println("Lowercase2 char :"+ " "+lowercase2);
		char uppercase2=Character.toUpperCase('a');
		System.out.println("uppercase2 char :"+" "+uppercase2);
//Comparision of strings
		
		String teststring3="Welcome to testleaf";
		String teststring4="Welcome to testleaf";
		
		
		boolean equals=teststring3.equals(teststring4);
		System.out.println("Equals:"+ equals);
		
		boolean equalsignorecase=teststring3.equalsIgnoreCase(teststring4);
		System.out.println("equalsignorecase:"+equalsignorecase);
		
		
		
		
		
	}
	
	

}
