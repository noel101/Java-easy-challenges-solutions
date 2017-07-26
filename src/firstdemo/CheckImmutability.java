package firstdemo;

public class CheckImmutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello";
		str=str+'A';
		System.out.println(str);
		str.concat("AAA");
		System.out.println(str);
		str="Help";
		System.out.println(str);
		
		
	        String s1 = "JAVA";
	        System.out.println(s1);
	 
	        String s2 = "JAVA";
	        System.out.println(s2);
	 
	        System.out.println(s1 == s2);         //Output : true
	 
	        s1 = s1 + "J2EE";
	        System.out.println(s1);
	 
	        System.out.println(s1 == s2);         //Output : false
	        
	        String s3 = new String("JAVA");
	        
	        System.out.println(s3);         //Output : JAVA
	 
	        s3.concat("J2EE");
	 
	        System.out.println(s3);  
	        s3=s3+"J2EE";
	        System.out.println(s3); 

	}

}
