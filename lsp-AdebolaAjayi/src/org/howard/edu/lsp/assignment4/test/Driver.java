package org.howard.edu.lsp.assignment4.test;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;

import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

public class Driver {
	
	public static void main(String[] args) {
		  IntegerSet set1 = new IntegerSet();
		    set1.add(1);
		    set1.add(2);
		    set1.add(3);
		    
		  IntegerSet set2 = new IntegerSet();
		  set2.add(4);
		  set2.add(5);
		  
	      IntegerSet set3 = new IntegerSet();
	      set3.add(1);
	      set3.add(2);
	      set3.add(3);
	      set3.add(4);
	      set3.add(5);
	    
	    System.out.println("Value of Set1 is:" + set1);
	    System.out.println("Value of Set2 is:" + set2);
	    System.out.println("Value of Set2 is:" + set3);
	    
		    try {
				System.out.println("\nSmallest value in Set1 is:" + set1.smallest());
			} catch (IntegerSetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    try {
				System.out.println("\nLargest value in Set1 is:" + set1.largest());
			} catch (IntegerSetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    System.out.println("\nUnion of Set1 and Set2");
		    
		    set1.union(set2);
		        
		        System.out.println("\nResult of union of Set1 and Set2");
		        System.out.println(set1);
		        
		   System.out.println("\nIntersect of Set3 and Set1");
		   set3.intersect(set1);
		   System.out.println("\nResult of intersect of Set3 and Set1");
		   System.out.println(set3);
		   
		   System.out.println("\nDifference of Set3 and Set2");
		   System.out.println(set3);
		   
		   set3.difference(set2);
		   System.out.println("\nResult of difference of Set3 and Set2");
		   System.out.println(set2);
		   System.out.println(set3);
		   
		        set1.clear();
		        set2.clear();
		        set3.clear();
		        
		    
		       
		  }

}
