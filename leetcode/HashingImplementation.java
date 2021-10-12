package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashingImplementation {
	
	
	private static void travereSeOnSet(int[] data) {
      int i;
      
      /***** Set Object Initialization ************/
      Set<Integer> set=new HashSet<>();
      
      
      for(i=0;i<data.length;i++) {
    	boolean st=set.add(data[i]);
    	System.out.println(data[i]+" "+st);
    	  
      }
      //System.out.println(set);
      
      
      /******* check Object present in Set or not**********/
      
      
      if(set.contains(100)) {
    	  System.out.println("exist");
      }
      else{
    	  
    	  System.out.println("does not exist");
      }
      
      /*********** Traversing 01**************/
      Iterator itr=set.iterator();
      
      while(itr.hasNext()) {
    	  
    	  System.out.println(itr.next());
    	  
      }
      /*************Traversing -02 ***********/
      for(Integer x: set) {
    	  
    	  System.out.println(x);
      }
		
	}

	
	private static void travereSingOnMap(int[] data) {
		
		/******** Map Initialization *************/
		
		Map<Integer,Integer> mp=new HashMap<>();
		
	
		int i;
		for(i=0;i<data.length;i++) {
	     if(mp.containsKey(data[i])) {
	    	
	    	 int cnt=mp.get(data[i]);
	    	 mp.put(data[i],cnt+1);
	    	 
	     }
	     else mp.put(data[i],1);
			
		//mp.put(data[i], mp.getOrDefault(data[i], 0)+1);	
		}
		
		
		/************ travering on keys ***********/
//		
//		for(int key: mp.keySet()) {
//			System.out.println(key);
//		}
//		
		
		
		/************ travering on values ***********/
		
//		for(int val: mp.values()) {
//			System.out.println(val);
//		}
	
		
		for(Map.Entry<Integer,Integer>  entry: mp.entrySet()) {
			System.out.println(entry.getKey() +": "+entry.getValue());
		}
		
		
		
		
		
		
		
		
		System.out.println(mp);
	}
	
	
	public static void main(String[] args) {
	  int[] data= {1,2,1,3,5,6,4,4};	
	 // traverSeOnSet(data);	
	  
	  travereSingOnMap(data); 
	  
	}
}
