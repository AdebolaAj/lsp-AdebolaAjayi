package org.howard.edu.lsp.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create Combo_Finder object
		Combo_Finder combo = new Combo_Finder ();
        
		// Add numbers to the arraylist
		ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(5);
        integers.add(15);
        integers.add(10);
        int targetSum = 15;
        
        // call the combo_finder method to get the combinations
        ArrayList<ArrayList<Integer>> combinations = combo.combo_finder(integers, targetSum);
        //call the printCombo method to print the combinations.
        combo.printCombo(integers, combinations);

     // Add numbers to the arraylist
        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(1);
        integers2.add(2);
        integers2.add(3);
        integers2.add(4);
        int targetSum2 = 6;
        
     // call the combo_finder method to get the combinations
        ArrayList<ArrayList<Integer>> combinations2 = combo.combo_finder(integers2, targetSum2);
      //call the printCombo method to print the combinations.
        combo.printCombo(integers2, combinations2);
        
     // Add numbers to the arraylist
        ArrayList<Integer> integers3 = new ArrayList<>();
        integers3.add(3);
        integers3.add(2);
        integers3.add(3);
        integers3.add(4);
        int targetSum3 = 6;
        
     // call the combo_finder method to get the combinations
        ArrayList<ArrayList<Integer>> combinations3 = combo.combo_finder(integers3, targetSum3);
      //call the printCombo method to print the combinations.
        combo.printCombo(integers3, combinations3);
        
     // Add numbers to the arraylist
        ArrayList<Integer> integers4 = new ArrayList<>();
        integers4.add(-1);
        integers4.add(0);
        integers4.add(1);
        integers4.add(-2);
        int targetSum4 = 1;
        
     // call the combo_finder method to get the combinations
        ArrayList<ArrayList<Integer>> combinations4 = combo.combo_finder(integers4, targetSum4);
      //call the printCombo method to print the combinations.
        combo.printCombo(integers4, combinations4);
    }
	
	

}


