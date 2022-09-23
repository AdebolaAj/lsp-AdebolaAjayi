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
        ArrayList<ArrayList<Integer>> combinations2 = combo.combo_finder(integers, targetSum);
      //call the printCombo method to print the combinations.
        combo.printCombo(integers, combinations);
    }

}


