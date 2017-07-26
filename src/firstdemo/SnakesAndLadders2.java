package firstdemo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SnakesAndLadders2 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		  int testCases=in.nextInt();
		  for(int h=0;h<testCases;h++){
		  int w[][]=new int[101][101];
	      for(int i=1;i<=100;i++){
	      	for(int j=1;j<=100;j++){
	      		if(i!=j &&i<j && Math.abs(j-i)<=6){
	      			w[i][j]=1;
	      		}
	      		else{w[i][j]=20;
	      		} System.out.print(w[i][j]+" ");
	      	} System.out.println();
	      	}
	      
	      // input ladders
	      int ladder=in.nextInt();
	      for(int i=0;i<ladder;i++){
	    	  int x=in.nextInt(),y=in.nextInt();
	        	w[x][y]=0;
	      }
	      
	      // display ladders 
	      for(int i=1;i<=100;i++){
		      	for(int j=1;j<=100;j++){
		      		 System.out.print(w[i][j]+" ");
		      	} System.out.println();
		      	}
	      
	     // input snakes
	      
	      int snake=in.nextInt();
	      int sn[]=new int[snake];
	      for(int i=0;i<snake;i++){
	    	  int x=in.nextInt(),y=in.nextInt();sn[i]=x;					 // only the snake head in sn array.
	    	w[x][y]=0;
	      }
	      
	      // just print 
	      for(int i=1;i<=100;i++){
		      	for(int j=1;j<=100;j++){
		      		
		      		
		      		 System.out.print(w[i][j]+" ");
		      	} System.out.println();
		      	}
	      
	      
	      
	      
	      
	      
	      
	      Arrays.sort(sn);int cnt=0;
	      
	      for(int g=0;g<snake;g++){
	    	  if(g>0 && sn[g]-sn[g-1]==1)
	    	  {++cnt;}
	    	  else{cnt=0;}
	    	  if(cnt>=6){break;}
	    	  }   // for ends
	      
		   Stack <Integer> t=new Stack<Integer>();
	          int src=1,des=100;
	        for(int i=1;i<=100;i++){
	        	if(i!=src){t.push(i);}}  // for ends
	        
	        
	        Stack <Integer> p=new Stack<Integer>();
	        p.push(src);
	          
	        while(!t.isEmpty()){    int min=989997979,loc=-1;
	        for(int i=0;i<t.size();i++){
	        	w[src][t.elementAt(i)]=Math.min(w[src][t.elementAt(i)],w[src][p.peek()]+w[p.peek()][t.elementAt(i)]);
	            if(w[src][t.elementAt(i)]<=min){
	            	min=(int) w[src][t.elementAt(i)];loc=i;}
	        } // for ends
	        
	        p.push(t.elementAt(loc));t.removeElementAt(loc);}  // while ends 
	        
	        
	        for(int i=1;i<=100;i++){
		      	for(int j=1;j<=100;j++){
		      		
		      		
		      		 System.out.print(w[i][j]+" ");
		      	} System.out.println();
		      	}
	          
	          
	           if(cnt>=6){System.out.println("-1");continue;}
	        	
	           if(w[src][des]!=1000000){System.out.println(w[src][des]);}
	        	 else {System.out.println("-1");}
	        
	  }
	
	
		
	}
}
