package firstdemo;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class CheckDefaultValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=null;    // have to be initialized, otherwise throws an error.         
		int i=0;			// have to be initialized, otherwise throws an error.         
		boolean b=false;
		byte bo=45;
		
		 System.out.println(s);
		 System.out.println(i);
		 System.out.println(b);
		 System.out.println(bo);
		 
		 String[] keys= {"1", "2", "3"};
		 String[] values= {"Ram", "Raju", "Vijay"};

		 
	   CheckDefaultValues.generateOutput(keys, values);




	}
	
	static public void generateOutput(String [] keys, String [] values){
		HashMap<String,String> myMap= new HashMap<String,String>();
		for(int i=0;i<keys.length;i++){

		myMap.put(keys[i],values[i]);
		
		int j=i+1;
		System.out.println("Empid:"+keys[i]+" and " +"EmpName:"+myMap.get(keys[i])); 
		}
		
	}

	

}
