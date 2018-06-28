package firstdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class Yahoo2Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner sc = new Scanner(System.in);
	        ArrayList<String> mainList= new ArrayList<String>();
	        ArrayList<Players> playerList= new ArrayList<Players>();
	        String s;
	        int i=0;
	        ConcurrentHashMap<Integer, List<String>> tempMap = new ConcurrentHashMap<Integer, List<String>>();
	        ConcurrentHashMap<Integer, Players> resultMap = new ConcurrentHashMap<Integer, Players>();
	        TreeMap<Integer, Players> finalMap =new TreeMap<Integer,Players>(Collections.reverseOrder());
	        while(i<50000000) {
	        	s=sc.next();
	        	if(s.equals("PRINT")) break;
	        	
	        	else mainList.add(s);
	        	
	        	i++;
	        	
	            
	}
	        List<String> list=null;
	        for(int j=0;j<mainList.size();j++){
	        	String temp="";
	        	List<String> tempList;
	        	temp=mainList.get(j);
	        	tempList=Arrays.asList(temp.split("\\s*,\\s*"));
	        	//System.out.println(tempList);
	        	tempMap.put(j, tempList);
	        	
	        }
	        System.out.println("Leaders");
	      //  System.out.println(mainList);
	       // System.out.println(tempMap);
	        
	        for(i=0;i<tempMap.size();i++){
	        	List<String> tempList2;
	        	int tempPoints=0;
	        	tempList2=tempMap.get(i);
	        	Players tempPlayer=new Players();
	        
	        	tempPlayer.setId(Integer.parseInt(tempList2.get(0)));
	        	tempPlayer.setrYards(Integer.parseInt(tempList2.get(1)));
	        	tempPlayer.setpYards(Integer.parseInt(tempList2.get(2)));
	        	tempPlayer.setPassing(Integer.parseInt(tempList2.get(3)));
	        	tempPlayer.setIntercepts(Integer.parseInt(tempList2.get(4)));
	        	tempPoints= (tempPlayer.getrYards()*2)+tempPlayer.getpYards()+(tempPlayer.getPassing()*6)-tempPlayer.getIntercepts();
	        	tempPlayer.setPoints(tempPoints);
	        	resultMap.put(tempPlayer.getPoints(), tempPlayer);
	        }
	        
	      //  System.out.println(mainList);
	       // System.out.println(tempMap);
	       // System.out.println(resultMap);
	        
	        
	      
	       
	        finalMap.putAll(resultMap);
	        System.out.println("FInal map"+finalMap);
	        int count=1;
	        
	        for(Integer key: finalMap.keySet()){
	        	if (count>10) break;
	        	Players tempPlayer2=new Players();
	        	tempPlayer2=finalMap.get(key);
	        	System.out.println(count+","+tempPlayer2.getId()+","+tempPlayer2.getPoints());
	        	count++;
	        }
	      
	        
	        
	}
	  public static class Players{
		 int id;
		 int rYards;
		 int pYards;
		 int passing;
		 int intercepts;
		 int point;
		 
		 public Players(){
			 
		 }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getrYards() {
			return rYards;
		}
		public void setrYards(int rYards) {
			this.rYards = rYards;
		}
		public int getpYards() {
			return pYards;
		}
		public void setpYards(int pYards) {
			this.pYards = pYards;
		}
		public int getPassing() {
			return passing;
		}
		public void setPassing(int passing) {
			this.passing = passing;
		}
		public int getIntercepts() {
			return intercepts;
		}
		public void setIntercepts(int intercepts) {
			this.intercepts = intercepts;
		}
		public int getPoints() {
			return id;
		}
		public void setPoints(int points) {
			this.id = points;
		}
		 
	 }
		 
	 }


