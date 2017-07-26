package firstdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RestaurentTypeByFood {

	public static void main(String[] args) {
		
		
		ArrayList<String> res1= new ArrayList<String>();
		ArrayList<String> res2= new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" List one");
		
		for(int i=0; i<3;i++){
			res1.add(i, sc.nextLine());
			
		}
		
		System.out.println(" List two");
		
		for(int i=0; i<3;i++){
			res2.add(i, sc.nextLine());
			
		}
		
		Set<String> set1= new HashSet<String>(res1);
		Set<String> set2= new HashSet<String>(res2);
		
		
		
		
		for(int i=0;i<100;i++) {
		System.out.println("Enter food");
		
		String food=sc.nextLine();
		boolean american=false;
		boolean italian=false;
		if(set1.contains(food)){
			american=true;
		}
		
		if(set2.contains(food)){
			italian=true;
		}
		
		
		
		if(italian&&american){System.out.println("Italian and American");}
		if(italian&&!american){System.out.println("Italian");}
		if(!italian&&american){System.out.println("American");}
		
		}
		
		
		
		

	}

}
