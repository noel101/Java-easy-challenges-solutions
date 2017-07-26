package firstdemo;

public class reverseStringRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 String testString="Noel";
	 testString=testString.substring(3);
	 
	 System.out.println(testString);
	 String result=reverse("oooojjjj");
	
	System.out.println(result);

	}
	public static String reverse(String str)
	{
		
	System.out.println(str);
	if ((str==null)||(str. length() <= 1) )
	return str;
	
	System.out.println(str);
	return reverse(str. substring(1)) + str. charAt(0);
	}

}
